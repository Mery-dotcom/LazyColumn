package com.example.lazycolumn.ui.screen

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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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

@Composable
fun MainScreen() {

    val dataList = remember { mutableStateOf(BookModel.getData()) }

    Scaffold { padding ->
        Column(
            modifier = Modifier.Companion
                .fillMaxSize()
                .padding(padding),
            horizontalAlignment = Alignment.Companion.CenterHorizontally
        ) {
            Text(
                text = "Geeks - Lesson 2",
                fontSize = 22.sp,
                fontWeight = FontWeight.Companion.W900
            )

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize(),
                contentPadding = PaddingValues(vertical = 16.dp, horizontal = 16.dp)
            ) {
                items(dataList.value) {
                    BookItem(it)
                    Spacer(modifier = Modifier.size(12.dp))
                }
            }
        }
    }
}

@Composable
fun BookItem(model: BookModel) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(12.dp))
            .background(Color.LightGray)
            .clickable {

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

@Preview(
    device = Devices.PIXEL_2_XL,
    showBackground = true,
    showSystemUi = true
)

@Composable
fun MainScreen_Preview() {
    MainScreen()
}