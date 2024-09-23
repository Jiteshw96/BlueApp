package com.example.blueapp.presentation.ui.books

import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.blueapp.presentation.activity.BooksViewModel
import com.example.blueapp.presentation.components.BlueAppLoader
import com.example.blueapp.presentation.components.BottomSheetInsightsView
import com.example.blueapp.presentation.components.FloatingButton
import com.example.blueapp.presentation.components.GenreList
import com.example.blueapp.presentation.components.NoDataFound


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BooksScreen(
    booksViewModel: BooksViewModel = hiltViewModel<BooksViewModel>()
) {

    val bookScreenState by booksViewModel.booksScreenState.collectAsStateWithLifecycle()

    val bottomScreenState by booksViewModel.bottomSheetState.collectAsStateWithLifecycle()

    val filterList by booksViewModel.filterResult.collectAsStateWithLifecycle()

    var showBottomSheet by rememberSaveable { mutableStateOf(false) }

    val modalBottomSheetState = rememberModalBottomSheetState()

    val pagerState = rememberPagerState(initialPage = 0,
        pageCount = {
            booksViewModel.getGenreListData().count()
        })

    LaunchedEffect(pagerState) {
        snapshotFlow { pagerState.currentPage }.collect { page ->
            booksViewModel.searchQuery.value = ""
        }
    }

    val booksList by remember {
        derivedStateOf {
            if (booksViewModel.searchQuery.value.isNotEmpty()) {
                filterList
            } else {
                booksViewModel?.getBooksInsightsData(pagerState.currentPage) ?: emptyList()
            }
        }
    }


    LaunchedEffect(key1 = Unit) {
        booksViewModel.fetchBooks()
    }


    Scaffold(
        floatingActionButton = {
            FloatingButton {

            }
        },
        floatingActionButtonPosition = FabPosition.End
    ) { inset ->

        when {
            !bookScreenState.genreList.isNullOrEmpty() -> {
                GenreList(
                    genreList = bookScreenState.genreList ?: emptyList(),
                    booksList = booksList,
                    searchQuery = booksViewModel.searchQuery.value,
                    padding = inset,
                    pagerState = pagerState
                ) { query ->

                    booksViewModel.searchQuery.value = ""
                    booksViewModel.fetchFilteredResults(
                        pagerState.currentPage,
                        query
                    )
                }
            }

            bookScreenState.genreList?.isEmpty() == true -> {
                NoDataFound()
            }

            bookScreenState.isPageLoading -> {
                BlueAppLoader()
            }
        }

        if (showBottomSheet) {
            BottomSheetInsightsView(
                bottomSheetDetailsState = bottomScreenState,
                onDismiss = {
                    showBottomSheet = false
                },
                modalState = modalBottomSheetState
            )
        }
    }
}
