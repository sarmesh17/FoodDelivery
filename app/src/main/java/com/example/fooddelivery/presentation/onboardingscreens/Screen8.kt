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
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R

@Composable
@Preview(showSystemUi = true)
fun Screen8() {
    val popFontFamily = FontFamily(Font(R.font.yeonsung))



    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            text = "Hello,  lorem ipsum",
            fontFamily = popFontFamily,
            color = colorResource(id = R.color.btn_clr),
            fontSize = 25.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,

            )
        {
            Text(
                text = "Call For Information",
                modifier = Modifier,
                color = colorResource(id = R.color.btn_clr),
                fontSize = 16.sp,
                fontFamily = popFontFamily
            )
            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = { /*TODO*/ },
                modifier = Modifier.size(350.dp, 55.dp),
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.white))

            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = null, modifier = Modifier.size(70.dp, 65.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = "Mr Kemplas",
                    color = colorResource(id = R.color.btn_clr)
                )
                Text(text = "20 minutes on the way", color = colorResource(id = R.color.teal_700))
            }
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.size(256.dp, 50.dp),
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.white)),
            ) {
                Image(
                    painter = painterResource(id = R.drawable.outline_lock_24), contentDescription = null,
                    modifier = Modifier.size(24.dp, 24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Call", color = Color.Green)

            }

        }
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "")
            }

        }

    }
}