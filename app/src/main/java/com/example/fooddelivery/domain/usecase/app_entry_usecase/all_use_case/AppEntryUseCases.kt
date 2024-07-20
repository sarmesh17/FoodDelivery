package com.example.fooddelivery.domain.usecase.app_entry_usecase.all_use_case

import com.example.fooddelivery.domain.usecase.app_entry_usecase.ReadAppEntry
import com.example.fooddelivery.domain.usecase.app_entry_usecase.SaveAppEntry

data class AppEntryUseCases (

    val saveAppEntry:SaveAppEntry,
    val readAppEntry: ReadAppEntry

)