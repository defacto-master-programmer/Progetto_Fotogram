package com.example.progetto_fotogram

import androidx.compose.runtime.*
import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.datastore.preferences.preferencesDataStore
import com.example.progetto_fotogram.components.Navigator
import com.example.progetto_fotogram.components.Registration
import com.example.progetto_fotogram.ui.theme.ProgettoFotogramTheme
import kotlin.Unit


private val Context.AccessDataStore by preferencesDataStore(name = "access")
val color_background = Color(0xFF1F1B24)
val color_navbar =  Color(0xFF6200EE)
val color_name_text = Color(0xFFBB86FC)
val transparency = Color(0x00FFFFFF)
val title_noteworthy = Color(color = 0xFFFF1769)
val button_noteworthy = Color(color = 0xFF98314F)
val friend_color = Color(color = 0xFF2CDE34)
val non_friend_color = Color(color = 0xFFB7176B)
enum class Screen_position {
    Registration,
    Homescreen,
    Profile,
    New_Post,
    Profile_Edit,
    ImageFullScreen,
    Map_Position,
    User_Profile_Screen
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProgettoFotogramTheme {
                var first_access by remember { mutableStateOf(true) }
                First_Access(
                    modifier = Modifier
                    .background(color_background),
                    first_access= first_access,
                      onFirstAccessChange = { first_access = it}
                )
            }
        }
    }
}


@Composable
fun First_Access(
    modifier : Modifier,
    first_access: Boolean,
    onFirstAccessChange: (Boolean)-> Unit)
{
    when (first_access) {
       true -> Registration (
           onHomescreen_Click ={
              onFirstAccessChange(false)
           }
       )
        false -> Navigator(
            modifier = Modifier
        )
        }

    }




/*
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProgettoFotogramTheme {
        First_Access(modifier = Modifier)
    }
} */