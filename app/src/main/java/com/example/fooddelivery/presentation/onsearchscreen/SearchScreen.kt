package com.example.fooddelivery.presentation.onsearchscreen

import androidx.compose.foundation.Image
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

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true)
@Composable
fun SearchScreen() {

    val popFontFamily = FontFamily(
        Font(R.font.yeonsung_regular, FontWeight.Normal)
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
            .padding(top = 80.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        DockedSearchBar(
            query = text,
            onQueryChange = { text = it },
            onSearch = { active = false } ,
            active = active,
            onActiveChange = {
                active = it
            },
            placeholder ={
                Text(text = "What do you want to order?")
            },
            modifier = Modifier.size(350.dp,60.dp),
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
        Spacer(modifier = Modifier.height(32.dp))
        Text(
            text = "Popular",
            fontSize = 24.sp,
            fontFamily = popFontFamily,
            fontWeight = FontWeight(400),
            color = Color.Red
        )
        Spacer(modifier = Modifier.height(16.dp))
        //box for lazycolumn display
        Box (
            modifier = Modifier.size(380.dp, 485.dp)
                .padding(8.dp)
        ){
            LazyColumn (content = {
                items(categoryList()){item ->
                    ClogCategory(img = item.img, title = item.title, subtitle = item.subtitle, price = item.price, icon = item.icon)
                }
            })

        }

    }

}
@Composable
fun ClogCategory(img: Int, title: String, subtitle: String, price: String, icon : Int){
    val popFontFamily = FontFamily(
        Font(R.font.yeonsung_regular, FontWeight.Normal)
    )
    Card (
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(colorResource(id = R.color.white))
    ){
        Row(
            modifier = Modifier.fillMaxWidth().padding(9.dp),
            //.padding(4.dp)
            //.size(350.dp, 100.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = img),
                contentDescription ="n",
                modifier = Modifier
                    .size(60.dp)
                    .weight(2f)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column(modifier = Modifier.weight(6f)) {
                Text(
                    text = title,
                    fontSize = 15.sp,
                    fontFamily =popFontFamily
                )
                Text(
                    text = subtitle,
                    fontSize = 14.sp,
                    color = colorResource(id = R.color.Fade)
                )
            }
            Column (
                modifier = Modifier.weight(2f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = price,
                    color = Color.Red,
                    fontSize = 22.sp,

                    )
                Icon(painter = painterResource(id = icon), contentDescription = "n")
            }
        }
    }

}
data class Cate(val img: Int, val title: String, val subtitle: String, val price: String, val icon: Int)

fun categoryList():MutableList<Cate>{
    val list = mutableListOf<Cate>()
    list.add(Cate(R.drawable.menu1,"Herbal Pancake","Warung Herbal","$7",R.drawable.rounded_select_check_box_24))
    list.add(Cate(R.drawable.menu2, "Fruit Salad","Wijie Resto","$5",R.drawable.rounded_select_check_box_24))
    list.add(Cate(R.drawable.menu3, "Green Noodle","Noodle Home","$15", R.drawable.rounded_select_check_box_24))
    list.add(Cate(R.drawable.menu1,"Herbal Pancake","Warung Herbal","$7",R.drawable.rounded_select_check_box_24))
    list.add(Cate(R.drawable.menu2, "Fruit Salad","Wijie Resto","$5",R.drawable.rounded_select_check_box_24))
    list.add(Cate(R.drawable.menu3, "Green Noodle","Noodle Home","$15", R.drawable.rounded_select_check_box_24))
    return list
}