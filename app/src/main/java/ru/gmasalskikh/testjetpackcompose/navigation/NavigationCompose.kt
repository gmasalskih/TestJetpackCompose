package ru.gmasalskikh.testjetpackcompose.navigation

import android.util.Log
import android.widget.Toast
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.AmbientContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import ru.gmasalskikh.testjetpackcompose.helper.AmbientAppStateHolder
import ru.gmasalskikh.testjetpackcompose.helper.AmbientScaffoldState
import ru.gmasalskikh.testjetpackcompose.screen1.Screen1View
import ru.gmasalskikh.testjetpackcompose.screen2.Screen2View
import ru.gmasalskikh.testjetpackcompose.screen3.Screen3View

@Composable
fun NavigationCompose() {
    val navController = rememberNavController()
    val appStateHolder = AmbientAppStateHolder.current
    val scaffoldState = AmbientScaffoldState.current
    val context = AmbientContext.current
    NavHost(
        navController = navController,
        startDestination = NavigationDestination.SCREEN1.name
    ) {

        composable(NavigationDestination.SCREEN1.name) {
            appStateHolder.appState = appStateHolder.appState.copy(
                appBarTitle = "SCREEN1",
                appBarNavIcon = Icons.Filled.Menu,
                onAppBarNavIconClick = {
                    if (scaffoldState.drawerState.isOpen) scaffoldState.drawerState.close()
                    else scaffoldState.drawerState.open()
                },
                drawerEnable = true,
                appBarColor = Color.Yellow,
                onScreenClick = {
                    navController.navigate(NavigationDestination.SCREEN2.name)
                }
            )
            Screen1View()
        }


        composable(NavigationDestination.SCREEN2.name) {
            scaffoldState.drawerState.close()
            appStateHolder.appState = appStateHolder.appState.copy(
                appBarTitle = "SCREEN2",
                appBarNavIcon = Icons.Filled.ArrowBack,
                onAppBarNavIconClick = {
                    navController.popBackStack()
                },
                drawerEnable = false,
                appBarColor = Color.Red,
                onScreenClick = {
                    navController.navigate(NavigationDestination.SCREEN3.name)
                }
            )
            Screen2View()
        }




        composable(NavigationDestination.SCREEN3.name) {
            appStateHolder.appState = appStateHolder.appState.copy(
                appBarTitle = "SCREEN3",
                appBarNavIcon = Icons.Filled.Star,
                onAppBarNavIconClick = {
                    Toast.makeText(context, "Click to star button", Toast.LENGTH_SHORT).show()
                },
                drawerEnable = true,
                appBarColor = Color.Green,
                onScreenClick = {
                    navController.popBackStack()
                }
            )
            Screen3View()
        }


    }
}