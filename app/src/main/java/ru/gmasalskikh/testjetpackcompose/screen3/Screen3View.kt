package ru.gmasalskikh.testjetpackcompose.screen3

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
import ru.gmasalskikh.testjetpackcompose.screen1.Screen1ViewModel

@Composable
fun Screen3View(vm: Screen3ViewModel = getViewModel()) {
    val appState = AmbientAppStateHolder.current.appState
    Box(
        modifier = Modifier
            .fillMaxSize()
            .clickable(onClick = appState.onScreenClick)
    ) {
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = vm.screenText,
            fontSize = 50.sp
        )
    }
}