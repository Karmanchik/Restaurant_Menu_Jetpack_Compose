package app.nocamelstyle.restaurantmenu.retrofit

import app.nocamelstyle.restaurantmenu.models.Category
import app.nocamelstyle.restaurantmenu.models.Product
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.create

class ApiRepository {

    fun loadCategories(onLoaded: (List<Category>?) -> Unit) {
        retrofit.create<Api>()
            .getCategories()
            .enqueue(object : Callback<List<Category>> {
                override fun onResponse(
                    call: Call<List<Category>>,
                    response: Response<List<Category>>
                ) {
                    onLoaded.invoke(response.body())
                }

                override fun onFailure(call: Call<List<Category>>, t: Throwable) {
                    onLoaded.invoke(null)
                }

            })
    }

    fun loadProducts(onLoaded: (List<Product>?) -> Unit) {
        retrofit.create<Api>()
            .getProducts()
            .enqueue(object : Callback<List<Product>> {
                override fun onResponse(
                    call: Call<List<Product>>,
                    response: Response<List<Product>>
                ) {
                    onLoaded.invoke(response.body())
                }

                override fun onFailure(call: Call<List<Product>>, t: Throwable) {
                    onLoaded.invoke(null)
                }

            })
    }

}