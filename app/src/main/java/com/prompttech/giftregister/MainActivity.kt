package com.prompttech.giftregister

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.prompttech.giftregister.navigation.AppNavGraph
import com.prompttech.giftregister.navigation.Root
import com.prompttech.giftregister.navigation.Route
import com.prompttech.giftregister.ui.theme.GiftRegisterTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {
    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GiftRegisterTheme {
                SetupAppNavGraph()
            }
        }
    }

    @Composable
    fun SetupAppNavGraph() {
        navController = rememberNavController() // This is a NavHostController
        LaunchedEffect(Unit) {
            delay(3000)
            navController.navigate(Root.Auth.LOGIN)
        }
        AppNavGraph(navController = navController)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GiftRegisterTheme {
    }
}