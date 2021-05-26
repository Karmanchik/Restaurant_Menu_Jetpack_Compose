package app.nocamelstyle.restaurantmenu.retrofit

import app.nocamelstyle.restaurantmenu.models.Category
import app.nocamelstyle.restaurantmenu.models.Product
import retrofit2.Call
import retrofit2.http.GET

interface Api {

    @GET("/categories")
    fun getCategories(): Call<List<Category>>

    @GET("/products")
    fun getProducts(): Call<List<Product>>

}