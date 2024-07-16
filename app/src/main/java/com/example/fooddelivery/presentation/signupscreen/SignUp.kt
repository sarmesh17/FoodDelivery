package com.example.fooddelivery.presentation.signupscreen

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TextFieldDefaults.outlinedTextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R
import com.example.fooddelivery.ui.theme.Lato
import com.example.fooddelivery.ui.theme.black
import com.example.fooddelivery.ui.theme.white
import com.example.fooddelivery.viewmodels.SignupViewModel

@Composable
fun SignupScreen(
    signupViewModel: SignupViewModel
) {

    var passwordVisible by remember { mutableStateOf(false) }

    val popFontFamily = FontFamily(
        Font(R.font.yeonsung_regular, FontWeight.Normal)
    )
    val latoFontFamily = FontFamily(
        Font(R.font.lato_black)
    )
    val name = remember {
        mutableStateOf("")
    }
    val email = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }

    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 15.dp),
        horizontalAlignment = Alignment.CenterHorizontally


    ) {
        Image(
            painter = painterResource(id = R.drawable.g10),
            contentDescription = "Logo",
            modifier = Modifier.size(91.dp, 92.dp)
        )

        Text(
            text = "Waves Of Food",
            fontSize = 40.sp,
            fontWeight = FontWeight(400),
            fontFamily = popFontFamily,
            color = Color.Red
        )
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Deliever Favorite Food",
            fontSize = 14.sp,
            fontFamily = latoFontFamily,
            color = Lato
        )
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Sign Up Here",
            fontSize = 20.sp,
            fontWeight = FontWeight(400),
            fontFamily = popFontFamily,
            color = Color.Red
        )
        Spacer(modifier = Modifier.height(16.dp))


        // Text-field
        Column(
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(value = name.value, onValueChange = {
                name.value = it
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
                shape = RoundedCornerShape(20.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.White,
                    unfocusedBorderColor = Color.White
                )
            )
            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(value = email.value, onValueChange = {
                email.value = it
            }, leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.outline_email_24),
                    contentDescription = "Email"
                )
            },
                label = {
                    Text(text = "Email")
                }, modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.White,
                    unfocusedBorderColor = Color.White,

                    )
            )
              Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                value = password.value,
                onValueChange = {
                    password.value = it
                },
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.outline_lock_24),
                        contentDescription = "Email"
                    )
                },
                label = {
                    Text(text = "Password")
                },
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.White,
                    unfocusedBorderColor = Color.White
                ),

                trailingIcon = {
                    IconButton(onClick = { passwordVisible = !passwordVisible }) {
                        Icon(
                            painter = painterResource(id = R.drawable.outline_visibility_off_24),
                            contentDescription = "visibility",
                        )
                    }
                },
                visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation()

            )

        }

        val annotatedText = buildAnnotatedString {
            pushStyle(SpanStyle(fontSize = 15.sp))
            append("Or\n\n")
            pop()

            pushStyle(SpanStyle(fontSize = 20.sp))
            append("Sign Up With")
            pop()
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = annotatedText,
            fontWeight = FontWeight(400),
            fontFamily = popFontFamily,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(16.dp))

        Row {
            // Facebook button
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(16.dp)
                    .height(57.dp)
                    .width(152.dp),
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(white),

                ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.facebook_31),
                        contentDescription = "Facebook",
                        modifier = Modifier.size(25.dp, 25.dp)
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = "Facebook",
                        color = black,
                    )
                }

            }

            // sign-up button
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(16.dp)
                    .height(57.dp)
                    .width(152.dp),
                colors = ButtonDefaults.buttonColors(white),

                ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.google_icon_1),
                        contentDescription = "Google",
                        modifier = Modifier.size(25.dp, 25.dp)
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = "Google",
                        color = Color.Black,
                    )
                }


            }
        }
        Spacer(modifier = Modifier.height(8.dp))

        // Create account Button
        Button(
            onClick = {
                if (email.value.isEmpty() || password.value.isEmpty() || name.value.isEmpty()) {
                    Toast.makeText(context, "Please fill all the fields", Toast.LENGTH_SHORT).show()
                } else {
                    signupViewModel.signup(email.value, password.value, name.value)
                }

            },
            modifier = Modifier
                .height(57.dp)
                .width(157.dp),
            shape = RoundedCornerShape(15.dp),

            colors = ButtonDefaults.buttonColors(Lato),

            ) {
            Text(
                text = "Create Account",
                color = Color.White,
                fontFamily = popFontFamily,
                fontSize = 15.sp
            )


        }
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Already Have An Account?",
            color = Lato,
            fontFamily = latoFontFamily,
            fontSize = 12.sp
        )
    }


}


@Preview(showSystemUi = true)
@Composable
fun SignupPrev() {

    SignupScreen(signupViewModel = SignupViewModel())

}