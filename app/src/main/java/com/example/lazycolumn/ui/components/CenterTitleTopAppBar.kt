package com.example.lazycolumn.ui.components

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CenterTitleTopAppBar(
    title: String,
    navigationIcon: ImageVector,
    navigationIconClick: () -> Unit = {}
) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = title
            )
        },
        navigationIcon = {
            IconButton(
                onClick = {
                    navigationIconClick()
                }
            ) {
                Icon(
                    imageVector = navigationIcon,
                    contentDescription = "arrow back"
                )
            }
        }
    )
}