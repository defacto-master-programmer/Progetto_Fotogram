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
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.room.Room
import com.example.progetto_fotogram.components.First_AccessRepository
import com.example.progetto_fotogram.components.Navigator
import com.example.progetto_fotogram.components.Registration
import com.example.progetto_fotogram.ui.theme.ProgettoFotogramTheme
import kotlinx.coroutines.launch
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
private val Context.First_AccessDataStore by preferencesDataStore(name = "access")
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val first_access_DataStore = applicationContext.First_AccessDataStore
        val first_accessRepository = First_AccessRepository(first_access_DataStore)
        val viewModel = AppViewModel(first_accessRepository)
       /* val database = Room.databaseBuilder(
            application,
            AppDatabase::class.java,
            "data-database"
        ).build() */2
        enableEdgeToEdge()
        setContent {
            ProgettoFotogramTheme {
                var first_access by remember { mutableStateOf(true) }
                First_Access(
                    appViewModel= viewModel,
                    modifier = Modifier
                    .background(color_background),
                    first_access= first_access,
                      onFirstAccessChange = { viewModel.retrieveAccess()}

                )
            }
        }
    }
}

class AppViewModel(private val first_accessRepository: First_AccessRepository) : ViewModel() {
    var first_access: Boolean? by mutableStateOf(null)

    // Handle business logic
    fun retrieveAccess() {
        viewModelScope.launch {
            first_access = first_accessRepository.getAccess()
            if (first_access == true) {
                storeAccess(false)
            }
        }
    }

    fun storeAccess(new_access: Boolean) {
        viewModelScope.launch {
            first_accessRepository.setAccess(new_access)
        }
    }
}
@Composable
fun First_Access(
    appViewModel: AppViewModel,
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