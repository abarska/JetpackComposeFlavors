package com.example.composeflavortabs.tabcontent

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.composeflavortabs.R

interface TabContentProvider {

    @Composable
    fun TabRootFragment(
        modifier: Modifier = Modifier,
        @StringRes title: Int = R.string.frag_1_title,
        @StringRes contentDescription: Int = R.string.frag_1_content_description,
        @DrawableRes image: Int = R.drawable.frag_1_icon
    )
}