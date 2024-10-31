package com.cwbsoft.templateapp.views.composables.sliderwithcustomthumb

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector


data class CategoryIcon(
    val imageVector: ImageVector,
    val contentDescription: String?,
)

data class CategoryUI(
    val categoryId: String,
    val name: String,
    val thumbColor: Color,
    val activeTrackColor: Color,
    val inactiveTrackColor: Color,
    val icon: CategoryIcon,
)


data class Category (
    val categoryId: String,
    val value: Float,
)

data class GeneralCategoriesParameters(
    val numberOfSteps : Int,
    val range : ClosedFloatingPointRange<Float>,
)

data class Categories ( val categories: List<Category>)

data class CategoriesUI ( val categories: List<CategoryUI>)

