package com.example.fooddelivery.presentation.onboardingscreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R

@Composable
    @Preview(showSystemUi = true)
fun LogInScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.height(70.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = R.drawable.loginimg),
                contentDescription = null,modifier = Modifier.size(120.dp,120.dp))
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Waves of Food", fontSize = 40.sp, color = colorResource(id = R.color.btn_clr))
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Deliever Favorite Food", fontSize = 14.sp,color = colorResource(id = R.color.btn_clr))
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Login To Your  Account", fontSize = 20.sp,color = colorResource(id = R.color.btn_clr))

        }
        Column(modifier = Modifier.fillMaxWidth()) {


        }

    }
}
