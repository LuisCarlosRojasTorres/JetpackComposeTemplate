package com.cwbsoft.templateapp.views.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cwbsoft.templateapp.R
import com.cwbsoft.templateapp.views.composables.BottomAppBarExample
import com.cwbsoft.templateapp.views.composables.CardButton
import com.cwbsoft.templateapp.views.composables.ElevatedCardButton
import com.cwbsoft.templateapp.views.composables.FrameImageButton
import com.cwbsoft.templateapp.views.composables.ThreeElementsBottomAppBar


@Composable
fun DummyScreen(modifier: Modifier)
{
    Scaffold(
        bottomBar = { ThreeElementsBottomAppBar() }
    )
    { innerPadding ->
        Column (modifier = Modifier.padding(innerPadding)){
            CardButton(
                title = stringResource(id = R.string.dummy_title),
                content = stringResource(id = R.string.dummy_content))

            Spacer(modifier = Modifier.height(12.dp))

            ElevatedCardButton(
                content = stringResource(id = R.string.dummy_content))

            Spacer(modifier = Modifier.height(12.dp))

            FrameImageButton(
                title = "FrameImageButton",
                content = stringResource(id = R.string.dummy_content))

        }
    }




}

@Preview(showBackground = true)
@Composable
fun DummyScreenPreview()
{
    DummyScreen(Modifier.padding(24.dp))
}