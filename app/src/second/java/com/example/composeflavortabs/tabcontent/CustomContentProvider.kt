package com.example.composeflavortabs.tabcontent

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.unit.dp

class CustomContentProvider: TabContentProvider {
    @Composable
    override fun TabRootFragment(modifier: Modifier, title: Int, contentDescription: Int, image: Int) {
        Row(
            modifier = modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                modifier = Modifier
                    .padding(16.dp)
                    .width(50.dp)
                    .height(50.dp),
                painter = painterResource(image),
                colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.primary),
                contentDescription = stringResource(contentDescription)
            )
            Text(
                modifier = Modifier.padding(16.dp),
                text = stringResource(title),
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}