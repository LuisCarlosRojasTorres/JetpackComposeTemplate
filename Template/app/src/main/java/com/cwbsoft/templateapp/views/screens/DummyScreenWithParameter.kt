package com.cwbsoft.templateapp.views.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cwbsoft.templateapp.views.composables.CardButton

@Composable
fun DummyScreenWithParameters()
{
    CardButton()
}

@Preview(showBackground = true)
@Composable
fun DummyScreenWithParametersPreview()
{
    DummyScreen(Modifier.padding(24.dp))
}