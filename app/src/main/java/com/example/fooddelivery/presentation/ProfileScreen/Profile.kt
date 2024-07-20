package com.example.fooddelivery.presentation.ProfileScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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

@Composable
@Preview(showSystemUi = true)
fun ProfileScreen() {
    val popFontFamily = FontFamily(Font(R.font.yeonsung))
    var name by remember {
        mutableStateOf("")
    }
    var address by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }
    var phone by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Text(
            text = "Hello,  lorem ipsum",
            modifier = Modifier.padding(top = 15.dp),
            fontSize = 20.sp,
            fontFamily = popFontFamily,
            color = colorResource(id = R.color.btn_clr)
        )
        Spacer(modifier = Modifier.height(85.dp))

        Column(
            modifier = Modifier, verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val textState = remember { mutableStateOf("") }


            OutlinedTextField(
                modifier = Modifier.size(325.dp, 57.dp),
                value = name,
                onValueChange = { name = it },
                leadingIcon = {
                    Text(
                        text = "Name",
                        modifier = Modifier.padding(start = 4.dp),
                        fontFamily = popFontFamily,
                        fontSize = 20.sp, fontWeight = FontWeight.Bold
                    )
                },

                placeholder = {
                    Text(
                        text = "lorem ipsum",
                        modifier = Modifier.padding(start = 15.dp),
                        color = Color.Gray
                    )
                },
                trailingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.editicon),
                        contentDescription = null,
                        Modifier.size(30.dp)
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent
                )
            )
            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(modifier = Modifier.size(325.dp, 110.dp),
                value = address, onValueChange = { address = it },
                leadingIcon = {
                    Text(
                        text = "Address", modifier = Modifier.padding(start = 4.dp),
                        fontFamily = popFontFamily, fontSize = 20.sp, fontWeight = FontWeight.Bold
                    )
                },
                placeholder = {
                    Text(
                        text = "Lorem ipsum is placeholder\n" +
                                "for previewing layouts ",
                        modifier = Modifier.padding(start = 15.dp),
                        color = Color.Gray
                    )
                }, trailingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.editicon),
                        contentDescription = null,
                        Modifier.size(30.dp)
                    )
                }, colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent
                ))
            Spacer(modifier = Modifier.height(20.dp))
            OutlinedTextField(modifier = Modifier.size(325.dp, 57.dp),
                value = name,
                onValueChange = { name = it },
                leadingIcon = {
                    Text(
                        text = "Email",
                        modifier = Modifier.padding(start = 4.dp),
                        fontFamily = popFontFamily,
                        fontSize = 20.sp, fontWeight = FontWeight.Bold
                    )
                },

                placeholder = {
                    Text(
                        text = "loremipsum@gmail.com",
                        modifier = Modifier.padding(start = 15.dp),
                        color = Color.Gray
                    )
                },
                trailingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.editicon),
                        contentDescription = null,
                        Modifier.size(30.dp)
                    )
                }, colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color.Transparent,
                    focusedBorderColor = Color.Transparent
                )
            )
            Spacer(modifier = Modifier.height(20.dp))
            OutlinedTextField(modifier = Modifier.size(325.dp, 57.dp),
                value = name,
                onValueChange = { name = it },
                leadingIcon = {
                    Text(
                        text = "Phone",
                        modifier = Modifier.padding(start = 4.dp),
                        fontFamily = popFontFamily,
                        fontSize = 20.sp, fontWeight = FontWeight.Bold
                    )
                },

                placeholder = {
                    Text(
                        text = "123456789",
                        modifier = Modifier.padding(start = 15.dp),
                        color = Color.Gray
                    )
                },
                trailingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.editicon),
                        contentDescription = null,
                        Modifier.size(30.dp)
                    )
                }, colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent
                )
            )
            Spacer(modifier = Modifier.height(20.dp))
            OutlinedTextField(modifier = Modifier.size(325.dp, 57.dp),
                value = name,
                onValueChange = { name = it },
                leadingIcon = {
                    Text(
                        text = "password",
                        modifier = Modifier.padding(start = 4.dp),
                        fontFamily = popFontFamily,
                        fontSize = 20.sp, fontWeight = FontWeight.Bold
                    )
                },

                placeholder = {
                    Text(
                        text = "******",
                        modifier = Modifier.padding(start = 15.dp),
                        color = Color.Gray
                    )
                },
                trailingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.editicon),
                        contentDescription = null,
                        Modifier.size(30.dp)
                    )
                }, colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent
                )
            )
        }

        Spacer(modifier = Modifier.height(50.dp))


        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.size(325.dp, 57.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(
                    id = R.color.white
                )
            ),
            elevation = ButtonDefaults.elevatedButtonElevation(12.dp)
        ) {
            Text(
                text = "Save Information",
                fontSize = 14.sp,
                fontFamily = popFontFamily,
                color = colorResource(
                    id = R.color.btn_clr
                )
            )

        }


    }


}

