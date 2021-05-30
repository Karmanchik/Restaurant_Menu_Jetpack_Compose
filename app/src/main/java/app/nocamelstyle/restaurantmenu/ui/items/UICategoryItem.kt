package app.nocamelstyle.restaurantmenu.ui.items

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.nocamelstyle.restaurantmenu.models.Category
import com.google.accompanist.glide.rememberGlidePainter

@Composable
fun UICategoryItem(category: Category = Category.getStub()) {
    Card(
        Modifier
            .padding(12.dp)
            .border(1.dp, Color.Black, RoundedCornerShape(12.dp))
    ) {
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = rememberGlidePainter(category.img),
                contentDescription = null,
                Modifier
                    .size(60.dp, 60.dp)
                    .clip(shape = RoundedCornerShape(topStart = 12.dp, bottomStart = 12.dp)),
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = "${category.title}",
                fontSize = 18.sp
            )
        }
    }
}

@Preview("productItemPreview")
@Composable
fun CategoryPreview() {
    UIProductItem()
}