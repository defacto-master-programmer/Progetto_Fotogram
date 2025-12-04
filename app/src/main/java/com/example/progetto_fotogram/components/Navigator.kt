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

@Composable
fun Navigator(
    modifier: Modifier

) {
    var currentScreen by remember { mutableStateOf(Screen_position.Homescreen) }
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

                Row(
                    modifier = Modifier
                        .background(color_background)
                        .fillMaxWidth()
                        .padding(vertical = 30.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(
                        onClick = { currentScreen = Screen_position.Homescreen },
                        modifier = androidx.compose.ui.Modifier
                            .height(50.dp),
                        shape = RoundedCornerShape(0.dp),
                        border = BorderStroke(2.dp, color_name_text),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6200EE)) // viola moderno
                    ) {
                        Text("Home", fontSize = 20.sp, color = Color.White)
                    }
                    Button(
                        onClick = { currentScreen = Screen_position.New_Post },
                        modifier = androidx.compose.ui.Modifier
                            .height(50.dp),
                        shape = RoundedCornerShape(0.dp),
                        border = BorderStroke(2.dp, color_name_text),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6200EE)) // viola moderno
                    ) {
                        Text("New Post", fontSize = 20.sp, color = Color.White)
                    }
                    Button(
                        onClick = { currentScreen = Screen_position.Profile },
                        modifier = androidx.compose.ui.Modifier
                            .height(50.dp),
                        shape = RoundedCornerShape(0.dp),
                        border = BorderStroke(2.dp, color_name_text),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6200EE)) // viola moderno
                    ) {
                        Text("Profile", fontSize = 20.sp, color = Color.White)
                    }
                }
            }
        ) { innerPadding ->

            Column(
                modifier = Modifier
                    .padding(innerPadding)
            ) {
                when (currentScreen) {
                    Screen_position.Homescreen -> Homescreen()

                    Screen_position.Profile -> Profile()

                    Screen_position.New_Post -> New_Post()
                    else -> {}
                }
            }
        }
    }
}