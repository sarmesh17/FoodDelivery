package com.example.fooddelivery.presentation.FeedBackScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R

@Composable
fun FeedBackScreen() {

    val popFontFamily = FontFamily(Font(R.font.yeonsung))

    Column(
        modifier = Modifier.fillMaxSize().padding(start = 16.dp),
    ) {

        Row(modifier = Modifier.padding(top = 20.dp), verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.arrowcircleleft),
                contentDescription = null,
                Modifier.size(30.dp, 30.dp)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = "Write your FeedBack Here",
                modifier = Modifier,
                fontSize = 20.sp,
                fontFamily = popFontFamily,
                color = colorResource(id = R.color.btn_clr)
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        Card(
            modifier = Modifier
                .height(200.dp)
                .width(350.dp),
            shape = RoundedCornerShape(8.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(12.dp)
        ) {

            Text(
                text = "Short description ",
                modifier = Modifier.padding(start = 20.dp, top = 20.dp),
                fontSize = 20.sp,
                fontFamily = popFontFamily,
                color = colorResource(id = R.color.btn_clr)
            )
            Text(
                text = "Lorem ipsum dolor sit amet," +
                        "consectetur adipiscing elit," +
                        "sed do eiusmod tempor incididunt" +
                        "ut labore et dolore magna aliqua. Ut enim ad",
                modifier = Modifier.padding(20.dp),
                fontSize = 20.sp,
                color = colorResource(id = R.color.btn_clr)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { TODO() },
            modifier = Modifier.fillMaxWidth().padding(horizontal = 65.dp).height(57.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.btn_clr))
        ) {
            Text(text = "Send", fontFamily = popFontFamily, fontSize = 16.sp)
        }


    }

}