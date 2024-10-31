package com.cwbsoft.templateapp.views.composables.sliderwithcustomthumb

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SliderWithCustomThumb(
    categories: Categories,
    categoriesUI: CategoriesUI,
    generalParameters: GeneralCategoriesParameters,
    modifier: Modifier = Modifier
) {

    Column (
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.Center,
    ){
        categories.categories.forEach { category ->
            Row(
                //   modifier = Modifier.padding(3.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                val categoryUI = categoriesUI.categories.find { it.categoryId == category.categoryId }!!

                Text(text = categoryUI.name)

                Slider(
                    value = category.value,
                    onValueChange = { },
                    steps = generalParameters.numberOfSteps,
                    valueRange = generalParameters.range,
                    colors = SliderDefaults.colors(
                        thumbColor = categoryUI.thumbColor,
                        activeTrackColor = categoryUI.activeTrackColor,
                        inactiveTrackColor = categoryUI.inactiveTrackColor,
                    ),

                    thumb = {

                        Icon(
                            imageVector = categoryUI.icon.imageVector,
                            contentDescription = categoryUI.icon.contentDescription,
                            tint = categoryUI.thumbColor,
                            modifier = Modifier
                                .size(24.dp)
                                .background(color = Color.White)
                                .size(72.dp),
                        )
                    }
                )
            }
        }
    }
}