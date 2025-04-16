package com.example.lazycolumn.ui.model.navigation

import com.example.lazycolumn.ui.model.BookModel

sealed class Navigation {
    object Main : Navigation()
    data class Detail(val data: Int) : Navigation()
}