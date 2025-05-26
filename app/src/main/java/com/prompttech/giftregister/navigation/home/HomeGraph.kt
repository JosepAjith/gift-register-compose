package com.prompttech.giftregister.navigation.home

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.prompttech.giftregister.navigation.Root
import com.prompttech.giftregister.navigation.Route
import com.prompttech.giftregister.navigation.home.event.EventListScreen
import com.prompttech.giftregister.navigation.home.event.ManageEventScreen
import com.prompttech.giftregister.navigation.home.gift.GiftListScreen
import com.prompttech.giftregister.navigation.home.gift.ManageGiftScreen


fun NavGraphBuilder.homeGraph() {
    eventGraph()
    giftGraph()
}

fun NavGraphBuilder.eventGraph() {
    navigation(startDestination = Route.Home.EVENT.LIST, route = Root.Home.EVENTS) {
        composable(Route.Home.EVENT.LIST) {
            EventListScreen()
        }

        composable(Route.Home.EVENT.MANAGE_EVENT) {
            ManageEventScreen()
        }
    }
}

fun NavGraphBuilder.giftGraph() {
    navigation(startDestination = Route.Home.GIFT.LIST, route = Root.Home.GIFTS) {
        composable(Route.Home.GIFT.LIST) {
            GiftListScreen()
        }
        composable(Route.Home.GIFT.MANAGE_GIFT) {
            ManageGiftScreen()
        }
    }
}