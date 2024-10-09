package com.cwbsoft.templateapp.views.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DummyScreen(navigatingToAnotherScreen:()-> Unit)
{
    val nameOfScreen = remember {mutableStateOf("DummyScreen1")}

    Text("This is the ${nameOfScreen.value}", fontSize = 24.sp)
    Spacer(modifier = Modifier.height(16.dp))
    Spacer(modifier = Modifier.height(16.dp))
    Button(onClick =
    {
        navigatingToAnotherScreen()
    }) {
        Text(text = "Go to Another screen")
    }

}