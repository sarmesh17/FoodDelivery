package com.example.fooddelivery.presentation.homescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true)
@Composable
fun HomeScreen() {
    val popFontFamily = FontFamily(
        Font(R.font.yeonsung_regular, FontWeight.Normal)
    )
    val images = listOf(
        R.drawable.banner1,
        R.drawable.banner2,
        R.drawable.banner3,
    )
    var query by remember {
        mutableStateOf("")
    }
    var active by remember {
        mutableStateOf(false)
    }


    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 40.dp),
        //verticalArrangement = Arrangement.Center,
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
                    fontWeight = FontWeight(400),
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
            query = query,
            onQueryChange = { query = it },
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
            //of searchbar
        }

        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            items (images){imageRes ->
                Image(
                    painter = painterResource(id = imageRes),
                    contentDescription = "n",
                    modifier = Modifier
                        .padding(8.dp)
                        .size(300.dp, 175.dp),
                    contentScale = ContentScale.Crop
                )
            }
        }
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(22.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                text = "Popular",
                fontSize = 16.sp,
                fontFamily = popFontFamily,
                color = colorResource(id = R.color.DarkRed)
            )
            Text(
                text = "View More",
                fontSize = 12.sp,
                color = colorResource(id = R.color.DarkRed)
            )
        }

        Box (modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
        ){
            LazyColumn (content = {
                items(getCategoryList()){item ->
                    BlogCategory(img = item.img, title = item.subtitle, subtitle = item.subtitle, price = item.price)
                }
            })
        }

    }

}
@Composable
fun BlogCategory(img: Int, title:String, subtitle: String, price: String){
    val popFontFamily = FontFamily(
        Font(R.font.yeonsung_regular, FontWeight.Normal)
    )
    Row(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id =img),
            contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .weight(2f)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column(modifier = Modifier.weight(6f)) {
            Text(text =title, fontSize = 20.sp, fontFamily = popFontFamily, fontWeight = FontWeight(400))
            Text(text =subtitle, fontSize = 15.sp , color = colorResource(id = R.color.Fade))
        }
        Text(
            text =price,
            color = Color.Red,
            modifier = Modifier.weight(2f), textAlign = TextAlign.Center,
            fontSize = 22.sp
        )
    }
}

data class Category(val img: Int, val title: String,val subtitle: String, val price: String)

fun getCategoryList(): MutableList<Category>{
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.menu1, "Herbal Pancake","Warung Herbal","$7"))
    list.add(Category(R.drawable.menu2, "Fruit Salad","Wijie Resto","$5"))
    list.add(Category(R.drawable.menu3, "Green Noodle","Noodle Home","$15"))

    return list
}