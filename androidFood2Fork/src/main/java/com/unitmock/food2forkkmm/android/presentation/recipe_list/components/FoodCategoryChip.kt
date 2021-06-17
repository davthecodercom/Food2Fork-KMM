package com.unitmock.food2forkkmm.android.presentation.recipe_list.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.unitmock.food2forkkmm.presentation.recipe_list.FoodCategory

@Composable
fun FoodCategoryChip(
    category: FoodCategory,
    isSelected: Boolean = false,
    onSelectedCategoryChanged: (String) -> Unit,
) {
    Surface(
        modifier = Modifier.padding(end = 8.dp),
        elevation = 8.dp,
        shape = MaterialTheme.shapes.medium,
        color = if (isSelected) Color.Companion.LightGray else MaterialTheme.colors.primary,
    ) {
        Row(
            Modifier.toggleable(
                value = isSelected,
                onValueChange = {
                    onSelectedCategoryChanged(category.value)
                }
            )
        ) {
            Text(
                text = category.value,
                style = MaterialTheme.typography.body2,
                color = Color.White,
                modifier = Modifier.padding(8.dp)
            )

        }

    }
}