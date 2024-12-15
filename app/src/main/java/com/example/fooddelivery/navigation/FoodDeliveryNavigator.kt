package com.example.fooddelivery.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.DialogNavigator
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fooddelivery.MainViewModel
import com.example.fooddelivery.presentation.bottomnavigation.BottomNavigation
import com.example.fooddelivery.presentation.loginscreen.LogInScreen
import com.example.fooddelivery.presentation.onboardingscreens.OnBoardingScreen1
import com.example.fooddelivery.presentation.onboardingscreens.OnBordingScreen2
import com.example.fooddelivery.util.Routes
import com.example.fooddelivery.viewmodels.LoginScreenViewModel

@Composable
fun FoodDeliveryNavigation(
    startDestination:Routes
){
    
    val navController= rememberNavController()
    Scaffold(
      bottomBar = {
          
          BottomNavigation()
      }  
    ) {
        Modifier.padding(it)
        NavHost(navController = navController, startDestination = startDestination) {

            composable<Routes.FirstOnBoardingScreen> {
                OnBoardingScreen1()
            }

            composable<Routes.SecondOnBoardingScreen> {
                OnBordingScreen2()
            }

            composable<Routes.LoginScreen> {
                val viewModel:LoginScreenViewModel= hiltViewModel()
                LogInScreen(loginScreenViewModel = viewModel )

            }

            
        }
        
    }
    
}