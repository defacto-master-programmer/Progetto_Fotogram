package com.example.progetto_fotogram.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.progetto_fotogram.R
import com.example.progetto_fotogram.color_background
import com.example.progetto_fotogram.friend_color
import com.example.progetto_fotogram.non_friend_color

@Composable
fun Homescreen(
    onImage_Click: (Int) -> Unit,
    onUser_Profile_Click: (String) -> Unit
) {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .background(color = color_background)
            .statusBarsPadding()
            .fillMaxSize()
            .verticalScroll(scrollState)

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp, bottom = 5.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_app),
                contentDescription = "Logo app",
                modifier = androidx.compose.ui.Modifier
                    .height(150.dp)
                    .clip(RoundedCornerShape(0.dp)),

                )

        }
        Column(
            modifier = Modifier
                .padding(top = 10.dp)
                .padding(start = 15.dp, end = 15.dp, bottom = 15.dp)
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Text(
                    text = "@Matisse",
                    color = Color.White,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier
                        .testTag("First_User")
                        .clickable {
                            onUser_Profile_Click("First_User")
                    })
                Text(
                    text = "Friend",
                    color = friend_color,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold
                )
            }

            Column(
                modifier = Modifier
                    .padding(bottom = 10.dp, top = 10.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.secret_key),
                    contentDescription = "Secret Key meme",
                    modifier = androidx.compose.ui.Modifier
                        .fillMaxWidth()
                        .size(200.dp)
                        .clip(RoundedCornerShape(0.dp))
                        .clickable {
                            onImage_Click(R.drawable.secret_key)
                        },
                    contentScale = ContentScale.Crop
                )
            }
            Row(
            ) {
                Text(
                    text = "Today is my first day as an intern and they gave me already the keys :) ",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.ExtraBold
                )
            }
        }

        Column(
            modifier = Modifier
                .padding(top = 10.dp)
                .padding(start = 15.dp, end = 15.dp)
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Text(
                    text = "@Commit_kitty",
                    color = Color.White,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier
                        .testTag("Second_User")
                        .clickable {
                            onUser_Profile_Click("Second_User")
                    })
                Text(
                    text = "Follow",
                    color = non_friend_color,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold
                )
            }

            Column(
                modifier = Modifier
                    .padding(bottom = 10.dp, top = 10.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.merry_cat),
                    contentDescription = "Merry cat",
                    modifier = androidx.compose.ui.Modifier
                        .fillMaxWidth()
                        .size(200.dp)
                        .clip(RoundedCornerShape(0.dp))
                        .clickable {
                            onImage_Click(R.drawable.merry_cat)
                        },
                    contentScale = ContentScale.Crop
                )
            }
            Row(
            ) {
                Text(
                    text = "Waiting for CHRSTIMASSSS !!!! ",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.ExtraBold,
                )
            }
        }
    }
}