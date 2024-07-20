package com.example.fooddelivery.presentation.onpayout

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toSize
import com.example.fooddelivery.R

@Preview(showSystemUi = true)
@Composable
fun PayOut() {
    var textOne by remember {
        mutableStateOf("")
    }
    var textTwo by remember {
        mutableStateOf("")
    }
    var textThree by remember {
        mutableStateOf("")
    }
    val popFontFamily = FontFamily(
        Font(R.font.yeonsung_regular, FontWeight.Normal)
    )
    var expanded by remember {
        mutableStateOf(false)
    }
    val list = listOf("Credit Card", "Debit Card", "Cash on Delivery")
    var selectedItem by remember { mutableStateOf("Payment Method") }

    var textFieldSize by remember {
        mutableStateOf(androidx.compose.ui.geometry.Size.Zero)
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
        //.padding(top = 43.dp),
        ,horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.outline_arrow_circle_left_24),
                    contentDescription = "left arrow",
                    tint = colorResource(id = R.color.orange)
                )
            }
        }
        Box{
            Text(
                text = "Edit",
                fontSize = 24.sp,
                fontWeight = FontWeight(400),
                fontFamily = popFontFamily,
                color = Color.Red
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Card (
            modifier = Modifier.size(330.dp,60.dp),
            colors = CardDefaults.cardColors(colorResource(id = R.color.whitee))
        ){
            Row(
                modifier = Modifier.size(330.dp,60.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier
                        .weight(1f)
                        .padding(5.dp),
                    text = "Name",
                    fontSize = 20.sp,
                    fontWeight = FontWeight(400),
                    fontFamily = popFontFamily,
                )
                Spacer(modifier = Modifier.width(8.dp))
                Box (modifier = Modifier.weight(3f)) {
                    if (textOne.isEmpty()) {
                        Text(
                            text = "Lorem mm mmm",
                            style = TextStyle(color = Color.Gray)
                        )
                    }
                    BasicTextField(
                        value = textOne,
                        onValueChange = { textOne = it },
                    )
                }
                Icon(
                    modifier = Modifier.padding(5.dp),
                    painter = painterResource(id = R.drawable.rounded_edit_square_24),
                    contentDescription = "edit icon"
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))

        Card (
            modifier = Modifier.size(330.dp,100.dp),
            colors = CardDefaults.cardColors(colorResource(id = R.color.whitee))
        ){
            Row(
                modifier = Modifier.size(330.dp,100.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        modifier = Modifier
                            .weight(1f)
                            .padding(5.dp)
                            .padding(top = 10.dp),
                        text = "Address",
                        fontSize = 20.sp,
                        fontWeight = FontWeight(400),
                        fontFamily = popFontFamily,
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Box (modifier = Modifier.weight(3f)) {
                    if (textTwo.isEmpty()) {
                        Text(
                            text = "Lorem ipsum is placeholder text \n" +
                                    "commonly used in the graphic, \n" +
                                    "print, and publishing industries \n" +
                                    "for previewing layouts and visual ",
                            style = TextStyle(color = Color.Gray)
                        )
                    }
                    BasicTextField(
                        value = textTwo,
                        onValueChange = { textTwo = it },
                    )
                }
                Column {
                    Icon(
                        modifier = Modifier
                            .weight(1f)
                            .padding(start = 5.dp, end = 5.dp, bottom = 50.dp),
                        painter = painterResource(id = R.drawable.rounded_edit_square_24),
                        contentDescription = "edit icon"
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(8.dp))

        Card (
            modifier = Modifier.size(330.dp,60.dp),
            colors = CardDefaults.cardColors(colorResource(id = R.color.whitee))
        ){
            Row(
                modifier = Modifier.size(330.dp,60.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier
                        .weight(1f)
                        .padding(5.dp),
                    text = "Phone",
                    fontSize = 20.sp,
                    fontWeight = FontWeight(400),
                    fontFamily = popFontFamily,
                )
                Spacer(modifier = Modifier.width(8.dp))
                Box (modifier = Modifier.weight(3f)) {
                    if (textThree.isEmpty()) {
                        Text(
                            text = "123456789",
                            style = TextStyle(color = Color.Gray)
                        )
                    }
                    BasicTextField(
                        value = textThree,
                        onValueChange = { textThree = it },
                    )
                }
                Icon(
                    modifier = Modifier.padding(5.dp),
                    painter = painterResource(id = R.drawable.rounded_edit_square_24),
                    contentDescription = "edit icon"
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Card (
            modifier = Modifier.size(335.dp,100.dp),
            colors = CardDefaults.cardColors(colorResource(id = R.color.whitee))
        ){
            Row (
                modifier = Modifier.size(335.dp,100.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Column {
                    Button(
                        modifier = Modifier
                            .onGloballyPositioned { coordinates ->
                                textFieldSize = coordinates.size.toSize()
                            },
                        onClick = { expanded = !expanded },
                        colors = ButtonDefaults.buttonColors(colorResource(id = R.color.whitee))
                    ) {
                        Row (verticalAlignment = Alignment.CenterVertically){


                            Text(
                                text = selectedItem,
                                fontSize = 14.sp,
                                fontWeight = FontWeight(400),
                                fontFamily = popFontFamily,
                                color = Color.Black
                            )
                           Spacer(modifier = Modifier.width(4.dp))
                            Icon(imageVector = Icons.Filled.KeyboardArrowDown, contentDescription = null, tint = Color.Black )
                        }
                    }

                    DropdownMenu(
                        expanded = expanded,
                        onDismissRequest = { expanded = false },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        list.forEach { label ->
                            DropdownMenuItem(
                                text = { Text(text = label) },
                                onClick = {
                                    selectedItem = label
                                    expanded = false
                                }
                            )
                        }
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(40.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.size(325.dp,60.dp),
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.white)),
            elevation = ButtonDefaults.buttonElevation(5.dp)
        ) {
            Text(
                text = "Place My Order",
                fontSize = 14.sp,
                fontWeight = FontWeight(400),
                color = Color.Red
            )
        }
    }
}
