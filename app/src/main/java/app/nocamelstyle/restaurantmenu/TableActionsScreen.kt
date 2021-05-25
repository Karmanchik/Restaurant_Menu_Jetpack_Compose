package app.nocamelstyle.restaurantmenu

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TableActionsScreen() {

    Scaffold {
        Column(
            Modifier
                .padding(15.dp)
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
        ) {

            Button(onClick = {}, Modifier.fillMaxWidth()) {
                Text(text = "Вызов официанта")
            }
            Spacer(modifier = Modifier.height(30.dp))
            Button(onClick = {}, Modifier.fillMaxWidth()) {
                Text(text = "Попросить счет")
            }
            Spacer(modifier = Modifier.height(30.dp))
            Button(onClick = {}, Modifier.fillMaxWidth()) {
                Text(text = "Оставить отзыв")
            }
        }
    }
}