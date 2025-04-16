package com.example.lazycolumn.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainScreen(){

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

            val counterPlus = remember {
                mutableIntStateOf(0)
            }
            Text(
                text = counterPlus.intValue.toString(),
                fontSize = 24.sp,
            )

            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                onClick = {
                    counterPlus.intValue++
                }
            ) {
                Text(
                    text = "++"
                )
            }
        }
    }
}