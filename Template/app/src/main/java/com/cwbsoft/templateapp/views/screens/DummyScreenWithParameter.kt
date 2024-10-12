package com.cwbsoft.templateapp.views.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.cwbsoft.templateapp.views.composables.FrameImageCardButton

@Composable
fun DummyScreenWithParameters()
{
    FrameImageCardButton()
}

@Preview(showBackground = true)
@Composable
fun DummyScreenWithParametersPreview()
{
    DummyScreen()
}