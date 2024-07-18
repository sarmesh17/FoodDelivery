package com.example.fooddelivery.presentation.bottomnavigation

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.R

@Preview
@Composable
fun BottomNavigation() {

    val items = listOf(
        NavigationItem("Home", R.drawable.home),
        NavigationItem("Cart", R.drawable.cart),
        NavigationItem("Delivery", R.drawable.delivery),
        NavigationItem("List", R.drawable.list),
        NavigationItem("List", R.drawable.person)

    )
    var selectedItem by remember {
        mutableStateOf(items.first())
    }

    NavigationBar {

        items.forEach { item ->
            NavigationBarItem(
                selected = selectedItem == item,
                onClick = { selectedItem = item },
                icon = {
                    Icon(
                        painter = painterResource(id = item.icon),
                        contentDescription = item.name,
                        modifier = Modifier.size(25.dp), tint = Color.Black
                    )
                },
                label = { if (selectedItem == item) Text(item.name) else null },

                )
        }
    }
}

data class NavigationItem(
    val name: String,
    @DrawableRes val icon: Int
)
