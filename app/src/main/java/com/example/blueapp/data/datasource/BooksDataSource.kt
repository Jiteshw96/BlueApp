package com.example.blueapp.data.datasource

import com.example.blueapp.R
import com.example.blueapp.data.model.Book
import com.example.blueapp.data.model.Genre

object BooksDataSource {


    private val fictionBooks = listOf(
        Book(
            name = "The Great Gatsby",
            image = R.drawable.ic_launcher_background,
            author = "F. Scott Fitzgerald",
            genre = "Fiction"
        ),
        Book(
            name = "To Kill a Mockingbird",
            image = R.drawable.ic_launcher_background,
            author = "Harper Lee",
            genre = "Fiction"
        ),
        Book(
            name = "1984",
            image = R.drawable.ic_launcher_background,
            author = "George Orwell",
            genre = "Fiction"
        ),
        Book(
            name = "The Catcher in the Rye",
            image = R.drawable.ic_launcher_background,
            author = "J.D. Salinger",
            genre = "Fiction"
        ),
        Book(
            name = "Pride and Prejudice",
            image = R.drawable.ic_launcher_background,
            author = "Jane Austen",
            genre = "Fiction"
        ),
        Book(
            name = "The Road",
            image = R.drawable.ic_launcher_background,
            author = "Cormac McCarthy",
            genre = "Fiction"
        ),
        Book(
            name = "Beloved",
            image = R.drawable.ic_launcher_background,
            author = "Toni Morrison",
            genre = "Fiction"
        )
    )

    private val scienceFictionBooks = listOf(
        Book(
            name = "Dune",
            image = R.drawable.ic_launcher_background,
            author = "Frank Herbert",
            genre = "Science Fiction"
        ),
        Book(
            name = "Foundation",
            image = R.drawable.ic_launcher_background,
            author = "Isaac Asimov",
            genre = "Science Fiction"
        ),
        Book(
            name = "Neuromancer",
            image = R.drawable.ic_launcher_background,
            author = "William Gibson",
            genre = "Science Fiction"
        ),
        Book(
            name = "Snow Crash",
            image = R.drawable.ic_launcher_background,
            author = "Neal Stephenson",
            genre = "Science Fiction"
        ),
        Book(
            name = "The Left Hand of Darkness",
            image = R.drawable.ic_launcher_background,
            author = "Ursula K. Le Guin",
            genre = "Science Fiction"
        ),
        Book(
            name = "Hyperion",
            image = R.drawable.ic_launcher_background,
            author = "Dan Simmons",
            genre = "Science Fiction"
        ),
        Book(
            name = "The War of the Worlds",
            image = R.drawable.ic_launcher_background,
            author = "H.G. Wells",
            genre = "Science Fiction"
        )
    )

    private val fantasyBooks = listOf(
        Book(
            name = "The Hobbit",
            image = R.drawable.ic_launcher_background,
            author = "J.R.R. Tolkien",
            genre = "Fantasy"
        ),
        Book(
            name = "Harry Potter and the Sorcerer's Stone",
            image = R.drawable.ic_launcher_background,
            author = "J.K. Rowling",
            genre = "Fantasy"
        ),
        Book(
            name = "The Name of the Wind",
            image = R.drawable.ic_launcher_background,
            author = "Patrick Rothfuss",
            genre = "Fantasy"
        ),
        Book(
            name = "Mistborn",
            image = R.drawable.ic_launcher_background,
            author = "Brandon Sanderson",
            genre = "Fantasy"
        ),
        Book(
            name = "The Way of Kings",
            image = R.drawable.ic_launcher_background,
            author = "Brandon Sanderson",
            genre = "Fantasy"
        ),
        Book(
            name = "A Game of Thrones",
            image = R.drawable.ic_launcher_background,
            author = "George R.R. Martin",
            genre = "Fantasy"
        ),
        Book(
            name = "The Lies of Locke Lamora",
            image = R.drawable.ic_launcher_background,
            author = "Scott Lynch",
            genre = "Fantasy"
        ),
        Book(
            name = "The Blade Itself",
            image = R.drawable.ic_launcher_background,
            author = "Joe Abercrombie",
            genre = "Fantasy"
        )
    )

    private val mysteryBooks = listOf(
        Book(
            name = "The Da Vinci Code",
            image = R.drawable.ic_launcher_background,
            author = "Dan Brown",
            genre = "Mystery"
        ),
        Book(
            name = "Gone Girl",
            image = R.drawable.ic_launcher_background,
            author = "Gillian Flynn",
            genre = "Mystery"
        ),
        Book(
            name = "The Girl with the Dragon Tattoo",
            image = R.drawable.ic_launcher_background,
            author = "Stieg Larsson",
            genre = "Mystery"
        ),
        Book(
            name = "Big Little Lies",
            image = R.drawable.ic_launcher_background,
            author = "Liane Moriarty",
            genre = "Mystery"
        ),
        Book(
            name = "Sharp Objects",
            image = R.drawable.ic_launcher_background,
            author = "Gillian Flynn",
            genre = "Mystery"
        ),
        Book(
            name = "In the Woods",
            image = R.drawable.ic_launcher_background,
            author = "Tana French",
            genre = "Mystery"
        ),
        Book(
            name = "The Silent Patient",
            image = R.drawable.ic_launcher_background,
            author = "Alex Michaelides",
            genre = "Mystery"
        ),
        Book(
            name = "The Woman in the Window",
            image = R.drawable.ic_launcher_background,
            author = "A.J. Finn",
            genre = "Mystery"
        )
    )

    private val nonFictionBooks = listOf(
        Book(
            name = "Sapiens: A Brief History of Humankind",
            image = R.drawable.ic_launcher_background,
            author = "Yuval Noah Harari",
            genre = "Non-Fiction"
        ),
        Book(
            name = "Educated",
            image = R.drawable.ic_launcher_background,
            author = "Tara Westover",
            genre = "Non-Fiction"
        ),
        Book(
            name = "The Immortal Life of Henrietta Lacks",
            image = R.drawable.ic_launcher_background,
            author = "Rebecca Skloot",
            genre = "Non-Fiction"
        ),
        Book(
            name = "Becoming",
            image = R.drawable.ic_launcher_background,
            author = "Michelle Obama",
            genre = "Non-Fiction"
        ),
        Book(
            name = "The Wright Brothers",
            image = R.drawable.ic_launcher_background,
            author = "David McCullough",
            genre = "Non-Fiction"
        ),
        Book(
            name = "Unbroken",
            image = R.drawable.ic_launcher_background,
            author = "Laura Hillenbrand",
            genre = "Non-Fiction"
        ),
        Book(
            name = "Quiet: The Power of Introverts",
            image = R.drawable.ic_launcher_background,
            author = "Susan Cain",
            genre = "Non-Fiction"
        )
    )

    private val horrorBooks = listOf(
        Book(
            name = "The Shining",
            image = R.drawable.ic_launcher_background,
            author = "Stephen King",
            genre = "Horror"
        ),
        Book(
            name = "Dracula",
            image = R.drawable.ic_launcher_background,
            author = "Bram Stoker",
            genre = "Horror"
        ),
        Book(
            name = "Frankenstein",
            image = R.drawable.ic_launcher_background,
            author = "Mary Shelley",
            genre = "Horror"
        ),
        Book(
            name = "Bird Box",
            image = R.drawable.ic_launcher_background,
            author = "Josh Malerman",
            genre = "Horror"
        ),
        Book(
            name = "The Haunting of Hill House",
            image = R.drawable.ic_launcher_background,
            author = "Shirley Jackson",
            genre = "Horror"
        ),
        Book(
            name = "It",
            image = R.drawable.ic_launcher_background,
            author = "Stephen King",
            genre = "Horror"
        ),
        Book(
            name = "The Exorcist",
            image = R.drawable.ic_launcher_background,
            author = "William Peter Blatty",
            genre = "Horror"
        )
    )


    val genreList = listOf(
        Genre(genreName = "Fiction",coverImage = R.drawable.ic_launcher_background, books = fictionBooks),
        Genre(genreName = "Science Fiction",coverImage = R.drawable.ic_launcher_background, books = scienceFictionBooks),
        Genre(genreName = "Fantasy",coverImage = R.drawable.ic_launcher_background, books = fantasyBooks),
        Genre(genreName = "Mystery",coverImage = R.drawable.ic_launcher_background, books = mysteryBooks),
        Genre(genreName = "Non-Fiction",coverImage = R.drawable.ic_launcher_background, books = nonFictionBooks),
        Genre(genreName = "Horror",coverImage = R.drawable.ic_launcher_background, books = horrorBooks)
    )
}