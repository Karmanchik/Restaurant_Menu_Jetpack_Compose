package app.nocamelstyle.restaurantmenu.retrofit

import android.content.Context
import androidx.core.content.edit

class Setting(ctx: Context) {

    //todo to jetpack prefs

    private val pref = ctx.getSharedPreferences("setting", Context.MODE_PRIVATE)

    var orderIds: List<Int>
        get() = pref.getStringSet("orderIds", setOf())!!.map { it.toInt() }
        set(value) = pref.edit { putStringSet("orderIds", value.map { it.toString() }.toSet()) }

}