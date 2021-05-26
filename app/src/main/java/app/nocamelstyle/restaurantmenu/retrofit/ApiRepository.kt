package app.nocamelstyle.restaurantmenu.retrofit

import app.nocamelstyle.restaurantmenu.models.Category
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

}