package com.example.fooddelivery.presentation.cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.fooddelivery.R
import com.example.fooddelivery.module.ItemCardModule

@Composable
fun ItemCard(itemCardModule: ItemCardModule) {


    val popFontFamily = FontFamily(Font(R.font.yeonsung))

    Box(modifier = Modifier.size(347.dp, 103.dp)) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {


            // image
            Box(
                modifier = Modifier
                    .padding(start = 8.dp),
                contentAlignment = Alignment.Center,
            ) {
                AsyncImage(
                    model = itemCardModule.image, contentDescription = null,
                    modifier = Modifier
                        .size(62.dp)
                        .clip(RoundedCornerShape(12.dp)),
                    contentScale = ContentScale.Crop
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            // text
            Column {
                Text(
                    text = itemCardModule.foodTitle,
                    fontSize = 15.sp,
                    fontWeight = FontWeight(400)
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = itemCardModule.foodSubTitle, fontSize = 14.sp, color = Color.Gray)
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "$ ${itemCardModule.price}",
                    fontSize = 19.sp,
                    color = colorResource(id = R.color.btn_clr)
                )
            }

            Spacer(modifier = Modifier.width(90.dp))

            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(
                        id = R.color.btn_clr
                    )
                )
            ) {

                Text(text = "Buy Again", fontFamily = popFontFamily)
            }

        }


    }
}