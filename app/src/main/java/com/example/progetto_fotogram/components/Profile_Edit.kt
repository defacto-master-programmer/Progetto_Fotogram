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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
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
fun Profile_Edit(
    modifier: Modifier = Modifier,
    onProfilescreen_Click: () -> Unit
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
            .padding(top = 15.dp)
    ) {
        Row() {
            IconButton(
                onClick = { onProfilescreen_Click() },
                modifier = androidx.compose.ui.Modifier
                    .padding(start = 5.dp, bottom=10.dp),
                shape = RoundedCornerShape(0.dp),
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Indietro",
                    tint= color_name_text,
                    modifier = Modifier
                        .size(40.dp)
                )

            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp)
                .padding(bottom = 20.dp)
        ) {
            Text(
                text = "Edit your profile:",
                modifier = modifier,
                color = title_noteworthy,
                fontSize = 35.sp,
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Bold,


                )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .padding(bottom = 4.dp) // spazio tra label e TextField
            ) {
                Text(
                    text = "username:",
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
                    placeholder = { Text("Write something...", color = Color(0xFFBE97C5)) },
                    readOnly = true
                )


            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .padding(bottom = 4.dp) // spazio tra label e TextField
            ) {
                Text(
                    text = "profile picture:",
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
                    placeholder = { Text("Write something...", color = Color(0xFFBE97C5)) },
                    readOnly = true
                )


            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .padding(bottom = 4.dp) // spazio tra label e TextField
            ) {
                Text(
                    text = "date of birth:",
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
                    placeholder = { Text("Upload new picture...", color = Color(0xFFBE97C5)) },
                    readOnly = true
                )


            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .padding(bottom = 4.dp) // spazio tra label e TextField
            ) {
                Text(
                    text = "bio:",
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
                    placeholder = { Text("Write something...", color = Color(0xFFBE97C5)) },
                    readOnly = true
                )


            }
        }
        Row(
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
                .padding(start = 10.dp),
            horizontalArrangement = Arrangement.Center,
        ) {
            Button(
                onClick = { onProfilescreen_Click() },
                modifier = androidx.compose.ui.Modifier
                    .padding(horizontal = 40.dp),
                shape = RoundedCornerShape(0.dp),
                border = BorderStroke(2.dp, color_name_text),
                colors = ButtonDefaults.buttonColors(containerColor = transparency) // viola moderno
            ) {
                Text(
                    "Save",
                    fontSize = 30.sp,
                    color = color_name_text,
                    fontWeight = FontWeight.ExtraBold
                )
            }
        }
    }
}