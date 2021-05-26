package app.nocamelstyle.restaurantmenu.models

class Product(
    val name: String?,
    val icon: String?,
    val id: Int?,
    val weight: String?,
    val price: Double?,
    val stocksPrice: Double?,
    val sostav: List<String>?,
    val categoryId: String?,
    val categoryName: String?
)