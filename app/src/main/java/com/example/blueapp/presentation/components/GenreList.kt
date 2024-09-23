package com.example.blueapp.presentation.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.pager.PagerState
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import com.example.blueapp.R
import com.example.blueapp.data.model.Book
import com.example.blueapp.data.model.Genre
import com.example.blueapp.presentation.theme.LocalCustomColorPalette

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun GenreList(
    genreList: List<Genre>,
    booksList: List<Book>,
    searchQuery: String,
    padding: PaddingValues,
    pagerState: PagerState,
    onSearch: (String) -> Unit
) {

    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp.dp


    LazyColumn(
        modifier = Modifier
            .background(LocalCustomColorPalette.current.screenBackground)
            .padding(
                top = padding.calculateTopPadding(),
                bottom = padding.calculateBottomPadding()
            )
            .padding(
                start = dimensionResource(R.dimen.dp_32),
                end = dimensionResource(R.dimen.dp_32),
                top = dimensionResource(R.dimen.dp_32),
                bottom = dimensionResource(id = R.dimen.dp_0),
            )
            .wrapContentHeight()
    ) {
        item {
            GenreCarousel(
                carouselItems = genreList.map { it.coverImage },
                pagerState = pagerState
            )
        }

        stickyHeader {
            Surface(modifier = Modifier.padding(bottom = dimensionResource(id = R.dimen.dp_8))) {
                SearchInputField(searchQuery = searchQuery) { queryInput ->
                    onSearch(queryInput)
                }
            }
        }

        itemsIndexed(booksList) { index, bookItem ->
            Column(Modifier.padding(vertical = dimensionResource(id = R.dimen.dp_3))) {
                BookItemView(bookItem = bookItem)
            }
        }

    }

}