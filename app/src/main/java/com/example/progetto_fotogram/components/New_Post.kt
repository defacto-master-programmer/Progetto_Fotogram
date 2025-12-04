package com.example.progetto_fotogram.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.progetto_fotogram.color_background

@Composable
fun New_Post() {
    Column(
        modifier = Modifier
            .background(color = color_background)
            .statusBarsPadding()
            .fillMaxSize()

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp)
        ) {
            Text(
                text = "Create a new post:",
                color = Color(0xFFFFFFFF),
                fontSize = 45.sp,
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Bold,
            )
        }

    }
}
