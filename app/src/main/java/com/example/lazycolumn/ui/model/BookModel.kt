package com.example.lazycolumn.ui.model

data class BookModel(
    val name: String,
    val data: String,
    val page: Int
) {
    companion object {
        fun getData(): List<BookModel> {
            return listOf(
                BookModel("1. Android Basics", "Introduction to Android development", 120),
                BookModel("2. Kotlin for Beginners", "Learn Kotlin step by step", 200),
                BookModel("3. Jetpack Compose", "Modern UI toolkit", 180),
                BookModel("4. Architecture Patterns", "MVVM, MVI, Clean Architecture", 220),
                BookModel("5. Room Database", "Persisting data locally", 150),
                BookModel("6. Retrofit Guide", "Networking in Android", 170),
                BookModel("7. Coroutines Explained", "Asynchronous programming in Kotlin", 210),
                BookModel("8. UI/UX Design", "Design principles for mobile apps", 140),
                BookModel("9. Advanced Kotlin", "Kotlin tips and best practices", 250),
                BookModel("10. Testing in Android", "Unit and UI testing", 160),
                BookModel("11. RecyclerView", "Working with lists", 130),
                BookModel("12. Navigation Component", "Navigation between screens", 190),
                BookModel("13. WorkManager", "Background tasks in Android", 155),
                BookModel("14. DataStore", "Modern data storage", 145),
                BookModel("15. LiveData vs StateFlow", "Choosing right observable", 175),
                BookModel("16. Dependency Injection", "Using Koin and Hilt", 200),
                BookModel("17. Android Lifecycle", "Lifecycle-aware components", 120),
                BookModel("18. Animation in Compose", "Making UI interactive", 180),
                BookModel("19. Firebase Crashlytics", "Error monitoring", 160),
                BookModel("20. Google Maps API", "Integrating maps", 190),
                BookModel("21. Authentication", "Login with Firebase", 170),
                BookModel("22. ush Notifications", "Using FCM", 150),
                BookModel("23. App Publishing", "Publishing to Play Store", 110),
                BookModel("24. Performance Optimization", "Speeding up your app", 135),
                BookModel("25. Security Best Practices", "Keeping data safe", 200),
                BookModel("26. Jetpack Libraries", "Useful Android libraries", 185),
                BookModel("27. Build.gradle Guide", "Managing dependencies", 100),
                BookModel("28. Android Studio Shortcuts", "Improve productivity", 90),
                BookModel("29. Custom Views", "Creating your own widgets", 210),
                BookModel("30. Material Design 3", "Modern UI standards", 195),
                BookModel("31. State Management", "Handling app state", 165),
                BookModel("32. ultimodule Project", "Organize large codebase", 175),
                BookModel("33. Bluetooth in Android", "Connecting to devices", 130),
                BookModel("34. Sensors API", "Using device sensors", 140),
                BookModel("35. Accessibility", "Making apps usable for all", 115),
                BookModel("36. Localization", "Multilingual support", 125),
                BookModel("37. Canvas Drawing", "Custom graphics", 155),
                BookModel("38. Compose Navigation", "Jetpack Compose screen navigation", 180),
                BookModel("39. Compose Theming", "Light/Dark theme support", 150),
                BookModel("40. State Hoisting", "Lifting state up", 160),
                BookModel("41. Modifier Deep Dive", "Understanding Compose modifiers", 190),
                BookModel("42. Composable Lifecycle", "Composition and recomposition", 140),
                BookModel("43. In-App Billing", "Monetizing your app", 200),
                BookModel("44. Jetpack Compose Layouts", "Rows, Columns, Boxes", 170),
                BookModel("45. List Pagination", "Paging library", 175),
                BookModel("46. MVVM in Compose", "Architecture pattern", 160),
                BookModel("47. Image Loading", "Using Coil or Glide", 130),
                BookModel("48. Video Streaming", "Using ExoPlayer", 155),
                BookModel("49. App Widgets", "Homescreen widgets", 145),
                BookModel("50. Permissions Handling", "Request runtime permissions", 165),
                BookModel("51. Sensors and Location", "Track movement & location", 190)
            )
        }
    }
}

