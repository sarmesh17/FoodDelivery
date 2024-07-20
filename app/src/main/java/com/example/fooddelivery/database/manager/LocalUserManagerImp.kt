package com.example.fooddelivery.database.manager

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.example.fooddelivery.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private val Context.dataStore:DataStore<Preferences> by preferencesDataStore(name="User_setting")
class LocalUserManagerImp(private val context: Context):LocalUserManager {


    override suspend fun saveAppEntry(){
       context.dataStore.edit {
           it[PreferenceKey.App_Entry]=true
       }

    }

    override suspend fun readAppEntry(): Flow<Boolean> {

        return context.dataStore.data.map {
            it[PreferenceKey.App_Entry]?:false
        }
    }
}

private object PreferenceKey{


    val App_Entry= booleanPreferencesKey(name = "appEntry")
}