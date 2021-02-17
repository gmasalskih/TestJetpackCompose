package ru.gmasalskikh.testjetpackcompose.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.gmasalskikh.testjetpackcompose.helper.AmbientAppStateHolder

@Composable
fun MyAppBar() {
    val appController = AmbientAppStateHolder.current
    TopAppBar(
        title = {
            Text(text = appController.appState.appBarTitle)
        },
        navigationIcon = {
            Image(
                modifier = Modifier
                    .clickable(onClick = appController.appState.onAppBarNavIconClick)
                    .fillMaxHeight()
                    .aspectRatio(1f)
                    .padding(10.dp),
                imageVector = appController.appState.appBarNavIcon,
                contentDescription = null
            )
        },
        backgroundColor = appController.appState.appBarColor
    )
}