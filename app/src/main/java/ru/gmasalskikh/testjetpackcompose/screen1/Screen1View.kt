package ru.gmasalskikh.testjetpackcompose.screen1

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import org.koin.androidx.compose.getViewModel
import ru.gmasalskikh.testjetpackcompose.helper.AmbientAppStateHolder

@Composable
fun Screen1View(vm: Screen1ViewModel = getViewModel()) {
    val appStateHolder = AmbientAppStateHolder.current
    Box(
        modifier = Modifier
            .fillMaxSize()
            .clickable(onClick = appStateHolder.appState.onScreenClick)
    ) {
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = vm.screenState.title,
            fontSize = 50.sp
        )
    }
}