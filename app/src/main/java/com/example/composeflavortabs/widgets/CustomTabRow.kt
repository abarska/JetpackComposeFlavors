package com.example.composeflavortabs.widgets

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableIntState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.core.content.ContextCompat
import androidx.navigation.NavHostController
import com.example.composeflavortabs.R

@Composable
fun CustomTabRow(
    modifier: Modifier = Modifier,
    tabs: List<TabItem>,
    selectedTab: MutableIntState,
    navController: NavHostController
) {
    val selectedColor = MaterialTheme.colorScheme.primary
    val defaultColor = Color.Gray

    TabRow(modifier = modifier, selectedTabIndex = selectedTab.intValue) {
        tabs.forEachIndexed { index, tab ->
            val isSelected = selectedTab.intValue == index
            Tab(
                selected = selectedTab.intValue == index,
                onClick = {
                    selectedTab.intValue = index
                    navController.navigate(tab.route)
                },
                text = {
                    Text(
                        text = stringResource(tab.title),
                        color = if (isSelected) selectedColor else defaultColor
                    )
                },
                icon = {
                    Icon(
                        painter = painterResource(tab.icon),
                        tint = if (isSelected) selectedColor else defaultColor,
                        contentDescription = null
                    )
                }
            )
        }
    }
}