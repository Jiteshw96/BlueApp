package com.example.blueapp.domain.usecase

import com.example.blueapp.data.model.Genre
import com.example.blueapp.domain.repository.BooksRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class GetBooksInsightsUseCase(
    private val dispatcher: CoroutineDispatcher = Dispatchers.Default
) {

    suspend operator fun invoke(
        index: Int,
        outputItemsCount: Int = 3,
        genreList: List<Genre>,
    ): List<Pair<Char, Int>> = withContext(dispatcher) {
        val characterCountMap = genreList[index].books
            .flatMap { it ->
                it.name.filterNot { char -> char.isWhitespace() }.toCharArray().toList()
            }
            .groupingBy { it }
            .eachCount()
            .entries
            .sortedByDescending { it.value }
            .take(outputItemsCount)
            .map {
                it.toPair()
            }
        characterCountMap
    }
}