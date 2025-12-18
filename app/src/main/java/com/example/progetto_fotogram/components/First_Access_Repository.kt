package com.example.progetto_fotogram.components

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import kotlinx.coroutines.flow.first

class First_AccessRepository (private val dataStore: DataStore<Preferences>) {
    private companion object {
        val ACCESS = booleanPreferencesKey("access")
    }
    suspend fun getAccess() : Boolean? {
        val prefs = dataStore.data.first()
        return prefs[ACCESS] ?: true
    }
    suspend fun setAccess(first_access: Boolean?) {
        dataStore.edit { preferences ->
            preferences[ACCESS] = first_access == true
        }
    }
}