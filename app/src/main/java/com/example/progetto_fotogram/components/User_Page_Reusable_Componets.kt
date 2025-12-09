package com.example.progetto_fotogram.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import com.example.progetto_fotogram.R
import com.example.progetto_fotogram.color_background
import com.example.progetto_fotogram.color_name_text
import com.example.progetto_fotogram.transparency

@Composable
fun User_Information(
    Img_id : Int,
    User_name: String,
    Number_Post : Int,
    Number_Follower: Int,
    Number_Following: Int,
) {
    Column(
        modifier = Modifier
            .background(color = color_background)
            .statusBarsPadding()
            .fillMaxSize()
            .padding(top = 20.dp)

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp)
                .padding(end = 10.dp)
        ) {
            Column(
                modifier = Modifier
            ) {
                Image(
                    painter = painterResource(Img_id),
                    contentDescription = null,
                    modifier = Modifier
                        .size(123.dp)          // dimensione dell'immagine
                        .clip(CircleShape)     // rende l'immagine circolare
                )
            }
            Column(
                modifier = Modifier
                    .padding(top = 15.dp)
                    .padding(start = 15.dp) // così metto il padding a sinistra
            ) {
                Row(
                    modifier = Modifier
                        .padding(bottom = 20.dp)
                ) {
                    Text(
                        text = User_name,
                        color = Color.White,
                        fontSize = 25.sp,
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.Bold
                    )
                }
                Row()
                {
                    Column(
                        modifier = Modifier
                            .padding(end = 10.dp)
                    ) {
                        Text(
                            text = "Post",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 19.sp
                        )
                        Text(
                            text = "$Number_Post",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )
                    }
                    Column(
                        modifier = Modifier
                            .padding(end = 15.dp)
                    ) {
                        Text(
                            text = "$Number_Follower",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 19.sp
                        )
                        Text(
                            text = "104",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )
                    }
                    Column(
                        modifier = Modifier
                            .padding(end = 15.dp)
                    ) {
                        Text(
                            text = "$Number_Following",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 19.sp
                        )
                        Text(
                            text = "2",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Dob_Bio_User (
    date_of_birth : String,
    bio: String
) {
    Column(
        modifier = Modifier
            .padding(top = 20.dp)
            .padding(start = 15.dp)
            .padding(end = 10.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(bottom = 13.dp)
        ) {
            Text(
                text = date_of_birth,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }
        Row(
            modifier = Modifier
                .padding(bottom = 20.dp)
        ) {
            Text(
                text = bio,
                color = Color.White,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }
    }
}
@Composable
fun Grid_Post (
    User_name: String,
    Img_id_1: Int,
    Img_id_2 : Int,
    Img_id_3 : Int
){

}