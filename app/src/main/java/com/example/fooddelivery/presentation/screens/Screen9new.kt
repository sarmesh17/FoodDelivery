package com.example.fooddelivery.presentation.screens

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
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.widget.TextViewCompat
import com.example.fooddelivery.R

@Composable
@Preview (showSystemUi = true)
fun Screen9new(){
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
    Column (modifier = Modifier.fillMaxSize() ,
        horizontalAlignment = Alignment.CenterHorizontally){




        Text(text = "Hello,  lorem ipsum",
            modifier = Modifier.padding(top = 15.dp), fontSize = 20.sp, fontFamily = popFontFamily, color = colorResource(id =R.color.btn_clr )
        )
        Spacer(modifier = Modifier.height(25.dp))

        Column(modifier = Modifier, verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            val textState = remember { mutableStateOf("") }


            TextField( modifier = Modifier.size(325.dp,57.dp),
                    value = name,
                    onValueChange = { name = it },
                    leadingIcon ={ Text(text = "Name",  modifier = Modifier.padding(start = 4.dp), fontFamily = popFontFamily,
                        fontSize = 20.sp)},

                    placeholder = { Text(text = "lorem ipsum" , modifier = Modifier.padding(start = 15.dp), color = Color.Gray)}
                    , trailingIcon = { Image(painter = painterResource(id = R.drawable.editicon), contentDescription =null,Modifier.size(30.dp))}
                )
            Spacer(modifier = Modifier.height(20.dp))
            TextField(modifier = Modifier.size(325.dp,110.dp),
                value =address , onValueChange = { address=it},
                leadingIcon = { Text(text = "Address",modifier = Modifier.padding(start = 4.dp),
                    fontFamily = popFontFamily, fontSize = 20.sp)},
                placeholder = { Text(text = "Lorem ipsum is placeholder\n" +
                               "for previewing layouts ", modifier = Modifier.padding(start = 15.dp), color = Color.Gray)}
            , trailingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.editicon),
                        contentDescription = null,
                        Modifier.size(30.dp)
                    )})
            Spacer(modifier = Modifier.height(20.dp))
            TextField(modifier = Modifier.size(325.dp,57.dp),
                value = name,
                onValueChange = { name = it },
                leadingIcon ={ Text(text = "Email",  modifier = Modifier.padding(start = 4.dp), fontFamily = popFontFamily,
                    fontSize = 20.sp)},

                placeholder = { Text(text = "loremipsum@gmail.com" , modifier = Modifier.padding(start = 15.dp), color = Color.Gray)}
                , trailingIcon = { Image(painter = painterResource(id = R.drawable.editicon), contentDescription =null,Modifier.size(30.dp))}
            )
            Spacer(modifier = Modifier.height(20.dp))
            TextField(modifier = Modifier.size(325.dp,57.dp),
                value = name,
                onValueChange = { name = it },
                leadingIcon ={ Text(text = "Phone",  modifier = Modifier.padding(start = 4.dp), fontFamily = popFontFamily,
                    fontSize = 20.sp)},

                placeholder = { Text(text = "123456789" , modifier = Modifier.padding(start = 15.dp), color = Color.Gray)}
                , trailingIcon = { Image(painter = painterResource(id = R.drawable.editicon), contentDescription =null,Modifier.size(30.dp))}
            )
            Spacer(modifier = Modifier.height(20.dp))
            TextField(modifier = Modifier.size(325.dp,57.dp),
                value = name,
                onValueChange = { name = it },
                leadingIcon ={ Text(text = "password",  modifier = Modifier.padding(start = 4.dp), fontFamily = popFontFamily,
                    fontSize = 20.sp)},

                placeholder = { Text(text = "******" , modifier = Modifier.padding(start = 15.dp), color = Color.Gray)}
                , trailingIcon = { Image(painter = painterResource(id = R.drawable.editicon), contentDescription =null,Modifier.size(30.dp))}
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = { /*TODO*/ }, modifier = Modifier.size(325.dp,57.dp), shape = RoundedCornerShape(16.dp), colors = ButtonDefaults.buttonColors(containerColor = colorResource(
            id = R.color.white
        ))) {
            Text(text = "Save Information", fontSize = 14.sp, fontFamily = popFontFamily, color = colorResource(
                id = R.color.btn_clr))
            
        }
        Spacer(modifier = Modifier.height(150.dp))
Card(modifier = Modifier
    .fillMaxWidth()
    .height(70.dp),)  {
    Row (modifier = Modifier, horizontalArrangement = Arrangement.Center, verticalAlignment =Alignment.CenterVertically){
        Image(painter = painterResource(id =R.drawable.home ), contentDescription =null,
            Modifier
                .size(30.dp, 30.dp)
                .padding(start = 10.dp))
        Spacer(modifier = Modifier.width(50.dp))
        Image(painter = painterResource(id = R.drawable.shoppingcart), contentDescription =null , Modifier.size(24.dp, 24.dp))
        Spacer(modifier = Modifier.width(50.dp))
        Image(painter = painterResource(id = R.drawable.van), contentDescription =null,Modifier.size(24.dp,24.dp))
        Spacer(modifier = Modifier.width(50.dp))

        Image(painter = painterResource(id = R.drawable.list), contentDescription =null,Modifier.size(24.dp,24.dp))
        Spacer(modifier = Modifier.width(15.dp))
        Button(onClick = { /*TODO*/ }, modifier = Modifier
            .size(110.dp, 60.dp)
            .padding(top = 20.dp), shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = colorResource(id =R.color.lgtgreen ))


        ) {
            Image(painter = painterResource(id = R.drawable.profile),
                contentDescription =null)
            Text(text = "Profile", color = Color.Black)

        }
    }


}


        }



}

