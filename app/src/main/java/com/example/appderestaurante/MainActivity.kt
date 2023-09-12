package com.example.appderestaurante

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.appderestaurante.list_item.FoodItem
import com.example.appderestaurante.model.Food

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodList()
        }
    }
}

@Composable
private fun FoodList() {
    val foodList: MutableList<Food> = mutableListOf(
        Food(
            imgFood = R.drawable.food1,
            foodName = "Food 1",
            foodDescription = "is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard",
            price = "R$ 56,77"
        ),
        Food(
            imgFood = R.drawable.food2,
            foodName = "Food 2",
            foodDescription = "is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard",
            price = "R$ 25,55"
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
    ) {
        LazyColumn {
            itemsIndexed(foodList) {
                _, food -> FoodItem(food)
            }
        }
    }
}