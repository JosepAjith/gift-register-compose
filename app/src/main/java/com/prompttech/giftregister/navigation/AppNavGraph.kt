package com.prompttech.giftregister.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.prompttech.giftregister.navigation.auth.authNavGraph
import com.prompttech.giftregister.navigation.home.homeGraph
import com.prompttech.giftregister.navigation.welcome.welcomeGraph

@Composable
fun AppNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Root.WELCOME,
        route = Root.APPROOT
    ) {
        welcomeGraph()
        homeGraph()
        authNavGraph()
    }
}