package com.example.composeflavortabs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat
import androidx.navigation.compose.rememberNavController
import com.example.composeflavortabs.navigation.TabNavHost
import com.example.composeflavortabs.ui.theme.ComposeFlavorTabsTheme
import com.example.composeflavortabs.widgets.CustomTabRow
import com.example.composeflavortabs.widgets.TabItem

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            ComposeFlavorTabsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val tabs = listOf(TabItem.Tab1, TabItem.Tab2, TabItem.Tab3)
                    val selectedTab = remember { mutableIntStateOf(0) }
                    val navController = rememberNavController()
                    val topNav = resources.getBoolean(R.bool.topNavigation)

                    Scaffold(
                        topBar = {
                            if (topNav) CustomTabRow(
                                modifier = Modifier.statusBarsPadding(),
                                tabs = tabs,
                                selectedTab = selectedTab,
                                navController = navController
                            )
                        },
                        bottomBar = {
                            if (!topNav) CustomTabRow(
                                modifier = Modifier.navigationBarsPadding(),
                                tabs = tabs,
                                selectedTab = selectedTab,
                                navController = navController
                            )
                        },
                        contentWindowInsets = WindowInsets.safeDrawing
                    ) { innerPadding ->
                        TabNavHost(navController, Modifier.padding(innerPadding))
                    }
                }
            }
        }
    }
}