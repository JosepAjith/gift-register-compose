package com.prompttech.giftregister.navigation.welcome

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.prompttech.giftregister.navigation.Root
import com.prompttech.giftregister.navigation.Route
import com.prompttech.giftregister.navigation.welcome.screens.feature.FeatureScreen
import com.prompttech.giftregister.navigation.welcome.screens.splash.SplashScreen
import com.prompttech.giftregister.navigation.welcome.screens.tnc.TermsScreen

fun NavGraphBuilder.welcomeGraph() {

    navigation(startDestination = Route.Welcome.SPLASH, route = Root.WELCOME) {
        composable(Route.Welcome.SPLASH) {
            SplashScreen()
        }

        composable(Route.Welcome.FEATURE) {
            FeatureScreen()
        }

        composable(Route.Welcome.TNC) {
            TermsScreen()
        }
    }

}