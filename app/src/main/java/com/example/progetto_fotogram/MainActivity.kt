package com.example.progetto_fotogram
import androidx.compose.runtime.*
import android.R.attr.text
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
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.progetto_fotogram.ui.theme.ProgettoFotogramTheme


val color_background = Color(0xFF1F1B24)
val color_name_text=  Color(0xFFBB86FC)


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProgettoFotogramTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
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
                color = Color(0xFFFFFFFF),
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
            .padding(bottom = 4.dp),
            horizontalArrangement = Arrangement.Center,
        ) {
            Button(
                onClick = { },
                modifier = androidx.compose.ui.Modifier
                .padding(horizontal = 40.dp),
                shape = RoundedCornerShape(0.dp),
                border = BorderStroke(2.dp, color_name_text),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6200EE)) // viola moderno
            ) {
                Text("Create an account", fontSize = 23.sp, color = Color.White)
            }
        }
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProgettoFotogramTheme {
        Greeting("Android")
    }
}