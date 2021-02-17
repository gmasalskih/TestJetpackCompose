package ru.gmasalskikh.testjetpackcompose.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.AmbientContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.gmasalskikh.testjetpackcompose.MainActivity
import ru.gmasalskikh.testjetpackcompose.helper.AmbientAppStateHolder
import ru.gmasalskikh.testjetpackcompose.helper.AmbientScaffoldState
import ru.gmasalskikh.testjetpackcompose.navigation.NavigationCompose

@Composable
fun MyScaffold() {
    val scaffoldState = AmbientScaffoldState.current
    val appStateHolder = AmbientAppStateHolder.current
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            MyAppBar()
        },
        drawerGesturesEnabled = appStateHolder.appState.drawerEnable,
        drawerContent = { MyDrawer() },
        drawerShape = RoundedCornerShape(topRight = 50.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            NavigationCompose()
        }
    }
}

@Composable
fun MySuperAppBar(){
    Box(
        modifier = Modifier
            .height(80.dp)
            .fillMaxWidth()
            .background(Color.Black)
    ) {
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = "AppBar",
            fontSize = 40.sp,
            color = Color.Red
        )
    }
}
