package com.example.lazycolumn.ui.model

data class BookModel(
    val name: String,
    val author: String,
    val content: String,
    val category: String
) {
    companion object {
        fun getData(): List<BookModel> {
            return listOf(
                BookModel("1984", "George Orwell", "Dystopian novel about a totalitarian regime.", "Dystopian"),
                BookModel("To Kill a Mockingbird", "Harper Lee", "A story of racial injustice in the Deep South.", "Historical Fiction"),
                BookModel("The Great Gatsby", "F. Scott Fitzgerald", "A critique of the American Dream.", "Classic"),
                BookModel("Moby Dick", "Herman Melville", "A sailor’s narrative of the obsessive quest for a white whale.", "Adventure"),
                BookModel("Pride and Prejudice", "Jane Austen", "Romantic story of manners and misunderstandings.", "Romance"),
                BookModel("Crime and Punishment", "Fyodor Dostoevsky", "A philosophical novel about guilt and redemption.", "Psychological Fiction"),
                BookModel("War and Peace", "Leo Tolstoy", "Epic tale of Russian society during the Napoleonic era.", "Historical Fiction"),
                BookModel("Brave New World", "Aldous Huxley", "A futuristic society controlled by technology and conditioning.", "Science Fiction"),
                BookModel("The Catcher in the Rye", "J.D. Salinger", "Teenage alienation and rebellion.", "Coming-of-Age"),
                BookModel("The Brothers Karamazov", "Fyodor Dostoevsky", "A philosophical drama on faith, doubt, and morality.", "Philosophical Fiction"),
                BookModel("The Hobbit", "J.R.R. Tolkien", "A fantasy adventure preceding The Lord of the Rings.", "Fantasy"),
                BookModel("The Lord of the Rings", "J.R.R. Tolkien", "An epic fantasy trilogy about the struggle between good and evil.", "Fantasy"),
                BookModel("Anna Karenina", "Leo Tolstoy", "A tragic tale of love and society.", "Tragedy"),
                BookModel("Jane Eyre", "Charlotte Brontë", "A woman’s journey toward self-respect and love.", "Gothic Romance"),
                BookModel("Wuthering Heights", "Emily Brontë", "A dark romance of passion and revenge.", "Gothic Fiction"),
                BookModel("Don Quixote", "Miguel de Cervantes", "The adventures of a delusional knight.", "Satire"),
                BookModel("Les Misérables", "Victor Hugo", "Redemption and revolution in 19th century France.", "Historical Fiction"),
                BookModel("The Picture of Dorian Gray", "Oscar Wilde", "A man remains young while his portrait ages.", "Philosophical Fiction"),
                BookModel("Dracula", "Bram Stoker", "The classic vampire tale.", "Horror"),
                BookModel("Frankenstein", "Mary Shelley", "A scientist creates a living monster.", "Science Fiction"),
                BookModel("Fahrenheit 451", "Ray Bradbury", "A society where books are outlawed.", "Dystopian"),
                BookModel("The Stranger", "Albert Camus", "A man’s emotional detachment from the world.", "Existential Fiction"),
                BookModel("The Alchemist", "Paulo Coelho", "A fable about following your dreams.", "Philosophical Fiction"),
                BookModel("The Old Man and the Sea", "Ernest Hemingway", "An aging fisherman’s battle with a giant marlin.", "Adventure"),
                BookModel("One Hundred Years of Solitude", "Gabriel García Márquez", "The magical history of the Buendía family.", "Magical Realism"),
                BookModel("The Metamorphosis", "Franz Kafka", "A man turns into a giant insect.", "Absurdist Fiction"),
                BookModel("A Tale of Two Cities", "Charles Dickens", "A story of sacrifice during the French Revolution.", "Historical Fiction"),
                BookModel("Great Expectations", "Charles Dickens", "The journey of a young orphan named Pip.", "Classic"),
                BookModel("Oliver Twist", "Charles Dickens", "An orphan’s struggle in a cruel society.", "Classic"),
                BookModel("The Divine Comedy", "Dante Alighieri", "A journey through Hell, Purgatory, and Paradise.", "Epic Poetry"),
                BookModel("Hamlet", "William Shakespeare", "A prince’s revenge against his uncle.", "Tragedy"),
                BookModel("Macbeth", "William Shakespeare", "A tale of ambition and murder.", "Tragedy"),
                BookModel("Othello", "William Shakespeare", "Jealousy and betrayal in Venice.", "Tragedy"),
                BookModel("King Lear", "William Shakespeare", "A tragic story of power and madness.", "Tragedy"),
                BookModel("Romeo and Juliet", "William Shakespeare", "The classic tale of star-crossed lovers.", "Romance"),
                BookModel("The Tempest", "William Shakespeare", "A story of magic and forgiveness.", "Fantasy"),
                BookModel("Heart of Darkness", "Joseph Conrad", "A journey into the Congo and the human soul.", "Modernist Fiction"),
                BookModel("The Sun Also Rises", "Ernest Hemingway", "Disillusioned expatriates in post-WWI Europe.", "Modernist Fiction"),
                BookModel("A Farewell to Arms", "Ernest Hemingway", "A love story set during WWI.", "War Fiction"),
                BookModel("Lolita", "Vladimir Nabokov", "A controversial tale of obsession.", "Literary Fiction"),
                BookModel("The Trial", "Franz Kafka", "A man arrested by a mysterious authority.", "Absurdist Fiction"),
                BookModel("Siddhartha", "Hermann Hesse", "A spiritual journey during the time of the Buddha.", "Spiritual Fiction"),
                BookModel("The Sound and the Fury", "William Faulkner", "A Southern family's collapse.", "Modernist Fiction"),
                BookModel("Beloved", "Toni Morrison", "The haunting legacy of slavery.", "Historical Fiction"),
                BookModel("Things Fall Apart", "Chinua Achebe", "The clash between African tradition and colonialism.", "Postcolonial Fiction"),
                BookModel("The Kite Runner", "Khaled Hosseini", "Friendship and redemption in Afghanistan.", "Contemporary Fiction"),
                BookModel("Life of Pi", "Yann Martel", "A boy survives on a lifeboat with a tiger.", "Adventure"),
                BookModel("The Road", "Cormac McCarthy", "A father and son journey through a post-apocalyptic world.", "Post-Apocalyptic"),
                BookModel("Norwegian Wood", "Haruki Murakami", "Love and loss in 1960s Japan.", "Romantic Drama")

            )
        }
    }
}

