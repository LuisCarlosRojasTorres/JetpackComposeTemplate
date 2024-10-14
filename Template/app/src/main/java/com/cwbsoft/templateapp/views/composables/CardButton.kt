package com.cwbsoft.templateapp.views.composables

import android.content.Context
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cwbsoft.templateapp.R
import com.cwbsoft.templateapp.utils.dummyToast

@Composable
fun CardButton(title: String = "DummyTitle",
               content: String = "DummyContent"){

    val mContext = LocalContext.current

    Card (
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp),
        onClick = {dummyToast(mContext, title, 1)}
    ){
        Text(text = title, fontWeight = FontWeight.Bold, fontSize = 20.sp)
        Text(text = content, fontSize = 14.sp)
    }

}

@Composable
fun ElevatedCardButton(title: String = "ElevatedDummyTitle",
                       content: String = "ELevated DummyContent"){

    val mContext = LocalContext.current

    ElevatedCard (
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp),
        onClick = {dummyToast(mContext, title, 1)}
    ){
        Text(text = title, fontWeight = FontWeight.Bold, fontSize = 20.sp)
        Text(text = content, fontSize = 14.sp)
    }
}

@Composable
fun FrameImageButton(title: String = "DummyTitle", content: String = "DummyContent"){

    val mContext = LocalContext.current

    Column (modifier = Modifier
        .border(BorderStroke(1.dp, Color.Black))
        .clip(RoundedCornerShape(10.dp))){

        Image(painterResource(id = R.drawable.background_purple),
            contentDescription = "Lobo lobo lobo",
            contentScale = ContentScale.Fit
        )

        Text(text = title, fontWeight = FontWeight.Bold, fontSize = 20.sp)
        Text(text = content, fontSize = 14.sp)
    }

}

@Preview(showBackground = true)
@Composable
fun CardButtonPreview()
{
    CardButton()
}