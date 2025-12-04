package com.example.progetto_fotogram

import androidx.compose.runtime.*
import android.R.attr.text
import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.datastore.preferences.preferencesDataStore
import com.example.progetto_fotogram.components.Homescreen
import com.example.progetto_fotogram.components.Navigator
import com.example.progetto_fotogram.components.Registration
import com.example.progetto_fotogram.ui.theme.ProgettoFotogramTheme
import kotlin.Unit


private val Context.AccessDataStore by preferencesDataStore(name = "access")
val color_background = Color(0xFF1F1B24)
val color_name_text = Color(0xFFBB86FC)


enum class Screen_position {
    Registration,
    Homescreen,
    Profile,
    New_Post
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