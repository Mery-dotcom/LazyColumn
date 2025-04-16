package com.example.lazycolumn.ui.model

data class BookModel(
    val name: String,
    val author: String,
    val content: String
) {
    companion object {
        fun getData(): List<BookModel> {
            return listOf(
                BookModel("1984", "George Orwell", "Dystopian novel about a totalitarian regime."),
                BookModel("To Kill a Mockingbird", "Harper Lee", "A story of racial injustice in the Deep South."),
                BookModel("The Great Gatsby", "F. Scott Fitzgerald", "A critique of the American Dream."),
                BookModel("Moby Dick", "Herman Melville", "A sailor’s narrative of the obsessive quest for a white whale."),
                BookModel("Pride and Prejudice", "Jane Austen", "Romantic story of manners and misunderstandings."),
                BookModel("Crime and Punishment", "Fyodor Dostoevsky", "A philosophical novel about guilt and redemption."),
                BookModel("War and Peace", "Leo Tolstoy", "Epic tale of Russian society during the Napoleonic era."),
                BookModel("Brave New World", "Aldous Huxley", "A futuristic society controlled by technology and conditioning."),
                BookModel("The Catcher in the Rye", "J.D. Salinger", "Teenage alienation and rebellion."),
                BookModel("The Brothers Karamazov", "Fyodor Dostoevsky", "A philosophical drama on faith, doubt, and morality."),
                BookModel("The Hobbit", "J.R.R. Tolkien", "A fantasy adventure preceding The Lord of the Rings."),
                BookModel("The Lord of the Rings", "J.R.R. Tolkien", "An epic fantasy trilogy about the struggle between good and evil."),
                BookModel("Anna Karenina", "Leo Tolstoy", "A tragic tale of love and society."),
                BookModel("Jane Eyre", "Charlotte Brontë", "A woman’s journey toward self-respect and love."),
                BookModel("Wuthering Heights", "Emily Brontë", "A dark romance of passion and revenge."),
                BookModel("Don Quixote", "Miguel de Cervantes", "The adventures of a delusional knight."),
                BookModel("Les Misérables", "Victor Hugo", "Redemption and revolution in 19th century France."),
                BookModel("The Picture of Dorian Gray", "Oscar Wilde", "A man remains young while his portrait ages."),
                BookModel("Dracula", "Bram Stoker", "The classic vampire tale."),
                BookModel("Frankenstein", "Mary Shelley", "A scientist creates a living monster."),
                BookModel("Fahrenheit 451", "Ray Bradbury", "A society where books are outlawed."),
                BookModel("The Stranger", "Albert Camus", "A man’s emotional detachment from the world."),
                BookModel("The Alchemist", "Paulo Coelho", "A fable about following your dreams."),
                BookModel("The Old Man and the Sea", "Ernest Hemingway", "An aging fisherman’s battle with a giant marlin."),
                BookModel("One Hundred Years of Solitude", "Gabriel García Márquez", "The magical history of the Buendía family."),
                BookModel("The Metamorphosis", "Franz Kafka", "A man turns into a giant insect."),
                BookModel("A Tale of Two Cities", "Charles Dickens", "A story of sacrifice during the French Revolution."),
                BookModel("Great Expectations", "Charles Dickens", "The journey of a young orphan named Pip."),
                BookModel("Oliver Twist", "Charles Dickens", "An orphan’s struggle in a cruel society."),
                BookModel("The Divine Comedy", "Dante Alighieri", "A journey through Hell, Purgatory, and Paradise."),
                BookModel("Hamlet", "William Shakespeare", "A prince’s revenge against his uncle."),
                BookModel("Macbeth", "William Shakespeare", "A tale of ambition and murder."),
                BookModel("Othello", "William Shakespeare", "Jealousy and betrayal in Venice."),
                BookModel("King Lear", "William Shakespeare", "A tragic story of power and madness."),
                BookModel("Romeo and Juliet", "William Shakespeare", "The classic tale of star-crossed lovers."),
                BookModel("The Tempest", "William Shakespeare", "A story of magic and forgiveness."),
                BookModel("Heart of Darkness", "Joseph Conrad", "A journey into the Congo and the human soul."),
                BookModel("The Sun Also Rises", "Ernest Hemingway", "Disillusioned expatriates in post-WWI Europe."),
                BookModel("A Farewell to Arms", "Ernest Hemingway", "A love story set during WWI."),
                BookModel("Lolita", "Vladimir Nabokov", "A controversial tale of obsession."),
                BookModel("The Trial", "Franz Kafka", "A man arrested by a mysterious authority."),
                BookModel("Siddhartha", "Hermann Hesse", "A spiritual journey during the time of the Buddha."),
                BookModel("The Sound and the Fury", "William Faulkner", "A Southern family's collapse."),
                BookModel("Beloved", "Toni Morrison", "The haunting legacy of slavery."),
                BookModel("Things Fall Apart", "Chinua Achebe", "The clash between African tradition and colonialism."),
                BookModel("The Kite Runner", "Khaled Hosseini", "Friendship and redemption in Afghanistan."),
                BookModel("Life of Pi", "Yann Martel", "A boy survives on a lifeboat with a tiger."),
                BookModel("The Road", "Cormac McCarthy", "A father and son journey through a post-apocalyptic world."),
                BookModel("Norwegian Wood", "Haruki Murakami", "Love and loss in 1960s Japan.")
            )
        }
    }
}

