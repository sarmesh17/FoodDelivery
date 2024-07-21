package com.example.fooddelivery.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R

@Composable
@Preview (showSystemUi = true)
fun Screen10() {
    val popFontFamily = FontFamily(Font(R.font.yeonsung))
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row(modifier = Modifier.padding(top = 15.dp)) {
            Image(
                painter = painterResource(id = R.drawable.arrowcircleleft),
                contentDescription = null,
                Modifier.size(30.dp, 30.dp)
            )
            Spacer(modifier = Modifier.width(80.dp))
            Text(
                text = "Hello,  lorem ipsum",
                modifier = Modifier,
                fontSize = 20.sp,
                fontFamily = popFontFamily,
                color = colorResource(id = R.color.btn_clr)
            )
            Spacer(modifier = Modifier.height(80.dp))
        }
        Row(modifier = Modifier.padding(start = 30.dp)) {
            Image(
                painter = painterResource(id = R.drawable.emoji123),
                contentDescription = null,
                Modifier.size(60.dp, 30.dp)
            )
            Spacer(modifier = Modifier.width(40.dp))
            Text(
                text = "Your order has been Canceled Successfully",
                modifier = Modifier,
                fontSize = 15.sp,
                color = colorResource(id = R.color.btn_clr)
            )
            Spacer(modifier = Modifier.height(80.dp))
        }
        Row(modifier = Modifier.padding(start = 20.dp)) {
            Image(
                painter = painterResource(id = R.drawable.van),
                contentDescription = null,
                Modifier.size(60.dp, 30.dp)
            )
            Spacer(modifier = Modifier.width(30.dp))
            Text(
                text = "Order has been taken by the driver",
                modifier = Modifier,
                fontSize = 15.sp,
                color = colorResource(id = R.color.btn_clr)
            )
        }
        Spacer(modifier = Modifier.height(40.dp))
        Row(modifier = Modifier.padding(start = 10.dp)) {
            Image(
                painter = painterResource(id = R.drawable.iconcircle),
                contentDescription = null,
                Modifier.size(60.dp, 30.dp)
            )
            Spacer(modifier = Modifier.width(30.dp))
            Text(
                text = "Congrats Your Order Placed",
                modifier = Modifier,
                fontSize = 15.sp,
                color = colorResource(id = R.color.btn_clr)
            )

        }
    }
}

