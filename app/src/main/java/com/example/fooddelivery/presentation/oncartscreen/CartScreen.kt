package com.example.fooddelivery.presentation.oncartscreen

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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DockedSearchBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
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
import com.example.fooddelivery.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true)
@Composable
fun CartScreen() {
    val popFontFamily = FontFamily(
        Font(R.font.yeonsung_regular)
    )
    var text by remember {
        mutableStateOf("")
    }
    var active by remember {
        mutableStateOf(false)
    }
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 26.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(22.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Box {
                Text(
                    text = "Explore Your Favorite Food",
                    fontFamily = popFontFamily,
                    fontSize = 24.sp,
                    color = colorResource(id = R.color.DarkRed)
                )
            }
            Box {
                Icon(painter = painterResource(id = R.drawable.bell_01),
                    contentDescription = "bell",
                    modifier = Modifier.size(24.dp,24.dp),
                    tint = Color.Blue
                )
            }
        }

        DockedSearchBar(
            query = text,
            onQueryChange = { text = it },
            onSearch = { active = false } ,
            active = active,
            onActiveChange = {
                active = it
            },
            modifier = Modifier.size(350.dp,60.dp),
            placeholder ={
                Text(text = "What do you want to order?",
                    color = colorResource(id = R.color.ForSearch))
            },
            colors = SearchBarDefaults.colors(colorResource(id = R.color.LightPink)),
            shape = RoundedCornerShape(15.dp),
            leadingIcon = {
                Icon(painter = painterResource(id = R.drawable.icon_search),
                    contentDescription ="search",
                    modifier = Modifier.size(29.dp,29.dp),
                    tint = Color.Red
                )
            }
        ) {

        }
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "Cart",
            fontSize = 24.sp,
            fontWeight = FontWeight(400),
            fontFamily = popFontFamily,
            color = colorResource(id = R.color.DarkRed)
        )
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 15.dp)
        ){
            LazyColumn (content = {
                items(inCategoryList()){ item ->
                    DlogCategory(
                        img = item.img,
                        title = item.title,
                        subtitle = item.subtitle,
                        price = item.price,
                        iconMinus = item.iconMinus,
                        iconPlus = item.iconPlus,
                        qnt =item.qnt ,
                        iconDel = item.iconDel
                    )
                }
            })

        }
        Box (
            modifier = Modifier
                .size(350.dp, 210.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(colorResource(id = R.color.left), colorResource(id = R.color.right))
                    )
                )
                .clip(RoundedCornerShape(20.dp))
        ){
            Image(
                modifier = Modifier
                    .matchParentSize(),
                painter = painterResource(id = R.drawable.pattern),
                contentDescription = "pattern",
                contentScale = ContentScale.FillBounds,
            )
            Column(modifier = Modifier
                .size(315.dp, 110.dp)
                .padding(start = 35.dp, top = 25.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
                    Text(text = "Sub-Total", fontWeight = FontWeight(400), fontSize = 14.sp, color = Color.White)
                    Text(text = "120 \$",fontWeight = FontWeight(400), fontSize = 14.sp, color = Color.White)
                }
                Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
                    Text(text = "Delivery Charge", fontWeight = FontWeight(400), fontSize = 14.sp, color = Color.White)
                    Text(text = "10 \$",fontWeight = FontWeight(400), fontSize = 14.sp, color = Color.White)
                }
                Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
                    Text(text = "Discount", fontWeight = FontWeight(400), fontSize = 14.sp, color = Color.White)
                    Text(text = "20 \$",fontWeight = FontWeight(400), fontSize = 14.sp, color = Color.White)
                }
                Spacer(modifier = Modifier.height(16.dp))
                Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
                    Text(text = "Total", fontWeight = FontWeight(400), fontSize = 18.sp, color = Color.White, fontFamily = popFontFamily)
                    Text(text = "150\$",fontWeight = FontWeight(400), fontSize = 18.sp, color = Color.White, fontFamily = popFontFamily)
                }

            }
            Spacer(modifier = Modifier.height(16.dp))
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 130.dp)
            ){
                Spacer(modifier = Modifier.height(16.dp))
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .size(325.dp, 60.dp)
                        .padding(start = 22.dp),
                    shape = RoundedCornerShape(15.dp),
                    colors = ButtonDefaults.buttonColors(colorResource(id = R.color.white)),
                ) {
                    Text(
                        text = "Procees",
                        fontSize = 14.sp,
                        fontWeight = FontWeight(400),
                        color = Color.Red,
                    )
                }
            }
        }
    }
}
@Composable
fun DlogCategory(img: Int, title: String, subtitle: String, price: String, iconMinus : Int, iconPlus : Int, qnt : String, iconDel : Int){
    val popFontFamily = FontFamily(
        Font(R.font.yeonsung_regular, FontWeight.Normal)
    )
    Card(
        modifier = Modifier

            .padding(5.dp)
            .size(350.dp, 100.dp),
        colors = CardDefaults.cardColors(colorResource(id = R.color.white))
    ) {
        Row (
            modifier = Modifier
                .padding(8.dp)
                .size(350.dp, 100.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ){
            Image(
                painter = painterResource(id = img),
                contentDescription ="n",
                modifier = Modifier
                    .size(60.dp)
                    .weight(2f)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column(modifier = Modifier.weight(4f)) {
                Text(
                    text = title,
                    fontSize = 15.sp,
                    fontFamily =popFontFamily,
                    fontWeight = FontWeight(400)
                )
                Text(
                    text = subtitle,
                    fontSize = 14.sp,
                    color = colorResource(id = R.color.Fade),
                    fontWeight = FontWeight(400)
                )
                Text(
                    text = price,
                    color = Color.Red,
                    fontSize = 22.sp
                )
            }
            Column (
                modifier = Modifier.weight(3f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Row (
                    modifier = Modifier.size(90.dp,25.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Icon(
                        painter = painterResource(id = iconMinus),
                        contentDescription = "minus icon",
                        modifier = Modifier.size(26.dp,26.dp),
                        tint = colorResource(id = R.color.Minus)
                    )
                    Text(
                        text = qnt,
                        fontSize = 16.sp,
                        fontWeight = FontWeight(500)
                    )
                    Icon(
                        painter = painterResource(id = iconPlus),
                        contentDescription ="plus icon",
                        modifier = Modifier.size(26.dp,26.dp),
                        tint = Color.Red
                    )
                }
                Spacer(modifier = Modifier.height(15.dp))
                Icon(painter = painterResource(id = iconDel), contentDescription = "delete icon")
            }
        }
    }

}
data class Catego(val img: Int, val title: String, val subtitle: String, val price: String, val iconMinus: Int, val qnt: String, val iconPlus: Int, val iconDel: Int)

fun inCategoryList():MutableList<Catego>{
    val list = mutableListOf<Catego>()
    list.add(Catego(R.drawable.p1,"Spacy fresh crab","Waroenk kita","$35", R.drawable.icon_minus, "1", R.drawable.baseline_add_box_24, R.drawable.outline_delete_24))
    list.add(Catego(R.drawable.p2,"Spacy fresh crab","Waroenk kita","$35", R.drawable.icon_minus, "1", R.drawable.baseline_add_box_24, R.drawable.outline_delete_24))
    list.add(Catego(R.drawable.p3,"Spacy fresh crab","Waroenk kita","$35", R.drawable.icon_minus, "1", R.drawable.baseline_add_box_24, R.drawable.outline_delete_24))
    return list
}