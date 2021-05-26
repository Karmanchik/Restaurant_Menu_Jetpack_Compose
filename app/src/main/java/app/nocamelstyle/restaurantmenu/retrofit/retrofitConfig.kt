package app.nocamelstyle.restaurantmenu.retrofit

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val retrofit by lazy {
    val interceptor = HttpLoggingInterceptor()
    interceptor.level = HttpLoggingInterceptor.Level.BODY

    val client = OkHttpClient.Builder()
        .addInterceptor(interceptor)
        .build()

    Retrofit.Builder()
        .baseUrl("https://private-f6d5e-restaurantmenu1.apiary-mock.com")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()
}