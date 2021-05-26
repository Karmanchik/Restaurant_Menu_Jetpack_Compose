package app.nocamelstyle.restaurantmenu.ui

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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.nocamelstyle.restaurantmenu.models.Product
import com.google.accompanist.glide.rememberGlidePainter

@Composable
fun ProductItem(product: Product) {
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
                painter = rememberGlidePainter(product.icon),
                contentDescription = null,
                Modifier
                    .size(60.dp, 60.dp)
                    .clip(shape = RoundedCornerShape(topStart = 12.dp, bottomStart = 12.dp)),
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = "${product.name}",
                fontSize = 18.sp
            )
        }
    }
}