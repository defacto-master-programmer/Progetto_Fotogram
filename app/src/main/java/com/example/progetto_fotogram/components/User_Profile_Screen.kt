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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
fun User_Profile_Screen(
    User_name: String,
    onBack_Click: () -> Unit
) {
    if (User_name == "First_User") {
        Column(
            modifier = Modifier
                .background(color = color_background)
                .statusBarsPadding()
                .fillMaxSize()
                .padding(top = 20.dp)

        ) {
            Row(
                modifier = Modifier,
                horizontalArrangement = Arrangement.Start,
            ) {
                Button(
                    onClick = { onBack_Click() },
                    shape = RoundedCornerShape(0.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = transparency),
                ) {
                    Text(
                        "<",
                        color = color_name_text,
                        fontSize = 23.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                }
            }
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
                        painter = painterResource(R.drawable.mycat),
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
                            text = "@Matisse",
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
                                text = "3",
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
                                text = "Followers",
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
                                text = "Following",
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
                        text = "16/02/1231",
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
                        text = "New intern for Google. Look out when you search me :)",
                        color = Color.White,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                }
            }
            Row(
                modifier = Modifier
                    .padding(10.dp)
                    .padding(bottom = 30.dp)
            ) {
                Button(
                    onClick = { },
                    modifier = androidx.compose.ui.Modifier
                        .weight(1F),
                    shape = RoundedCornerShape(0.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = transparency),
                    border = BorderStroke(2.dp, color = color_name_text)
                ) {
                    Text(
                        "Following",
                        color = color_name_text,
                        fontSize = 25.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                }
            }
            Row() {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.merry_cat),
                        contentDescription = "My cat with a christmas tree",
                        modifier = androidx.compose.ui.Modifier
                            .size(150.dp)
                            .clip(RoundedCornerShape(0.dp)),
                        contentScale = ContentScale.Crop
                    )
                }
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.senior_cat),
                        contentDescription = "Image of my cat",
                        modifier = androidx.compose.ui.Modifier
                            .size(150.dp)
                            .clip(RoundedCornerShape(0.dp)),
                        contentScale = ContentScale.Crop
                    )
                }
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.secret_key),
                        contentDescription = "Secret Key meme",
                        modifier = androidx.compose.ui.Modifier
                            .size(150.dp)
                            .clip(RoundedCornerShape(0.dp)),
                        contentScale = ContentScale.Crop
                    )
                }
            }
        }
    } else {
        Column(
            modifier = Modifier
                .background(color = color_background)
                .statusBarsPadding()
                .fillMaxSize()
                .padding(top = 20.dp)

        ) {
            Row(
                modifier = Modifier,
                horizontalArrangement = Arrangement.Start,
            ) {
                Button(
                    onClick = { onBack_Click() },
                    shape = RoundedCornerShape(0.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = transparency),
                ) {
                    Text(
                        "<",
                        color = color_name_text,
                        fontSize = 23.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                }
            }
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
                        painter = painterResource(R.drawable.normal_dev_cat),
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
                            text = "@Commit_kitty",
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
                                text = "3",
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
                                text = "Followers",
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
                                text = "Following",
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
                        text = "17/05/1231",
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
                        text = ("I'm a cat that loves to writing code without AI. If you wanna find me look in the cloud! "),
                        color = Color.White,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                }
            }
            Row(
                modifier = Modifier
                    .padding(10.dp)
                    .padding(bottom = 30.dp)
            ) {
                Button(
                    onClick = { },
                    modifier = androidx.compose.ui.Modifier
                        .weight(1F),
                    shape = RoundedCornerShape(0.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = transparency),
                    border = BorderStroke(2.dp, color = color_name_text)
                ) {
                    Text(
                        "Follow",
                        color = color_name_text,
                        fontSize = 25.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                }
            }
            Row() {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.senior_cat),
                        contentDescription = "My cat with a christmas tree",
                        modifier = androidx.compose.ui.Modifier
                            .size(150.dp)
                            .clip(RoundedCornerShape(0.dp)),
                        contentScale = ContentScale.Crop
                    )
                }
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.merry_cat),
                        contentDescription = "senior cat",
                        modifier = androidx.compose.ui.Modifier
                            .size(150.dp)
                            .clip(RoundedCornerShape(0.dp)),
                        contentScale = ContentScale.Crop
                    )
                }
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.normal_dev_cat),
                        contentDescription = "Secret Key meme",
                        modifier = androidx.compose.ui.Modifier
                            .size(150.dp)
                            .clip(RoundedCornerShape(0.dp)),
                        contentScale = ContentScale.Crop
                    )
                }
            }
        }

    }
}