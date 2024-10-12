package com.cwbsoft.templateapp.views.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun FrameImageCardButton(){
    Card (
        Modifier.fillMaxWidth().padding(16.dp)
    ){
        Text(text = "Horoscopo do dia ")
        Text(text = "Saiba como isso é bom ")
    }
}



@Preview(showBackground = true)
@Composable
fun FrameImageCardButtonPreview()
{
    FrameImageCardButton()
}