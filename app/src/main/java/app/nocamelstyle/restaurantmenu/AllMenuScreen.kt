package app.nocamelstyle.restaurantmenu

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.nocamelstyle.restaurantmenu.models.Category
import app.nocamelstyle.restaurantmenu.retrofit.ApiRepository
import com.google.accompanist.glide.rememberGlidePainter

val categories = mutableStateOf(listOf<Category>())

@Composable
fun AllMenuScreen() {

    val data = remember { categories }

    ApiRepository().loadCategories {
        data.value = it ?: listOf()
    }
    LazyColumn {
        items(data.value) { categoryItem ->
            Card(
                Modifier
                    .padding(12.dp)
                    .border(1.dp, Color.Black, RoundedCornerShape(12.dp))
            ) {
                Row(
                    Modifier
                        .fillParentMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = rememberGlidePainter(categoryItem.img),
                        contentDescription = null,
                        Modifier.size(60.dp, 60.dp)
                            .clip(shape = RoundedCornerShape(topStart = 12.dp, bottomStart = 12.dp)),
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Text(
                        text = "${categoryItem.title}",
                        fontSize = 18.sp
                    )
                }
            }
        }
    }
}