package com.example.fooddelivery.presentation.onboardingscreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R
import com.example.fooddelivery.module.ItemCardModule
import com.example.fooddelivery.presentation.cards.ItemCard

@Composable
fun OrderHistoryScreen() {
    val popFontFamily = FontFamily(Font(R.font.yeonsung))

    val list= listOf(ItemCardModule(image = null,"Burger","American","120"),
            ItemCardModule(image = null,"Burger","American","120"),
        ItemCardModule(image = null,"Burger","American","120"),
                ItemCardModule(image = null,"Burger","American","120"),
    ItemCardModule(image = null,"Burger","American","120"),
    ItemCardModule(image = null,"Burger","American","120"),
    ItemCardModule(image = null,"Burger","American","120")

    )

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp)
    ) {
        Text(
            text = "Hello loren ipsum", fontSize = 20.sp, fontFamily = popFontFamily,
            color = colorResource(
                id = R.color.btn_clr
            ), fontWeight = FontWeight(400)
        )

        Spacer(modifier = Modifier.height(25.dp))

        Card(
            modifier = Modifier.size(359.dp, 237.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(12.dp)
        ) {
            Text(
                text = "Call For Information",
                fontSize = 17.sp,
                color = colorResource(id = R.color.btn_clr),
                modifier = Modifier.padding(16.dp), fontFamily = popFontFamily
            )

            Row(verticalAlignment = Alignment.CenterVertically) {

                Box(
                    modifier = Modifier
                        .size(67.18.dp, 64.dp)
                        .padding(start = 16.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.profilepicture),
                        contentDescription = null,
                        modifier = Modifier.clip(RoundedCornerShape(8.dp))
                    )
                }

                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text(text = "Mr Kemplas", fontSize = 15.sp, fontFamily = popFontFamily)

                    Spacer(modifier = Modifier.height(8.dp))
                    Row {
                        Icon(
                            painter = painterResource(id = R.drawable.icon),
                            contentDescription = null,
                            tint = colorResource(
                                id = R.color.darkGreen
                            )
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "20 minutes on the way", color = Color.Gray)
                    }


                }

            }
            Spacer(modifier = Modifier.height(25.dp))

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(68.dp)
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .border(
                        width = 2.dp,
                        color = colorResource(id = R.color.darkGreen),
                        shape = RoundedCornerShape(8.dp)
                    ),
                shape = RoundedCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(Color.White),

            ) {

                Row(verticalAlignment = Alignment.CenterVertically) {

                    Icon(
                        painter = painterResource(id = R.drawable.call_logo),
                        contentDescription = null,
                        tint = colorResource(
                            id = R.color.darkGreen
                        ), modifier = Modifier.size(19.dp,18.dp)
                    )

                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Call",
                        color = colorResource(id = R.color.darkGreen),
                        fontSize = 14.sp
                    )
                }

            }
        }


        LazyColumn(modifier = Modifier.fillMaxSize().padding(start = 16.dp, top = 25.dp) ) {

            items(list){
                  ItemCard(itemCardModule = it)
            }


        }
    }


}