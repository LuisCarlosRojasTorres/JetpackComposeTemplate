package com.cwbsoft.templateapp.views.composables

import android.content.Context
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cwbsoft.templateapp.utils.DummyToast

@Composable
fun CardButton(){
    val mContext = LocalContext.current

    Card (
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp),
        onClick = {DummyToast(mContext, "Lobo", 1)}
    ){
        Text(text = "Horoscopo do dia ")
        Text(text = "Saiba como isso é bom ")
    }
}



@Preview(showBackground = true)
@Composable
fun CardButtonPreview()
{
    CardButton()
}