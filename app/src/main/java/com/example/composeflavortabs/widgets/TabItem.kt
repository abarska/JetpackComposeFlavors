package com.example.composeflavortabs.widgets

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.composeflavortabs.R

sealed class TabItem(@StringRes val title: Int, @DrawableRes val icon: Int, val route: String) {
    data object Tab1 : TabItem(title = R.string.tab_1_title, R.drawable.frag_1_icon, "fragment1")
    data object Tab2 : TabItem(title = R.string.tab_2_title, R.drawable.frag_2_icon, "fragment2")
    data object Tab3 : TabItem(title = R.string.tab_3_title, R.drawable.frag_3_icon, "fragment3")
}