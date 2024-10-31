package com.cwbsoft.templateapp.views.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cwbsoft.templateapp.R
import com.cwbsoft.templateapp.ui.theme.Purple80
import com.cwbsoft.templateapp.views.composables.CardButton
import com.cwbsoft.templateapp.views.composables.ElevatedCardButton
import com.cwbsoft.templateapp.views.composables.FrameImageButton
import com.cwbsoft.templateapp.views.composables.ThreeElementsBottomAppBar
import com.cwbsoft.templateapp.views.composables.sliderwithcustomthumb.Categories
import com.cwbsoft.templateapp.views.composables.sliderwithcustomthumb.CategoriesUI
import com.cwbsoft.templateapp.views.composables.sliderwithcustomthumb.Category
import com.cwbsoft.templateapp.views.composables.sliderwithcustomthumb.CategoryIcon
import com.cwbsoft.templateapp.views.composables.sliderwithcustomthumb.CategoryUI
import com.cwbsoft.templateapp.views.composables.sliderwithcustomthumb.GeneralCategoriesParameters
import com.cwbsoft.templateapp.views.composables.sliderwithcustomthumb.SliderWithCustomThumb


@Composable
fun DummyScreen(modifier: Modifier)
{
    Scaffold(
        bottomBar = { ThreeElementsBottomAppBar(
            R.drawable.sad, "As inimigas",
            R.drawable.home, "Main",
            R.drawable.favorite, "Amor",
            Purple80) }
    )
    { innerPadding ->
        Column (
            modifier = Modifier.padding(innerPadding).verticalScroll(rememberScrollState())
        ){
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

            val categoriesPoints = fetchCategoriesPoints()
            val categoriesUi = initializeCategoriesUis()


            SliderWithCustomThumb(
                categories = categoriesPoints,
                categoriesUI = categoriesUi,
                generalParameters = GeneralCategoriesParameters(
                    numberOfSteps = 4,
                    range = 0f..5f,
                ),
                modifier = Modifier.padding(innerPadding)
            )

        }
    }




}

@Preview(showBackground = true)
@Composable
fun DummyScreenPreview()
{
    DummyScreen(Modifier.padding(24.dp))
}

fun fetchCategoriesPoints(): Categories{
    return Categories(listOf(
        Category(
            categoryId = "family",
            value = 1f,
        ),
        Category(
            categoryId = "money",
            value = 2f,
        ),
        Category(
            categoryId = "love",
            value = 3f,
        ),
        Category(
            categoryId = "health",
            value = 3f,
        )
        ,
        Category(
            categoryId = "work",
            value = 3f,
        )
    ))
}

@Composable
fun initializeCategoriesUis(): CategoriesUI{
    return CategoriesUI(listOf(
        CategoryUI(
            name = stringResource(id = R.string.family),
            categoryId = "family",
            thumbColor = Color.DarkGray,
            activeTrackColor = MaterialTheme.colorScheme.secondary,
            inactiveTrackColor = MaterialTheme.colorScheme.secondaryContainer,
            icon = CategoryIcon(imageVector = Icons.Filled.AccountCircle, contentDescription = null)
        ),
        CategoryUI(
            name = stringResource(id = R.string.money),
            categoryId = "money",
            thumbColor = Color.Yellow,
            activeTrackColor = MaterialTheme.colorScheme.secondary,
            inactiveTrackColor = MaterialTheme.colorScheme.secondaryContainer,
            icon = CategoryIcon(imageVector = Icons.Filled.Home, contentDescription = null)
        ),
        CategoryUI(
            name = stringResource(id = R.string.love),
            categoryId = "love",
            thumbColor = Color.Red,
            activeTrackColor = MaterialTheme.colorScheme.secondary,
            inactiveTrackColor = MaterialTheme.colorScheme.secondaryContainer,
            icon = CategoryIcon(imageVector = Icons.Filled.Favorite, contentDescription = null)
        ),
        CategoryUI(
            name = stringResource(id = R.string.health),
            categoryId = "health",
            thumbColor = Color.Green,
            activeTrackColor = MaterialTheme.colorScheme.secondary,
            inactiveTrackColor = MaterialTheme.colorScheme.secondaryContainer,
            icon = CategoryIcon(imageVector = Icons.Filled.AddCircle, contentDescription = null)
        ),
        CategoryUI(
            name = stringResource(id = R.string.work),
            categoryId = "work",
            thumbColor = Color.Green,
            activeTrackColor = MaterialTheme.colorScheme.secondary,
            inactiveTrackColor = MaterialTheme.colorScheme.secondaryContainer,
            icon = CategoryIcon(imageVector = Icons.Filled.Edit, contentDescription = null)
        )
    ))
}
