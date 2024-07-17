package com.example.fooddelivery.presentation.setlocation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R
import com.example.fooddelivery.R.drawable.outline_arrow_circle_down_24
import com.example.fooddelivery.ui.theme.Lato

@Preview(showSystemUi = true)
@Composable
fun SetLocation() {
    val selectedLocation = remember {
        mutableStateOf("Jaipur")
    }

    val popFontFamily = FontFamily(
        Font(R.font.yeonsung_regular)
    )
    val latoFontFamily = FontFamily(
        Font(R.font.lato_black)
    )

    Column (
        modifier = Modifier.fillMaxSize().padding(top =100.dp ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box (
            modifier = Modifier.fillMaxWidth()
                .padding(start = 25.dp)
                .size(217.dp, 33.dp)
        ){
            Text(
                text = "Choose Your Location ",
                fontSize = 25.sp,
                color = Lato,
                fontFamily = popFontFamily
            )
        }
        Spacer(modifier = Modifier.height(20.dp))

        Box (
            modifier = Modifier
                .background(Color.White, shape = MaterialTheme.shapes.small)
                // .padding(horizontal = 16.dp, vertical = 8.dp)
                .padding(start = 30.dp)
                .fillMaxWidth()
                .size(325.dp, 57.dp)
            ,
            contentAlignment = Alignment.CenterStart
        ){
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = selectedLocation.value,
                    modifier = Modifier.padding(start = 20.dp)

                )
                IconButton(onClick = { /*TODO*/ }, modifier = Modifier.padding(start = 318.dp)) {
                    Icon(painter = painterResource(id = R.drawable.outline_arrow_circle_down_24), contentDescription = "arrow down")
                }
        }
        Spacer(modifier = Modifier.height(200.dp))

        Text(
                text = "To provide you with the best dining experience, we need your permission to access your device's location. By enabling location services, we can offer personalized restaurant recommendations, accurate delivery estimates, and ensure a seamless food delivery experience.\"",
                modifier = Modifier.padding(start = 18.dp),
                fontSize = 16.sp,
                //fontFamily = latoFontFamily
            )
        Spacer(modifier = Modifier.height(200.dp))

        Text(
            text = "Design By \n" +
                "NeatRoots",
            fontSize = 16.sp,
            fontFamily = popFontFamily,
            color = Lato,

        )

        
    }

}