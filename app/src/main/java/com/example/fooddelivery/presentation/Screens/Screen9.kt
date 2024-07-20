package com.example.fooddelivery.presentation.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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

fun Screen9 () {
    val popFontFamily = FontFamily(Font(R.font.yeonsung))

Column (modifier = Modifier
    .fillMaxWidth()
    .height(280.dp),
    verticalArrangement = Arrangement.Top,
    horizontalAlignment = Alignment.CenterHorizontally)
{
    Text(text = "Hello,  lorem ipsum", modifier = Modifier.padding(top=35.dp), fontSize = 40.sp,
    color = colorResource(id = R.color.btn_clr),
    fontFamily = popFontFamily)
    Spacer(modifier = Modifier.height(50.dp))
    Button(onClick = { /*TODO*/ },
        modifier= Modifier.size(360.dp,60.dp),
        shape = RectangleShape,
        colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.white) ))
    {
        Text(text = "Name",
            fontSize = 40.sp,
            color = colorResource(id = R.color.black),
            fontFamily = popFontFamily)
        Spacer(modifier = Modifier.width(20.dp))
        Text(text = "lorem ipsum", color = colorResource(id = R.color.black))
        Spacer(modifier = Modifier.width(90.dp))
        Image(painter = painterResource(id = R.drawable.editicon),
            contentDescription =null, modifier = Modifier.size(30.dp,40.dp))

       }
    Spacer(modifier = Modifier.height(16.dp))
    Button(onClick = { /*TODO*/ },
        modifier= Modifier.size(360.dp,200.dp),
        shape = RectangleShape,
        colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.white) ))
    {
        Text(text = "Address",
            fontSize = 30.sp,
            color = colorResource(id = R.color.black),
            fontFamily = popFontFamily)
        Spacer(modifier = Modifier.width(4.dp))
        Text(text = "Lorem ipsum is placeholder" +
                " text"+
                "commonly used in the graphic,"+
           "print, and publishing industries"+
           "for previewing layouts and visual"

            , color = colorResource(id = R.color.black), fontSize = 8.sp)
        //Spacer(modifier = Modifier.width(16.dp))
        Image(painter = painterResource(id = R.drawable.editicon),
            contentDescription =null, modifier = Modifier.size(30.dp,40.dp))

    }
    Button(onClick = { /*TODO*/ },
        modifier= Modifier.size(360.dp,60.dp),
        shape = RectangleShape,
        colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.white) ))
    {
        Text(text = "Name",
            fontSize = 40.sp,
            color = colorResource(id = R.color.black),
            fontFamily = popFontFamily)
        Spacer(modifier = Modifier.width(20.dp))
        Text(text = "lorem ipsum", color = colorResource(id = R.color.black))
        Spacer(modifier = Modifier.width(90.dp))
        Image(painter = painterResource(id = R.drawable.editicon),
            contentDescription =null, modifier = Modifier.size(30.dp,40.dp))

    }

      }

  }
