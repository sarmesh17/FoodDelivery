package com.example.fooddelivery.util

import kotlinx.serialization.Serializable

sealed class Routes {

    @Serializable
    data object FirstOnBoardingScreen:Routes()

    @Serializable
    data object SecondOnBoardingScreen:Routes()

    @Serializable
    data object HomeScreen:Routes()

    @Serializable
    data object CartScreen:Routes()

    @Serializable
    data object DeliveryScreen:Routes()

    @Serializable
    data object History:Routes()

    @Serializable
    data object Person:Routes()

    @Serializable
    data object LoginScreen:Routes()

    @Serializable
    data object SignupScreen:Routes()


}