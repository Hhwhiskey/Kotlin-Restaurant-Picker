package com.hodges.kevin.kotlin.Singleton

import com.google.gson.reflect.TypeToken
import com.hodges.kevin.kotlin.Model.Restaurant
import java.lang.reflect.Type

/**
 * Created by Kevin on 2/7/2018.
 */
object RestaurantListSingleton  {

    var list: MutableList<Restaurant> = mutableListOf()
    val RESTAURANT_LIST_KEY = "restaurantListKey"
    val type: Type = object : TypeToken<List<Restaurant>>() {}.type
}