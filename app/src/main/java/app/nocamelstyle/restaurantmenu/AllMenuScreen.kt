package app.nocamelstyle.restaurantmenu

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import app.nocamelstyle.restaurantmenu.models.Category
import app.nocamelstyle.restaurantmenu.retrofit.ApiRepository
import com.google.accompanist.glide.rememberGlidePainter

var categories = listOf(
    Category("lola", null, 1),
    Category("lola", null, 1),
    Category("lola", null, 1),
    Category("lola", null, 1)
)

@Composable
fun AllMenuScreen(categoriesList: List<Category>) {
    ApiRepository().loadCategories {
        categories = it ?: listOf()
    }

    Scaffold(Modifier.background(color = Color.Cyan)) {
        LazyColumn {
            items(categoriesList) { categoryItem ->
                Row {
                    Image(
                        painter = rememberGlidePainter(categoryItem.img),
                        contentDescription = null
                    )
                    Text(text = "${categoryItem.title}")
                }
            }
        }
    }
}