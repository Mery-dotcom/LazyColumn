package com.example.lazycolumn.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.lazycolumn.ui.model.BookModel
import com.example.lazycolumn.ui.model.navigation.Navigation
import com.example.lazycolumn.ui.screen.detail.DetailScreen
import com.example.lazycolumn.ui.screen.main.MainScreen

@Composable
fun App() {
    var currentNavigation by remember {
        mutableStateOf<Navigation>(Navigation.Main)
    }

    val bookItem = remember {
        BookModel.getData()
    }

    when (val navigation = currentNavigation) {
        is Navigation.Main -> MainScreen { selectBook ->
            val index = bookItem.indexOf(selectBook)
            currentNavigation = Navigation.Detail(index)
        }

        is Navigation.Detail -> {
            val model = bookItem[navigation.data]
            DetailScreen(
                model = model,
                onBack = {
                    currentNavigation = Navigation.Main
                }
            )
        }
    }
}