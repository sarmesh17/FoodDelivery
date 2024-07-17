package com.example.fooddelivery.presentation.fooddetail

import androidx.compose.foundation.Image
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
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R

@Preview(showSystemUi = true)
@Composable
fun FoodDetail() {
    val popFontFamily = FontFamily(
        Font(R.font.yeonsung_regular, FontWeight.Normal)
    )

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 100.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row (modifier = Modifier.fillMaxWidth()){
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.outline_arrow_circle_left_24),
                    contentDescription = "left arrow",
                    tint = colorResource(id = R.color.orange))
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
            Image(painter = painterResource(id = R.drawable.menu_photo),
                contentDescription = "menu photo",
                modifier = Modifier.size(320.dp,220.dp)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        //For text discription
        Box (
            modifier = Modifier.size(320.dp,100.dp),
        ){
            Column {
                /*val annotatedText = buildAnnotatedString {
                    pushStyle(SpanStyle(fontSize = 20.sp, fontFamily = popFontFamily))
                    append("Short description \n")
                    pop()

                    pushStyle(SpanStyle(fontSize = 14.sp))
                    append("Lorem ipsum dolor sit amet, \n" +"consectetur adipiscing elit, \n" +"sed do eiusmod tempor incididunt \n" +"ut labore et dolore magna aliqua. Ut enim ad ihade  ")
                    pop()
                }
                Text(text = annotatedText)*/
                Text(text = "Short description",fontSize = 20.sp, fontFamily = popFontFamily)
                Text(text = "Lorem ipsum dolor sit amet, \n" +"consectetur adipiscing elit, \n" +"sed do eiusmod tempor incididunt \n" +"ut labore et dolore magna aliqua. Ut enim ad ihade  ")

            }
        }
        Box (
            modifier = Modifier.size(320.dp,250.dp),
            contentAlignment = Alignment.TopStart
        ){

            Column (modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "Menu",
                    fontSize = 20.sp,
                    fontFamily = popFontFamily
                )
                Row (verticalAlignment = Alignment.CenterVertically){
                    Text(text = "•", fontSize = 20.sp)
                    Text(text = "Noodle",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 8.dp))
                    Spacer(modifier = Modifier.weight(1f))
                    TextButton(onClick = { /*TODO*/ }) {
                        Text(
                            text = "See Details",
                            color = colorResource(id = R.color.DarkRed)
                        )
                    }
                    Icon(
                        painter = painterResource(id = R.drawable.rounded_select_check_box_24),
                        contentDescription = "select box"
                    )
                }

                Row (verticalAlignment = Alignment.CenterVertically){
                    Text(text = "•", fontSize = 20.sp)
                    Text(text = "Salad",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 8.dp))
                    Spacer(modifier = Modifier.weight(1f))
                    TextButton(onClick = { /*TODO*/ }) {
                        Text(text = "See Details", color = colorResource(id = R.color.DarkRed))
                    }
                    Icon(painter = painterResource(id = R.drawable.rounded_select_check_box_24), contentDescription = "select box")
                }

                Row (verticalAlignment = Alignment.CenterVertically){
                    Text(text = "•", fontSize = 20.sp)
                    Text(text = "Burger",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 8.dp))
                    Spacer(modifier = Modifier.weight(1f))
                    TextButton(onClick = { /*TODO*/ }) {
                        Text(text = "See Details", color = colorResource(id = R.color.DarkRed))
                    }
                    Icon(painter = painterResource(id = R.drawable.rounded_select_check_box_24), contentDescription = "select box")
                }

                Row (verticalAlignment = Alignment.CenterVertically){
                    Text(text = "•", fontSize = 20.sp)
                    Text(text = "Herbal Pan Cake",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 8.dp))
                    Spacer(modifier = Modifier.weight(1f))
                    TextButton(onClick = { /*TODO*/ }) {
                        Text(text = "See Details", color = colorResource(id = R.color.DarkRed))
                    }
                    Icon(painter = painterResource(id = R.drawable.rounded_select_check_box_24), contentDescription = "select box")
                }

                Row (verticalAlignment = Alignment.CenterVertically){
                    Text(text = "•", fontSize = 20.sp)
                    Text(text = "Momo",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 8.dp))
                    Spacer(modifier = Modifier.weight(1f))
                    TextButton(onClick = { /*TODO*/ }) {
                        Text(text = "See Details", color = colorResource(id = R.color.DarkRed))
                    }
                    Icon(painter = painterResource(id = R.drawable.rounded_select_check_box_24), contentDescription = "select box")
                }
            }
        }
    }
}