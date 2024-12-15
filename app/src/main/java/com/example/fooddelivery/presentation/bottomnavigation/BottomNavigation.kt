package com.example.fooddelivery.presentation.bottomnavigation

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R

@Preview( showSystemUi = true)
@Composable
fun BottomNavigation() {

    val items = listOf(
        NavigationItem("Home", R.drawable.home),
        NavigationItem("Cart", R.drawable.cart),
        NavigationItem("Delivery", R.drawable.delivery),
        NavigationItem("List", R.drawable.list),
        NavigationItem("Profile", R.drawable.person)
    )
    var selectedItem by remember { mutableStateOf(items.first()) }

    NavigationBar {
        items.forEach { item ->
            NavigationBarItem(
                selected = selectedItem == item,
                onClick = { selectedItem = item },
                icon = {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            painter = painterResource(id = item.icon),
                            contentDescription = item.name,
                            modifier = Modifier.size(25.dp),
                            tint =  Color.Black
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        if (selectedItem == item) {
                            Text(text = item.name, color = Color.Black, fontSize = 12.sp)
                        }
                    }
                },
                colors = NavigationBarItemDefaults.colors(indicatorColor = colorResource(id = R.color.HintGreen))
            )
        }
    }
}

data class NavigationItem(
    val name: String,
    @DrawableRes val icon: Int
)
