package com.example.lazycolumn.ui.screen.detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.lazycolumn.ui.components.CenterTitleTopAppBar
import com.example.lazycolumn.ui.model.BookModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(model: BookModel, onBack: () -> Unit) {
    CenterTitleTopAppBar(
        title = model.name,
        navigationIcon = Icons.AutoMirrored.Filled.ArrowBack,
        navigationIconClick = {
            onBack()
        }
    )
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = model.name,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = model.author,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = model.content,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
    }
}