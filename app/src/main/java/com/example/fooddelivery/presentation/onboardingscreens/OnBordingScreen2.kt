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
import androidx.compose.material3.Button
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
fun OnBordingScreen2(){
Column (modifier = Modifier.fillMaxSize())
{
    Column( modifier = Modifier
        .fillMaxWidth()
        .height(500.dp)
        .padding(top = 100.dp),
    verticalArrangement = Arrangement.Center,

    horizontalAlignment = Alignment.CenterHorizontally,) {
        Image(painter = painterResource(id = R.drawable.img2), contentDescription =null,Modifier.size(333.dp,312.dp) )
        Spacer(modifier = Modifier.height(30.dp))
                Text(text = "Enjoy Restaurant Quality Meals \n" +
                      "at Home", color = colorResource(id = R.color.btn_clr), fontSize = 20.sp)
}
    Column(modifier = Modifier.height(400.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = { /*TODO*/ } , modifier = Modifier.size(157.dp,57.dp)) {
        Text(text = "Next", fontSize = 20.sp)
        }
    }
}
}