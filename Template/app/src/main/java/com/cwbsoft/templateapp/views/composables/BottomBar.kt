package com.cwbsoft.templateapp.views.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource

@Composable
fun BottomAppBarExample() {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                actions = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(Icons.Filled.Check, contentDescription = "Localized description")
                    }
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            Icons.Filled.Edit,
                            contentDescription = "Localized description",
                        )
                    }
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            Icons.Filled.CheckCircle,
                            contentDescription = "Localized description",
                        )
                    }
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            Icons.Filled.AccountBox,
                            contentDescription = "Localized description",
                        )
                    }
                }
            )
        },
    ) { innerPadding ->
        Text(
            modifier = Modifier.padding(innerPadding),
            text = "Example of a scaffold with a bottom app bar."
        )
    }
}

@Composable
fun ThreeElementsBottomAppBar(
    drawableId1: Int,textId1: String,
    drawableId2: Int,textId2: String,
    drawableId3: Int,textId3: String,
    color: Color
) {
    BottomAppBar(
        actions = {
            Image(modifier = Modifier.clickable { /* lambda*/ },
                painter = painterResource(drawableId1),
                contentDescription = textId1,
                colorFilter = ColorFilter.tint(color))

            Image(modifier = Modifier.clickable { /* lambda*/ },
                painter = painterResource(drawableId2),
                contentDescription = textId2,
                colorFilter = ColorFilter.tint(color))

            Image(modifier = Modifier.clickable { /* lambda*/ },
                painter = painterResource(drawableId3),
                contentDescription = textId3,
                colorFilter = ColorFilter.tint(color))
        }
    )
}