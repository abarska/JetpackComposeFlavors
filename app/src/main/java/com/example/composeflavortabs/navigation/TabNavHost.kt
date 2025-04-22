package com.example.composeflavortabs.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.composeflavortabs.R
import com.example.composeflavortabs.fragments.TabRootFragment
import com.example.composeflavortabs.widgets.TabItem

@Composable
fun TabNavHost(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = TabItem.Tab1.route,
        modifier = modifier
    ) {
        composable(TabItem.Tab1.route) {
            TabRootFragment(
                title = R.string.frag_1_title,
                contentDescription = R.string.frag_1_content_description,
                image = R.drawable.frag_1_icon
            )
        }
        composable(TabItem.Tab2.route) {
            TabRootFragment(
                title = R.string.frag_2_title,
                contentDescription = R.string.frag_2_content_description,
                image = R.drawable.frag_2_icon
            )
        }
        composable(TabItem.Tab3.route) {
            TabRootFragment(
                title = R.string.frag_3_title,
                contentDescription = R.string.frag_3_content_description,
                image = R.drawable.frag_3_icon
            )
        }
    }
}