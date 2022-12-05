package com.pragma.appmodulardemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pragma.appmodulardemo.features.breed.utils.Route
import com.pragma.appmodulardemo.ui.theme.AppmodulardemoTheme
import com.pragma.democatbreed.features.breeds.fragment.breed.BreedsFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppmodulardemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Route.BreedsList.route
    ) {
        composable(route = Route.BreedsList.route) {
            BreedsFragment()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AppmodulardemoTheme {
        Greeting("Android")
    }
}