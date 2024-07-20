package com.example.fooddelivery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import com.example.fooddelivery.presentation.signupscreen.SignupScreen
import com.example.fooddelivery.ui.theme.FoodDeliveryTheme
import com.example.fooddelivery.viewmodels.SignupViewModel
import com.google.firebase.FirebaseApp

class MainActivity : ComponentActivity() {

    private  val signupViewModel: SignupViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodDeliveryTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Modifier.padding(innerPadding)
                    FirebaseApp.initializeApp(this)

                    SignupScreen(signupViewModel = signupViewModel)


                }
            }
        }
    }
}

