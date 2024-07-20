package com.example.fooddelivery

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fooddelivery.domain.usecase.app_entry_usecase.all_use_case.AppEntryUseCases
import com.example.fooddelivery.util.Routes
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(appEntryUseCases: AppEntryUseCases): ViewModel() {

     var startDestination by mutableStateOf<Routes>(Routes.FirstOnBoardingScreen)


    init {

        viewModelScope.launch {

         appEntryUseCases.readAppEntry().onEach { appEntryStatus ->

             startDestination = if (appEntryStatus){

                 Routes.LoginScreen

             }else{

                 Routes.FirstOnBoardingScreen

             }

         }.launchIn(viewModelScope)

        }
    }


}