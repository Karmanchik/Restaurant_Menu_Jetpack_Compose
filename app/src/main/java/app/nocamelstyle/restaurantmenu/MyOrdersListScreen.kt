package app.nocamelstyle.restaurantmenu

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import app.nocamelstyle.restaurantmenu.models.Product
import app.nocamelstyle.restaurantmenu.retrofit.ApiRepository
import app.nocamelstyle.restaurantmenu.ui.ProductItem

val orders = mutableStateOf(listOf<Product>())

@Composable
fun MyOrdersListScreen() {

    val data = remember { orders }

    ApiRepository().loadProducts {
        data.value = it?.filter { it.id in MainActivity.setting?.orderIds ?: listOf() } ?: listOf()
    }

    LazyColumn {
        items(data.value) { product ->
            ProductItem(product = product)
        }
    }
}