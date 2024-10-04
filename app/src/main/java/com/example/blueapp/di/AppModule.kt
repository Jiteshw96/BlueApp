package com.example.blueapp.di

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
    fun provideFetchBooksUseCase(
        booksRepository: BooksRepository
    ):FetchBooksUseCase{
        return FetchBooksUseCase(
            booksRepository = booksRepository
        )
    }

    @Provides
    fun provideGetBooksInsightsUseCase():GetBooksInsightsUseCase{
        return GetBooksInsightsUseCase(Dispatchers.Default)
    }
}