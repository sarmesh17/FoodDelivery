package com.example.fooddelivery.presentation.onfoodname

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R

@Preview(showSystemUi = true)
@Composable
fun FoodName() {
    val popFontFamily = FontFamily(
        Font(R.font.yeonsung_regular, FontWeight.Normal)
    )
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row(modifier = Modifier.fillMaxWidth()) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.outline_arrow_circle_left_24),
                    contentDescription = "left arrow",
                    tint = colorResource(id = R.color.orange)
                )
            }
        }
        Box {
            Text(
                text = "Restaurant Name",
                fontSize = 24.sp,
                fontWeight = FontWeight(400),
                fontFamily = popFontFamily,
                color = Color.Red
            )
        }
        //For Image
        Spacer(modifier = Modifier.height(10.dp))
        Box {
            Image(painter = painterResource(id = R.drawable.menu_1),
                contentDescription = "menu photo",
                modifier = Modifier.size(320.dp,220.dp)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        //For text discription
        Box (
            modifier = Modifier.size(320.dp,200.dp)
        ){
            Column {
                Text(
                    text = "Short description",
                    fontSize = 20.sp,
                    fontFamily = popFontFamily
                )
                Text(
                    text = "Lorem ipsum dolor sit amet \n consectetur adipiscing elit, \n sed do eiusmod tempor incididunt \n ut labore et dolore magna aliqua. Ut enim ad ihade ",
                    fontSize = 14.sp
                )
                Spacer(modifier = Modifier.height(8.dp))
                Column (verticalArrangement = Arrangement.Center){
                    Text(
                        text = "Ingredients",
                        fontSize = 20.sp,
                        fontFamily = popFontFamily
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Row (verticalAlignment = Alignment.CenterVertically){
                        Text(text = "•", fontSize = 20.sp)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "Strowberry")
                    }
                    Row (verticalAlignment = Alignment.CenterVertically){
                        Text(text = "•", fontSize = 20.sp)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "Cream")
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "•", fontSize = 20.sp)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "wheat")
                    }
                }

            }

        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.size(330.dp,60.dp),
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.Fika))

        ) {
            Text(text = "Add To Cart")
        }


    }
}