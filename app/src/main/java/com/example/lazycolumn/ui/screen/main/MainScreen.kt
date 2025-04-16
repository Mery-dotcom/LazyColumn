package com.example.lazycolumn.ui.screen.main

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lazycolumn.ui.model.BookModel
import com.example.lazycolumn.ui.model.navigation.Navigation

@Composable
fun MainScreen(books: List<BookModel>, nClickItem: (BookModel) -> Unit) {

    val dataList = remember { mutableStateOf(BookModel.getData()) }
    val category = remember { books.map { it.category }.distinct() }

    var selectedCategory by remember { mutableStateOf("All") }
    var searchQuery by remember { mutableStateOf("") }

    val filteredList = books
        .filter { selectedCategory == "All" || it.category == selectedCategory }
        .filter {
            it.name.contains(searchQuery, ignoreCase = true) ||
                    it.author.contains(searchQuery, ignoreCase = true)
        }

    Scaffold { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
        ) {
            Text(
                text = "Main Screen",
                fontSize = 22.sp,
                fontWeight = FontWeight.Companion.W900
            )
        }
        LazyColumn(
            modifier = Modifier
                .fillMaxSize(),
            contentPadding = PaddingValues(vertical = 16.dp, horizontal = 16.dp)
        ) {
            items(filteredList) {
                BookItem(it, onClickItem = { model ->
                    nClickItem(it)
                })
                Spacer(modifier = Modifier.size(12.dp))
            }
        }

        TextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            placeholder = { Text(text = "Search") }
        )

        Spacer(modifier = Modifier.size(8.dp))

        LazyRow(
            modifier = Modifier
                .fillMaxWidth(),
            contentPadding = PaddingValues(vertical = 16.dp)
        ) {
            items(listOf("All") + category) { category ->
                Button(
                    onClick = {
                        selectedCategory = category
                    },
                    modifier = Modifier.padding(end = 8.dp),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text(text = category)
                }
            }
        }
    }
}

@Composable
fun BookItem(model: BookModel, onClickItem: (BookModel) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(12.dp))
            .background(Color.LightGray)
            .clickable {
                onClickItem(model)
            }
            .padding(horizontal = 16.dp, vertical = 6.dp)
    ) {
        Text(
            text = model.name,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = model.author,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = model.content,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
    }
}
