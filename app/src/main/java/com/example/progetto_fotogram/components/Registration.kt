package com.example.progetto_fotogram.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.progetto_fotogram.button_noteworthy
import com.example.progetto_fotogram.color_background
import com.example.progetto_fotogram.color_name_text
import com.example.progetto_fotogram.title_noteworthy
import com.example.progetto_fotogram.transparency


@Composable
fun Registration(
    modifier: Modifier = Modifier,
    onHomescreen_Click: () -> Unit
) {
    val textFieldModifier = Modifier
        .fillMaxWidth()
        .height(56.dp)
        .clip(RoundedCornerShape(12.dp))
    Column(
        modifier = Modifier
            .background(color = color_background)
            .statusBarsPadding()
            .fillMaxSize()
            .fillMaxWidth()
            .padding(top = 60.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp)
        ) {
            Text(
                text = "Welcome!",
                modifier = modifier,
                color = title_noteworthy,
                fontSize = 45.sp,
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Bold,


                )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .padding(bottom = 4.dp) // spazio tra label e TextField
            ) {
                Text(
                    text = "Select a username:",
                    color = color_name_text,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                )
                TextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp)
                        .clip(RoundedCornerShape(12.dp)),
                    placeholder = { Text("Scrivi qualcosa...", color = Color(0xFFCFC7D3)) },
                    readOnly = true
                )


            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .padding(bottom = 4.dp) // spazio tra label e TextField
            ) {
                Text(
                    text = "Select an image:",
                    color = color_name_text,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                )
                TextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp)
                        .clip(RoundedCornerShape(12.dp)),
                    placeholder = { Text("Scrivi qualcosa...", color = Color(0xFFCFC7D3)) },
                    readOnly = true
                )


            }
        }
        Row(
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            horizontalArrangement = Arrangement.Center,
        ) {
            Button(
                onClick = { onHomescreen_Click() },
                modifier = androidx.compose.ui.Modifier
                    .padding(horizontal = 40.dp),
                shape = RoundedCornerShape(0.dp),
                border = BorderStroke(2.dp, title_noteworthy),
                colors = ButtonDefaults.buttonColors(containerColor = transparency) // viola moderno
            ) {
                Text(
                    "Create an account",
                    fontSize = 26.sp,
                    color = title_noteworthy,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
