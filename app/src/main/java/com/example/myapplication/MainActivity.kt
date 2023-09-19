package com.example.myapplication

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "Portada") {
                        composable("NewPlayer"){MenuNewPlayer()}
                        composable("Portada") {PlayJuegosIRB(navController)}
                    }

                    val configuration = LocalConfiguration.current

                    when (configuration.orientation){
                        Configuration.ORIENTATION_LANDSCAPE -> {
                            Horizontal(navController)
                        }
                    }

                }

            }
        }
    }
}

/*
@Preview(showBackground = true)
@Composable
fun Preview() {
    MyApplicationTheme {
        PlayJuegosIRB()
    }
}

 */