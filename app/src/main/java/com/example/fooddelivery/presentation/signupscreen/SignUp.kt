package com.example.fooddelivery.presentation.signupscreen

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TextFieldDefaults.outlinedTextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R
import com.example.fooddelivery.ui.theme.Lato
import com.example.fooddelivery.ui.theme.black
import com.example.fooddelivery.ui.theme.white

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true)
@Composable
fun ScreenFirst() {

    val popFontFamily = FontFamily(
        Font(R.font.yeonsung_regular, FontWeight.Normal)
    )
    val latoFontFamily = FontFamily(
        Font(R.font.lato_black)
    )
    val Name = remember {
        mutableStateOf("")
    }
    val Email = remember {
        mutableStateOf("")
    }
    val Password = remember {
        mutableStateOf("")
    }
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 75.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.g10),
            contentDescription = "Logo",
            modifier = Modifier.size(91.dp,92.dp)
        )

        Text(
            text = "Waves Of Food" ,
            fontSize = 40.sp,
            fontWeight = FontWeight(400),
            fontFamily = popFontFamily,
            color = Color.Red
        )
        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = "Deliever Favorite Food",
            fontSize = 14.sp,
            fontFamily = latoFontFamily,
            color = Lato
        )
        Spacer(modifier = Modifier.height(25.dp))

        Text(
            text = "Sign Up Here",
            fontSize = 20.sp,
            fontWeight = FontWeight(400),
            fontFamily = popFontFamily,
            color = Color.Red
        )
        Spacer(modifier = Modifier.height(15.dp))

        Box (
            modifier = Modifier
                .height(195.dp)
                .padding(start = 27.dp),
            contentAlignment = Alignment.Center,

            ){
            Column {


                OutlinedTextField(value = Name.value, onValueChange = {
                    Name.value = it
                }, leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.outline_person_24),
                        contentDescription = "person"
                    )
                },
                    label = {
                        Text(text = "Name")
                    }, modifier = Modifier
                        .fillMaxWidth(),
                    // .padding(start = 27.dp),
                    shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = white,
                        unfocusedBorderColor = white
                    )
                )
                Spacer(modifier = Modifier.height(11.dp))

                OutlinedTextField(value = Email.value, onValueChange = {
                    Email.value = it
                }, leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.outline_email_24),
                        contentDescription = "Email"
                    )
                },
                    label = {
                        Text(text = "Email or Phone Number")
                    }, modifier = Modifier
                        .fillMaxWidth(),
                    // .padding(start = 27.dp),
                    shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = white,
                        unfocusedBorderColor = white
                    )
                )
                Spacer(modifier = Modifier.height(11.dp))

                OutlinedTextField(value = Password.value, onValueChange = {
                    Password.value = it
                }, leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.outline_lock_24),
                        contentDescription = "Email"
                    )
                },
                    label = {
                        Text(text = "Password")
                    }, modifier = Modifier
                        .fillMaxWidth(),
                    // .padding(start = 27.dp),
                    shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = white,
                        unfocusedBorderColor = white
                    ),

                    trailingIcon = {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                painter = painterResource(id = R.drawable.outline_visibility_off_24),
                                contentDescription = "visibility"
                            )
                        }
                    }
                )
                Spacer(modifier = Modifier.height(10.dp))

            }
        }

        val annotatedText = buildAnnotatedString {
            pushStyle(SpanStyle(fontSize = 15.sp))
            append("Or\n\n")
            pop()

            pushStyle(SpanStyle(fontSize = 20.sp,))
            append("Sign Up With")
            pop()
        }
        Text(
            text = annotatedText,
            fontWeight = FontWeight(400),
            fontFamily = popFontFamily,
            color = black,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(18.dp))

        Row (

        ){
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(16.dp)
                    .height(57.dp)
                    .width(152.dp),
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(white),

                ) {
                Row (
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(
                        painter = painterResource(id = R.drawable.facebook_31),
                        contentDescription ="Facebook",
                        modifier = Modifier.size(25.dp,25.dp)
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = "Facebook",
                        color = black,
                    )
                }

            }

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(16.dp)
                    .height(57.dp)
                    .width(152.dp),
                colors = ButtonDefaults.buttonColors(white),

                ) {
                Row (
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(
                        painter = painterResource(id = R.drawable.google_icon_1),
                        contentDescription ="Google",
                        modifier = Modifier.size(25.dp,25.dp)
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = "Google",
                        color = black,
                    )
                }


            }
        }
        Spacer(modifier = Modifier.height(15.dp))

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(16.dp)
                .height(57.dp)
                .width(157.dp),
            shape = RoundedCornerShape(15.dp),

            colors = ButtonDefaults.buttonColors(Lato),

            ) {
            Text(
                text = "Create Account",
                color = white,
                fontFamily = popFontFamily,
                fontSize = 15.sp
            )


        }
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Already Have An Account?",
            color = Lato,
            fontFamily = latoFontFamily,
            fontSize = 12.sp
        )
    }
}
