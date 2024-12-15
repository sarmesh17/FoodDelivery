package com.example.fooddelivery.presentation.cards

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.fooddelivery.R
import com.example.fooddelivery.module.Category

@Composable
fun BlogCategory(category: Category){
    val popFontFamily = FontFamily(
        Font(R.font.yeonsung_regular, FontWeight.Normal)
    )
    Row(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        AsyncImage(
            model = painterResource(id = category.img),
            contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .weight(2f)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column(modifier = Modifier.weight(6f)) {
            Text(text =category.title, fontSize = 20.sp, fontFamily = popFontFamily, fontWeight = FontWeight(400))
            Text(text =category.subtitle, fontSize = 15.sp , color = colorResource(id = R.color.Fade))
        }

        Text(
            text =category.price,
            color = Color.Red,
            modifier = Modifier.weight(2f), textAlign = TextAlign.Center,
            fontSize = 22.sp
        )
    }
}
