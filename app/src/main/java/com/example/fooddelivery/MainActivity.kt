package com.example.fooddelivery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.fooddelivery.navigation.FoodDeliveryNavigation
import com.example.fooddelivery.presentation.loginscreen.LogInScreen
import com.example.fooddelivery.presentation.signupscreen.SignupScreen
import com.example.fooddelivery.ui.theme.FoodDeliveryTheme
import com.example.fooddelivery.viewmodels.LoginScreenViewModel
import com.example.fooddelivery.viewmodels.SignupViewModel
import com.google.firebase.FirebaseApp

class MainActivity : ComponentActivity() {


    private val mainViewModel:MainViewModel by viewModels()
    private  val signupViewModel: SignupViewModel by viewModels()
    private  val loginScreenViewModel: LoginScreenViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodDeliveryTheme {

                    FirebaseApp.initializeApp(this)
                       val startDestination=mainViewModel.startDestination
                       FoodDeliveryNavigation(startDestination)
                }
            }
        }
    }


