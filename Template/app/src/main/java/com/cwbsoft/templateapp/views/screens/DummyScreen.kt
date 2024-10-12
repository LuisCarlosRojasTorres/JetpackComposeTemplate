package com.cwbsoft.templateapp.views.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cwbsoft.templateapp.views.composables.CardButton

@Composable
fun DummyScreen(modifier: Modifier)
{
    Column (modifier = Modifier.padding(24.dp)){
        CardButton()
    }

}

@Preview(showBackground = true)
@Composable
fun DummyScreenPreview()
{
    DummyScreen(Modifier.padding(24.dp))
}