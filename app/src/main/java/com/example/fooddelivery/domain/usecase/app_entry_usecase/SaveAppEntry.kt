package com.example.fooddelivery.domain.usecase.app_entry_usecase

import com.example.fooddelivery.domain.manager.LocalUserManager

class SaveAppEntry (private val localUserManager: LocalUserManager){

    suspend operator fun invoke(){

        localUserManager.saveAppEntry()
    }
}