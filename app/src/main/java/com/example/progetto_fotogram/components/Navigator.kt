package com.example.progetto_fotogram.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.progetto_fotogram.Screen_position
import com.example.progetto_fotogram.color_background
import com.example.progetto_fotogram.color_name_text
import com.example.progetto_fotogram.color_navbar


@Composable
fun Navigator(
    modifier: Modifier

) {
    var currentScreen by remember { mutableStateOf(Screen_position.Homescreen) }
    var selectedImage by remember { mutableStateOf<Int?>(null) }
    var selectedUser by remember { mutableStateOf<String?>(null)}
    val screens_without_navbar = listOf(
        Screen_position.Profile_Edit,
        Screen_position.New_Post,
        Screen_position.ImageFullScreen,
        Screen_position.Map_Position,
        Screen_position.User_Profile_Screen
    )
    Box(
        modifier = Modifier
            .background(color = color_background)
            .statusBarsPadding()
            .fillMaxSize()
    ) {
        Scaffold(
            modifier = modifier
                .background(color_background)
                .fillMaxSize(),
            bottomBar = {
                if (currentScreen !in screens_without_navbar) { // se non combacia con nessuno degli elementi della lista
                    Row(
                        modifier = Modifier
                            .background(color_background)
                            .fillMaxWidth()
                            .padding(vertical = 30.dp)
                            .padding(start = 0.dp)
                            .padding(end = 0.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Button(
                            onClick = { currentScreen = Screen_position.Homescreen },
                            modifier = androidx.compose.ui.Modifier
                                .weight(1f) // Ogni bottone occupa uguale spazio
                                .height(50.dp),
                            shape = RoundedCornerShape(0.dp),
                            border = BorderStroke(2.dp, color_name_text),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(
                                    0xFF6200EE
                                )
                            ) // viola moderno
                        ) {
                            Text("Home", fontSize = 20.sp, color = Color.White)
                        }
                        Button(
                            onClick = { currentScreen = Screen_position.New_Post },
                            modifier = androidx.compose.ui.Modifier
                                .weight(1f) // Ogni bottone occupa uguale spazio
                                .height(50.dp),
                            shape = RoundedCornerShape(0.dp),
                            border = BorderStroke(2.dp, color_name_text),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(
                                    0xFF6200EE
                                )
                            ) // viola moderno
                        ) {
                            Text("New Post", fontSize = 20.sp, color = Color.White)
                        }
                        Button(
                            onClick = { currentScreen = Screen_position.Profile },
                            modifier = androidx.compose.ui.Modifier
                                .weight(1f) // Ogni bottone occupa uguale spazio
                                .height(50.dp),
                            shape = RoundedCornerShape(0.dp),
                            border = BorderStroke(2.dp, color_name_text),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = color_navbar
                            ) // viola moderno
                        ) {
                            Text("Profile", fontSize = 20.sp, color = Color.White)
                        }
                    }
                }
            }
        ) { innerPadding ->

            Column(
                modifier = Modifier
                    .background(color_background)
                    .padding(innerPadding)
            ) {
                when (currentScreen) {
                    Screen_position.Homescreen -> Homescreen(
                        onImage_Click = { img ->
                            selectedImage = img
                            currentScreen = Screen_position.ImageFullScreen
                        },
                        onUser_Profile_Click=  { user_name ->
                            selectedUser = user_name
                            currentScreen= Screen_position.User_Profile_Screen

                        }
                    )

                    Screen_position.Profile -> Profile(
                        onEditscreen_Click = {
                            currentScreen = Screen_position.Profile_Edit
                        }
                    )

                    Screen_position.Profile_Edit -> Profile_Edit(
                        onProfilescreen_Click = {
                            currentScreen = Screen_position.Profile
                        }
                    )

                    Screen_position.New_Post -> New_Post(
                        onHomescreen_Click = {
                            currentScreen = Screen_position.Homescreen
                        }
                    )

                    Screen_position.ImageFullScreen -> {
                        selectedImage?.let {
                            ImageFullScreen(
                                imgId = it,
                                onBackClick = {
                                    currentScreen = Screen_position.Homescreen
                                }
                            )
                        }
                    }
                    Screen_position.User_Profile_Screen-> {
                        selectedUser?.let {
                            User_Profile_Screen(
                                User_name = it,
                                onBack_Click = {
                                    currentScreen = Screen_position.Homescreen
                                }
                            )
                        }
                    }
                    else -> {}
                }
            }
        }
    }
}
