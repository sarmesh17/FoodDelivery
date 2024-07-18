package com.example.fooddelivery.util

import kotlinx.serialization.Serializable

object Routes {

    @Serializable
    data object FirstOnBoardingScreen

    @Serializable
    data object SecondOnBoardingScreen

    @Serializable
    data object HomeScreen

    @Serializable
    data object CartScreen

    @Serializable
    data object DeliveryScreen

    @Serializable
    data object History

    @Serializable
    data object Person


}