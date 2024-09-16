package com.example.blueapp.presentation.activity

import androidx.annotation.LayoutRes
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.blueapp.data.model.Book
import com.example.blueapp.domain.usecase.FetchBooksUseCase
import com.example.blueapp.domain.usecase.GetBooksInsightsUseCase
import com.example.blueapp.domain.utils.Resource
import com.example.blueapp.presentation.models.BooksInsights
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BooksViewModel @Inject constructor(
    private val fetchBooksUseCase: FetchBooksUseCase,
    private val getBooksInsightsUseCase: GetBooksInsightsUseCase
) : ViewModel() {

    init {
        setInitialState()
    }

    private val initialState by lazy { setInitialState() }

    private val _booksScreenState = MutableStateFlow(initialState)
    val homeScreenState: StateFlow<BooksScreenState> = _booksScreenState

    private val _filterResult = MutableStateFlow<List<Book>>(emptyList())
    val filterResult = _filterResult

    private fun setInitialState() = BooksScreenState(
        isPageLoading = false,
        isBottomSheetLoading = false,
        genreList = null,
        bottomSheetData = null,
        error = null,
    )


    fun fetchBooks() {
        _booksScreenState.value = _booksScreenState.value.copy(isPageLoading = true)
        viewModelScope.launch {
            val response = fetchBooksUseCase()
            when (response) {
                is Resource.Success -> {
                    _booksScreenState.value = _booksScreenState.value.copy(
                        isPageLoading = false,
                        genreList = response.data,
                        bottomSheetData = null,
                        error = null
                    )
                }

                is Resource.Error -> {
                    _booksScreenState.value = _booksScreenState.value.copy(
                        isPageLoading = false,
                        genreList = null,
                        error = response.message
                    )
                }
            }
        }
    }

    fun getBooksForSelectedGenre(index:Int):List<Book>{
        return _booksScreenState.value.genreList?.get(index)?.books?: emptyList()
    }

    fun getBooksInsightsData(currentIndex: Int) {
        _booksScreenState.value = _booksScreenState.value.copy(isBottomSheetLoading = true)
        viewModelScope.launch {
            try {
                val booksList = _booksScreenState.value.genreList ?: emptyList()
                val result = getBooksInsightsUseCase(
                    index = currentIndex,
                    genreList = booksList,
                )

                _booksScreenState.value = _booksScreenState.value.copy(
                    isBottomSheetLoading = false,
                    bottomSheetData = BooksInsights(booksList.count(), result)
                )
            } catch (exception: Exception) {
                _booksScreenState.value = _booksScreenState.value.copy(isBottomSheetLoading = false)
            }
        }
    }

    @LayoutRes
    fun getGenreListData():List<Int>{
       return _booksScreenState.value.genreList?.map {
            it.coverImage
        }?: emptyList()
    }

    fun getSearchResults(
        currentIndex: Int,
        searchQuery:String
    ){
        viewModelScope.launch {
            val dynamicSearchQuery = ".*$searchQuery.*"
            val regex = Regex(dynamicSearchQuery, RegexOption.IGNORE_CASE)
            val results = if(searchQuery.isNotBlank()){
                _booksScreenState.value.genreList?.get(currentIndex)?.books?.filter {
                    it.name.matches(regex)
                }
            }else{
                getBooksForSelectedGenre(currentIndex)
            }
            _filterResult.emit(results?: emptyList())
        }
    }

}

