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
) {

    companion object {
        fun getStub() = Product(
            name = "4 сыра",
            icon = "https://content.foto.my.mail.ru/mail/andreysxkormachenko/_myphoto/h-398.jpg",
            id = 1,
            weight = "200g",
            price = 200.0,
            stocksPrice = 150.0,
            sostav = listOf(),
            categoryId = "1",
            categoryName = "Пиццы"
        )
    }

}