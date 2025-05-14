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
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.prompttech.giftregister.ui.theme.GiftRegisterTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GiftRegisterTheme {
//                Scaffold(
//                    modifier = Modifier.fillMaxSize()
//                ) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier
//                            .padding(innerPadding)
//                            .padding(16.dp)
//                    )
//                }
                SetupAppNavGraph()
            }
        }
    }
}

@Composable
fun SetupAppNavGraph() {
    val navController = rememberNavController() // This is a NavHostController

    NavHost(
        navController = navController,
        startDestination = "SplashScreen"
    ) {
        composable("SplashScreen") {
            SplashScreen(navController)
        }
        composable("WelcomeScreen") {
            WelcomeScreen(navController)
        }
    }
}

@Composable
fun SplashScreen(navController: NavController) {
    Scaffold { innerPadding ->
        Column {
            Text(
                text = "SplashScreen",
                modifier = Modifier
                    .padding(innerPadding)
                    .padding(10.dp),
                style = MaterialTheme.typography.headlineLarge
            )
            Button(onClick = { navController.navigate("WelcomeScreen") }) {
                Text(text = "Go to WelcomeScreen")
            }
        }
    }
}

@Composable
fun WelcomeScreen(navController: NavController) {
    Scaffold { innerPadding ->
        Text(
            text = "WelcomeScreen",
            modifier = Modifier
                .padding(innerPadding)
                .padding(10.dp),
            style = MaterialTheme.typography.headlineLarge
        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = "Hello $name!")
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {}) {
            Text(text = "Submit")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GiftRegisterTheme {
        Greeting("Android")
    }
}