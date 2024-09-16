package com.example.blueapp.di

import com.example.blueapp.data.datasource.BooksDataSource
import com.example.blueapp.domain.repository.BooksRepository
import com.example.blueapp.domain.usecase.FetchBooksUseCase
import com.example.blueapp.domain.usecase.GetBooksInsightsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.Dispatchers


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun ProvideFetchBooksUseCase(
        booksRepository: BooksRepository
    ):FetchBooksUseCase{
        return FetchBooksUseCase(
            booksRepository = booksRepository
        )
    }

    @Provides
    fun ProvideGetBooksInsightsUseCase():GetBooksInsightsUseCase{
        return GetBooksInsightsUseCase(Dispatchers.Default)
    }
}