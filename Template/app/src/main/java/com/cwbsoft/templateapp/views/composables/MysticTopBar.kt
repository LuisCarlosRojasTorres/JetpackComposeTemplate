package com.cwbsoft.templateapp.views.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cwbsoft.templateapp.R
import com.cwbsoft.templateapp.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MysticTopBar(nameText: String, signId: Int,
                 containerColor: Color,
                 titleColor: Color,
                 signColor: Color

) {
    val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior(rememberTopAppBarState())

    LargeTopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = containerColor,
            titleContentColor = titleColor,
        ),
        title = {
            Row {
                Text(
                    stringResource(id = R.string.hello) + " " + nameText
                )
                Image(modifier = Modifier.clickable { /* lambda*/ }.size(24.dp,24.dp).align(Alignment.CenterVertically),
                    painter = painterResource(signId),
                    contentDescription = "textId3",
                    colorFilter = ColorFilter.tint(signColor)
                )
            }
        },
        actions = {
            IconButton(onClick = { /* do something */ }) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "Localized description"
                )
            }
        },
        scrollBehavior = scrollBehavior
    )
}

@Preview(showBackground = true)
@Composable
fun MysticTopBarPreview()
{
    MysticTopBar("Fulane", R.drawable.escorpion, Purple80, Color.Black, Color.Black)
}