package com.cwbsoft.templateapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cwbsoft.templateapp.ui.theme.TemplateAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TemplateAppTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    MyApp()
                }
            }
        }
    }
}

@Composable
fun MyApp(){
    /*
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "DummyScreenWithParameters"){
        composable ( "firstscreen" ){
            tScreen {
                navController.navigate(route = "secondscreen")
            }
        }
        composable ( "secondscreen" ){
            SecondScreen {
                navController.navigate(route = "firstscreen")
            }
        }
    }

     */
}
