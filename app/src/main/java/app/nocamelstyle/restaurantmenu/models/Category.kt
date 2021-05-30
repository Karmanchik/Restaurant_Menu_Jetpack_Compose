package app.nocamelstyle.restaurantmenu.models

class Category(
    val title: String?,
    val img: String?,
    val id: Int?
) {

    companion object {
        fun getStub() = Category(
            title = "Пиццы",
            img = "https://content.foto.my.mail.ru/mail/andreysxkormachenko/_myphoto/h-398.jpg",
            id = 1
        )
    }

}