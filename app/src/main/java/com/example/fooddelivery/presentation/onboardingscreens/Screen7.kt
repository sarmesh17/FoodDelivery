package com.example.fooddelivery.presentation.onboardingscreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R

@Preview(showSystemUi = true)
@Composable

fun screen7() {

    val popFontFamily = FontFamily(Font(R.font.yeonsung))
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {


        Column(
            modifier = Modifier.fillMaxSize(),

            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {

            Text(
                text = " Congrats",
                fontSize = 40.sp,
                color = colorResource(id = R.color.btn_clr),
                fontFamily = popFontFamily
            )
            Text(
                text = "Your Order Placed", fontSize = 40.sp,
                color = colorResource(id = R.color.btn_clr),
                fontFamily = popFontFamily

            )
            Spacer(modifier = Modifier.height(60.dp))
            Image(
                painter = painterResource(id = R.drawable.imgforscreen7),
                contentDescription = null
            )

            Spacer(modifier = Modifier.height(60.dp))

                Button(
                    onClick = { TODO() },
                    modifier = Modifier
                        .height(57.dp)
                        .width(157.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.btn_clr))
                )
                {
                    Text(
                        text = "Go Home",
                        color = Color.White,
                        fontFamily = popFontFamily,
                        fontSize = 20.sp,

                        )


                }


            }
        }
    }


