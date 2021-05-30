package app.nocamelstyle.restaurantmenu

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import app.nocamelstyle.restaurantmenu.models.Category
import app.nocamelstyle.restaurantmenu.retrofit.ApiRepository
import app.nocamelstyle.restaurantmenu.ui.items.UICategoryItem
import app.nocamelstyle.restaurantmenu.ui.theme.RestaurantMenuTheme

val categories = mutableStateOf(listOf<Category>(
    Category(
        title = "Пицца",
        img = null,
        id = 1
    )
))

@Preview("AllMenuScreen")
@Composable
fun DefaultPreview1() {
    RestaurantMenuTheme {
        AllMenuScreen()
    }
}


@Composable
fun AllMenuScreen() {

    val data = remember { categories }

    ApiRepository().loadCategories {
        data.value = it ?: listOf()
    }
    LazyColumn(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        items(data.value) { categoryItem ->
//            UICategoryItem(categoryItem)
        }
    }
}