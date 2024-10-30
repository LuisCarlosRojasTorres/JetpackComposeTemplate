package com.cwbsoft.templateapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cwbsoft.templateapp.ui.theme.TemplateAppTheme
import com.cwbsoft.templateapp.views.screens.DummyScreen

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

@Preview(showBackground = true)
@Composable
fun MyApp(){
    DummyScreen(Modifier.padding(24.dp))
}
