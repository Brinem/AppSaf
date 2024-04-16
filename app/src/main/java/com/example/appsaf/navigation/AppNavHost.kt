package com.example.appsaf.navigation

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appsaf.ui.theme.AppSafTheme
import com.example.appsaf.ui.theme.screens.about.About
import com.example.appsaf.ui.theme.screens.home.Home
import com.example.appsaf.ui.theme.screens.login.LoginScreen
import com.example.appsaf.ui.theme.screens.registration.RegistrationScreen
import com.example.appsaf.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination: String= ROUTE_SPLASH) {
    NavHost(navController = navController, modifier = modifier, startDestination = startDestination){
        composable(ROUTE_HOME){
            Home(navController)
        }
        composable(ROUTE_ABOUT){
            About(navController)
        }
        composable(ROUTE_SPLASH){
            SplashScreen(navController)
        }
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegistrationScreen(navController)
        }
    }
    
}
//@Preview
//@Composable
//private fun AppNavHostpreview() {
//        AppSafTheme {
//        AppNavHost()
//    }
//}