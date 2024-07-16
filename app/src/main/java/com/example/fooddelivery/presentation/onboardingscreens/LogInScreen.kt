package com.example.fooddelivery.presentation.onboardingscreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
fun LogInScreen() {
    val popFontFamily = FontFamily(Font(R.font.yeonsung))

    var email by remember {
        mutableStateOf("")
    }

    var password: String by remember {
        mutableStateOf("")
    }

    // logo-part
    Column(modifier = Modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.height(30.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(280.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = R.drawable.loginimg),
                contentDescription = null, modifier = Modifier.size(120.dp, 120.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Waves of Food",
                fontSize = 40.sp,
                color = colorResource(id = R.color.btn_clr),
                fontFamily = popFontFamily

            )
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                text = "Deliever Favorite Food",
                fontSize = 14.sp,
                color = colorResource(id = R.color.btn_clr)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Login To Your  Account",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.btn_clr)
            )

        }

        // text-field part
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            // email-text field
            OutlinedTextField(

                value = email,
                onValueChange = { newText ->
                    email = newText
                }, label = {
                    Text(text = "Email")
                }, colors = OutlinedTextFieldDefaults.colors(

                    focusedBorderColor = Color.White,
                    unfocusedBorderColor = Color.White

                ),
                shape = RoundedCornerShape(20.dp),

                )
            Spacer(modifier = Modifier.height(15.dp))


            // password-text field
            OutlinedTextField(
                value = password,
                onValueChange = { newText ->
                    password = newText
                }, label = {
                    Text(text = "Password")
                }, colors = OutlinedTextFieldDefaults.colors(

                    focusedBorderColor = Color.White,
                    unfocusedBorderColor = Color.White

                ),
                shape = RoundedCornerShape(20.dp),
            )

            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "or")
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Continue With",
                fontFamily = popFontFamily, fontSize = 20.sp
            )
            Column {
                Row {
                    Button(
                        onClick = { /*TODO()*/ },
                        modifier = Modifier
                            .padding(16.dp)
                            .height(57.dp)
                            .width(157.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White)
                    )
                    {
                        Image(painter = painterResource(id = R.drawable.facebook), contentDescription =null, Modifier.size(35.dp))
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(text = "Facebook", color = Color.Black)
                    }
                    Button(
                        onClick = { TODO() },
                        modifier = Modifier
                            .padding(16.dp)
                            .height(57.dp)
                            .width(157.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White)
                    )
                    {
                        Image(painter = painterResource(id = R.drawable.google_icon_1), contentDescription =null, Modifier.size(35.dp))
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(text = "Google", color = Color.Black)
                    }
                }
            }


            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    onClick = { TODO() },
                    modifier = Modifier
                        .height(57.dp)
                        .width(157.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = colorResource(id =R.color.btn_clr ))
                )
                {
                    Text(
                        text = "Login",
                        color =Color.White,
                        fontFamily = popFontFamily,
                        fontSize = 20.sp,

                    )


                }
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Don't Have Account?",
                    color = colorResource(id = R.color.btn_clr),
                    fontSize = 12.sp
                )
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    text = "Design By\n" +
                            "NeatRoots", color = colorResource(id = R.color.btn_clr),
                    fontFamily = popFontFamily,
                    fontSize = 20.sp
                )
            }
        }
    }
}
