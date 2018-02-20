package com.hodges.kevin.kotlin.ViewModel

import android.content.Context
import com.hodges.kevin.kotlin.Enum.RestaurantPriceEnum
import com.hodges.kevin.kotlin.Model.Restaurant

/**
 * Created by Kevin on 2/7/2018.
 */
interface RestaurantViewModel {

   fun addNewRestaurant(context: Context, restaurant: Restaurant): Boolean

   fun removeRestaurant(context: Context, restaurant: Restaurant?)

   fun removeAllRestaurants(context: Context)

   fun hasAnyRestaurantsAtThisPrice(desiredPriceMap: Map<RestaurantPriceEnum, Boolean>): Boolean

   fun getRandomRestaurant(desiredPrice: List<RestaurantPriceEnum>): Restaurant?
}
