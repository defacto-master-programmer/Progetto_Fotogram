package com.example.progetto_fotogram.model

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import kotlinx.coroutines.flow.first
import kotlin.collections.get

data class User(
    val id: String,
    val createdAt: String,
    val username: String,
    val bio: String,
    val followersCount: Int
)

class Repository_User(private val dataStore: DataStore<Preferences>) {
    private companion object {
        /*  val USER_ID = IntPreferenceKey(1)
        val users = listOf<User>(
            User(
                id = 1,
                createdAt = "17/06/2025",
                username = "@Matisse",
                bio = "...",
                followersCount = 3,
            ),
            User(
                id = 2,
                createdAt = "17/06/2025",
                username = "@Commit_kitty",
                bio = "...",
                followersCount = 3,
            ),
        )
    }

    suspend fun getUser(userId: Int) -> User {
        val prefs = dataStore.data.first()
        return prefs[USER_ID] ?: 1
    }
}*/
    }
}