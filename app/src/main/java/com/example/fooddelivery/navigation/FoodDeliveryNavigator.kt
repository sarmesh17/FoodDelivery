package com.example.fooddelivery.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fooddelivery.presentation.bottomnavigation.BottomNavigation
import com.example.fooddelivery.presentation.onboardingscreens.OnBoardingScreen1
import com.example.fooddelivery.presentation.onboardingscreens.OnBordingScreen2
import com.example.fooddelivery.util.Routes

@Composable
fun FoodDeliveryNavigation(){
    
    val navController= rememberNavController()
    Scaffold(
      bottomBar = {
          
          BottomNavigation()
      }  
    ) {
        Modifier.padding(it)
        NavHost(navController = navController, startDestination = Routes.FirstOnBoardingScreen) {

            composable<Routes.FirstOnBoardingScreen> {
                OnBoardingScreen1()
            }

            composable<Routes.SecondOnBoardingScreen> {
                OnBordingScreen2()
            }

            composable<Routes.HomeScreen> {

            }

            
        }
        
    }
    
}