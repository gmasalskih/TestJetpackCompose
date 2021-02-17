package ru.gmasalskikh.testjetpackcompose.screen_app

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

data class AppState(
    val appBarTitle: String = "",
    val appBarNavIcon: ImageVector = Icons.Filled.Menu,
    val onAppBarNavIconClick: () -> Unit = {},
    val appBarColor: Color = Color.Blue,
    val drawerEnable: Boolean = true,
    val onScreenClick: () -> Unit = {}
)