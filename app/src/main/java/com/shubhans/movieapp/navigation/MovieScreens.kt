package com.shubhans.movieapp.navigation

import java.lang.IllegalArgumentException

enum class MovieScreens {
    SignUpScreen,
    HomeScreen,
    DetailsScreen;
    companion object{
        fun fromRoute(route:String?):MovieScreens
        =when (route?.substringBefore("/")){
            SignUpScreen.name ->SignUpScreen
            HomeScreen.name ->HomeScreen
            DetailsScreen.name -> DetailsScreen
            null -> SignUpScreen
            else -> throw  IllegalArgumentException("Route $route is not recognise")
        }
    }
}