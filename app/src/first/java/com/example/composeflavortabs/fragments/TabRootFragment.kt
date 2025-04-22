package com.example.composeflavortabs.fragments

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeflavortabs.R

@Preview
@Composable
fun TabRootFragment(
    modifier: Modifier = Modifier,
    @StringRes title: Int = R.string.frag_1_title,
    @StringRes contentDescription: Int = R.string.frag_1_content_description,
    @DrawableRes image: Int = R.drawable.frag_1_icon
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.padding(16.dp),
            text = stringResource(title),
            style = MaterialTheme.typography.headlineLarge
        )
        Image(
            modifier = Modifier
                .padding(24.dp)
                .width(150.dp)
                .height(150.dp),
            painter = painterResource(image),
            colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.primary),
            contentDescription = stringResource(contentDescription)
        )
    }
}