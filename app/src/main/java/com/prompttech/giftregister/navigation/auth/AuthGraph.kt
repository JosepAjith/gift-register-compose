package com.prompttech.giftregister.navigation.auth

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.prompttech.giftregister.navigation.Root
import com.prompttech.giftregister.navigation.Route
import com.prompttech.giftregister.navigation.auth.screens.ForgotPasswordScreen
import com.prompttech.giftregister.navigation.auth.screens.LoginScreen
import com.prompttech.giftregister.navigation.auth.screens.RegisterScreen


fun NavGraphBuilder.authNavGraph() {
    navigation(startDestination = Root.Auth.LOGIN, route = Root.AUTH) {
        composable(Route.Auth.REGISTER) {
            RegisterScreen()
        }
        loginNavGraph()
    }

}

fun NavGraphBuilder.loginNavGraph() {
    navigation(startDestination = Route.Auth.Login.LOGIN, route = Root.Auth.LOGIN) {
        composable(Route.Auth.Login.LOGIN) {
            LoginScreen()
        }
        composable(Route.Auth.Login.FORGET_PASSWORD) {
            ForgotPasswordScreen()
        }
    }
}