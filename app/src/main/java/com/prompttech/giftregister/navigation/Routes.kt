package com.prompttech.giftregister.navigation

object Route {
    object Welcome {
        const val SPLASH = "splash"
        const val FEATURE = "feature"
        const val TNC = "termscondition"
    }

    object Home {
        object EVENT {
            const val LIST = "events"
            const val MANAGE_EVENT = "manageevent"
        }

        object GIFT {
            const val LIST = "gifts"
            const val MANAGE_GIFT = "managegift"
        }

    }

    object Auth {
        const val REGISTER = "register"

        object Login {
            const val LOGIN = "login"
            const val FORGET_PASSWORD = "forgetpassword"
        }
    }

}

/** To hold the nav graph roots */
object Root {
    const val APPROOT = "approot"
    const val WELCOME = "welcomeroot"
    const val HOME = "homeroot"
    const val AUTH = "authroot"

    object Home {
        const val EVENTS = "eventsroot"
        const val GIFTS = "giftroot"
    }

    object Auth {
        const val LOGIN = "loginroot"
    }
}


