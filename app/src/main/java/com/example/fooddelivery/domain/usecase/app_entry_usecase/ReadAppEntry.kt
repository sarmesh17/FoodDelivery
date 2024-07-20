package com.example.fooddelivery.domain.usecase.app_entry_usecase

import com.example.fooddelivery.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(private val localUserManager: LocalUserManager) {

    suspend operator fun invoke ():Flow<Boolean>{

        return localUserManager.readAppEntry()

    }
}