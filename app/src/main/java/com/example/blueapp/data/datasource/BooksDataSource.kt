package com.example.blueapp.data.datasource

import com.example.blueapp.R
import com.example.blueapp.data.model.Book
import com.example.blueapp.data.model.Genre

object BooksDataSource {


    private val fictionBooks = listOf(
        Book(
            name = "The Great Gatsby",
            imageUrl = "https://example.com/gatsby.jpg",
            author = "F. Scott Fitzgerald",
            genre = "Fiction"
        ),
        Book(
            name = "To Kill a Mockingbird",
            imageUrl = "https://example.com/mockingbird.jpg",
            author = "Harper Lee",
            genre = "Fiction"
        ),
        Book(
            name = "1984",
            imageUrl = "https://example.com/1984.jpg",
            author = "George Orwell",
            genre = "Fiction"
        ),
        Book(
            name = "The Catcher in the Rye",
            imageUrl = "https://example.com/catcher.jpg",
            author = "J.D. Salinger",
            genre = "Fiction"
        ),
        Book(
            name = "Pride and Prejudice",
            imageUrl = "https://example.com/pride.jpg",
            author = "Jane Austen",
            genre = "Fiction"
        ),
        Book(
            name = "The Road",
            imageUrl = "https://example.com/road.jpg",
            author = "Cormac McCarthy",
            genre = "Fiction"
        ),
        Book(
            name = "Beloved",
            imageUrl = "https://example.com/beloved.jpg",
            author = "Toni Morrison",
            genre = "Fiction"
        )
    )

    private val scienceFictionBooks = listOf(
        Book(
            name = "Dune",
            imageUrl = "https://example.com/dune.jpg",
            author = "Frank Herbert",
            genre = "Science Fiction"
        ),
        Book(
            name = "Foundation",
            imageUrl = "https://example.com/foundation.jpg",
            author = "Isaac Asimov",
            genre = "Science Fiction"
        ),
        Book(
            name = "Neuromancer",
            imageUrl = "https://example.com/neuromancer.jpg",
            author = "William Gibson",
            genre = "Science Fiction"
        ),
        Book(
            name = "Snow Crash",
            imageUrl = "https://example.com/snowcrash.jpg",
            author = "Neal Stephenson",
            genre = "Science Fiction"
        ),
        Book(
            name = "The Left Hand of Darkness",
            imageUrl = "https://example.com/lefthand.jpg",
            author = "Ursula K. Le Guin",
            genre = "Science Fiction"
        ),
        Book(
            name = "Hyperion",
            imageUrl = "https://example.com/hyperion.jpg",
            author = "Dan Simmons",
            genre = "Science Fiction"
        ),
        Book(
            name = "The War of the Worlds",
            imageUrl = "https://example.com/warworlds.jpg",
            author = "H.G. Wells",
            genre = "Science Fiction"
        )
    )

    private val fantasyBooks = listOf(
        Book(
            name = "The Hobbit",
            imageUrl = "https://example.com/hobbit.jpg",
            author = "J.R.R. Tolkien",
            genre = "Fantasy"
        ),
        Book(
            name = "Harry Potter and the Sorcerer's Stone",
            imageUrl = "https://example.com/harrypotter.jpg",
            author = "J.K. Rowling",
            genre = "Fantasy"
        ),
        Book(
            name = "The Name of the Wind",
            imageUrl = "https://example.com/nameofthewind.jpg",
            author = "Patrick Rothfuss",
            genre = "Fantasy"
        ),
        Book(
            name = "Mistborn",
            imageUrl = "https://example.com/mistborn.jpg",
            author = "Brandon Sanderson",
            genre = "Fantasy"
        ),
        Book(
            name = "The Way of Kings",
            imageUrl = "https://example.com/wayofkings.jpg",
            author = "Brandon Sanderson",
            genre = "Fantasy"
        ),
        Book(
            name = "A Game of Thrones",
            imageUrl = "https://example.com/gameofthrones.jpg",
            author = "George R.R. Martin",
            genre = "Fantasy"
        ),
        Book(
            name = "The Lies of Locke Lamora",
            imageUrl = "https://example.com/lockelamora.jpg",
            author = "Scott Lynch",
            genre = "Fantasy"
        ),
        Book(
            name = "The Blade Itself",
            imageUrl = "https://example.com/bladeitself.jpg",
            author = "Joe Abercrombie",
            genre = "Fantasy"
        )
    )

    private val mysteryBooks = listOf(
        Book(
            name = "The Da Vinci Code",
            imageUrl = "https://example.com/davinci.jpg",
            author = "Dan Brown",
            genre = "Mystery"
        ),
        Book(
            name = "Gone Girl",
            imageUrl = "https://example.com/gonegirl.jpg",
            author = "Gillian Flynn",
            genre = "Mystery"
        ),
        Book(
            name = "The Girl with the Dragon Tattoo",
            imageUrl = "https://example.com/dragontattoo.jpg",
            author = "Stieg Larsson",
            genre = "Mystery"
        ),
        Book(
            name = "Big Little Lies",
            imageUrl = "https://example.com/biglittlelies.jpg",
            author = "Liane Moriarty",
            genre = "Mystery"
        ),
        Book(
            name = "Sharp Objects",
            imageUrl = "https://example.com/sharpobjects.jpg",
            author = "Gillian Flynn",
            genre = "Mystery"
        ),
        Book(
            name = "In the Woods",
            imageUrl = "https://example.com/inthewoods.jpg",
            author = "Tana French",
            genre = "Mystery"
        ),
        Book(
            name = "The Silent Patient",
            imageUrl = "https://example.com/silentpatient.jpg",
            author = "Alex Michaelides",
            genre = "Mystery"
        ),
        Book(
            name = "The Woman in the Window",
            imageUrl = "https://example.com/womaninwindow.jpg",
            author = "A.J. Finn",
            genre = "Mystery"
        )
    )

    private val nonFictionBooks = listOf(
        Book(
            name = "Sapiens: A Brief History of Humankind",
            imageUrl = "https://example.com/sapiens.jpg",
            author = "Yuval Noah Harari",
            genre = "Non-Fiction"
        ),
        Book(
            name = "Educated",
            imageUrl = "https://example.com/educated.jpg",
            author = "Tara Westover",
            genre = "Non-Fiction"
        ),
        Book(
            name = "The Immortal Life of Henrietta Lacks",
            imageUrl = "https://example.com/henrietta.jpg",
            author = "Rebecca Skloot",
            genre = "Non-Fiction"
        ),
        Book(
            name = "Becoming",
            imageUrl = "https://example.com/becoming.jpg",
            author = "Michelle Obama",
            genre = "Non-Fiction"
        ),
        Book(
            name = "The Wright Brothers",
            imageUrl = "https://example.com/wrightbrothers.jpg",
            author = "David McCullough",
            genre = "Non-Fiction"
        ),
        Book(
            name = "Unbroken",
            imageUrl = "https://example.com/unbroken.jpg",
            author = "Laura Hillenbrand",
            genre = "Non-Fiction"
        ),
        Book(
            name = "Quiet: The Power of Introverts",
            imageUrl = "https://example.com/quiet.jpg",
            author = "Susan Cain",
            genre = "Non-Fiction"
        )
    )

    private val horrorBooks = listOf(
        Book(
            name = "The Shining",
            imageUrl = "https://example.com/shining.jpg",
            author = "Stephen King",
            genre = "Horror"
        ),
        Book(
            name = "Dracula",
            imageUrl = "https://example.com/dracula.jpg",
            author = "Bram Stoker",
            genre = "Horror"
        ),
        Book(
            name = "Frankenstein",
            imageUrl = "https://example.com/frankenstein.jpg",
            author = "Mary Shelley",
            genre = "Horror"
        ),
        Book(
            name = "Bird Box",
            imageUrl = "https://example.com/birdbox.jpg",
            author = "Josh Malerman",
            genre = "Horror"
        ),
        Book(
            name = "The Haunting of Hill House",
            imageUrl = "https://example.com/hillhouse.jpg",
            author = "Shirley Jackson",
            genre = "Horror"
        ),
        Book(
            name = "It",
            imageUrl = "https://example.com/it.jpg",
            author = "Stephen King",
            genre = "Horror"
        ),
        Book(
            name = "The Exorcist",
            imageUrl = "https://example.com/exorcist.jpg",
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