package com.example.blueapp.data.repository

import com.example.blueapp.data.datasource.BooksDataSource
import com.example.blueapp.data.model.Book
import com.example.blueapp.data.model.Genre
import com.example.blueapp.domain.repository.BooksRepository

class BooksRepositoryImp() : BooksRepository {

    override suspend fun fetchBooksCatalogue(): List<Genre> {
            return BooksDataSource.genreList
    }
}