package com.shubhans.movieapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.shubhans.movieapp.screens.home.details.DetailsScreen
import com.shubhans.movieapp.screens.home.home.HomeScreen
import com.shubhans.movieapp.screens.home.signup.SignUpScreen

@Composable
fun MovieNavigation (){
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination =MovieScreens.SignUpScreen.name) {
        composable(MovieScreens.SignUpScreen.name){
            SignUpScreen(navController = navController)
        }
        composable(MovieScreens.HomeScreen.name) {
            HomeScreen(navController = navController)
        }
        composable(MovieScreens.DetailsScreen.name +"/{Movie}",
        arguments= listOf(navArgument(name="Movie") {type = NavType.StringType})){
            backStackEntry ->
           DetailsScreen(navController = navController,
               backStackEntry.arguments?.getString("Movie"))
        }
    }
}


