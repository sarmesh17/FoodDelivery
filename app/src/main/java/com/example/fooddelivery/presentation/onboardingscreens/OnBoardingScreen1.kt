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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R

@Composable
@Preview(showSystemUi = true)
fun OnBoardingScreen1() {

    Column (modifier = Modifier.fillMaxSize()) {

 
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)
            .padding(top = 80.dp),
        //verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            Modifier.size(185.dp,189.dp)
        )

        Spacer(modifier = Modifier.height(80.dp))
        Text(text = "Waves Of Food", color = colorResource(id = R.color.btn_clr), fontSize = 30.sp)


        Spacer(modifier = Modifier.height(40.dp))
        Text(text = "Deliever Favorite Food" ,color = colorResource(id = R.color.btn_clr))



    }
        Column (  modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)
            .padding(top = 80.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Spacer(modifier = Modifier.height(40.dp))
            Text(text = "Design By \n" +
                    "NeatRoots", color = colorResource(id = R.color.btn_clr))
        }

    }

}
