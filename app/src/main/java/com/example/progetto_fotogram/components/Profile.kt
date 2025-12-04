package com.example.progetto_fotogram.components

import android.R.attr.text
import androidx.compose.foundation.Image
import  com.example.progetto_fotogram.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.progetto_fotogram.color_background
import androidx.compose.ui.res.painterResource    // per caricare l'immagine dalle risorse




@Composable
fun Profile() {
    Column(
        modifier = Modifier
            .background(color = color_background)
            .statusBarsPadding()
            .fillMaxSize()

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
        ) {
            Column(
                modifier = Modifier
            ) {
                Image(
        painter = painterResource(R.drawable.senior_cat ),
                    contentDescription = null,
                    modifier = Modifier
                        .size(123.dp)          // dimensione dell'immagine
                        .clip(CircleShape)     // rende l'immagine circolare
                )
            }
            Column (
                modifier = Modifier
                    .padding(start =20.dp) // così metto il padding a sinistra
            ){
                Row (
                    modifier = Modifier
                        .padding(bottom = 15.dp)
                ) {
                    Text(text = "@Debugger_kitty",
                        color= Color.White,
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.Bold,)
                }
                Row ()
                {
                    Column(
                        modifier = Modifier
                            .padding(end= 15.dp)
                    ) {
                        Text(text = "Post", color= Color.White)
                        Text(text = "2", color= Color.White)
                    }
                    Column (
                        modifier = Modifier
                            .padding(end= 15.dp)
                    ){
                        Text(text = "Followers", color= Color.White)
                        Text(text = "104", color= Color.White)
                    }
                    Column (
                        modifier = Modifier
                            .padding(end= 15.dp)
                    ){
                        Text(text = "Following", color= Color.White)
                        Text(text = "2", color= Color.White)
                    }
                }
            }
        }
    }
}

// stato  Text(text = "pippo_is_what_they_call_meow", color= Color.White)