package ru.gmasalskikh.testjetpackcompose.screen_app

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Providers
import org.koin.androidx.compose.get
import ru.gmasalskikh.testjetpackcompose.helper.AmbientAppStateHolder
import ru.gmasalskikh.testjetpackcompose.helper.AmbientScaffoldState
import ru.gmasalskikh.testjetpackcompose.widgets.MyScaffold

@Composable
fun AppView(appStateHolder: AppStateHolder = get()) {
    val scaffoldState = rememberScaffoldState()
    Providers(
        AmbientAppStateHolder provides appStateHolder,
        AmbientScaffoldState provides scaffoldState
    ) {
        MyScaffold()
    }
}

