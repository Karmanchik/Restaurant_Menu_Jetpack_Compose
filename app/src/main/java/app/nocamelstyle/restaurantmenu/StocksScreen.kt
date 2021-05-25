package app.nocamelstyle.restaurantmenu

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun StocksScreen() {

    Scaffold {
        List(2) {
            ListItem {
                Row {
                    Icon(imageVector = Icons.Filled.Menu, contentDescription = null)
                    Column {
                        Text(text = "Заголовок 1")
                        Text(text = "Сообщение 1")
                    }
                }
            }
            ListItem {
                Row {
                    Icon(imageVector = Icons.Filled.Menu, contentDescription = null)
                    Column {
                        Text(text = "Заголовок 2")
                        Text(text = "Сообщение 2")
                    }
                }
            }
        }
    }
}