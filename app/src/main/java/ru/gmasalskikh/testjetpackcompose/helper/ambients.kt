package ru.gmasalskikh.testjetpackcompose.helper

import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.ambientOf
import ru.gmasalskikh.testjetpackcompose.screen_app.AppState
import ru.gmasalskikh.testjetpackcompose.screen_app.AppStateHolder

val AmbientAppStateHolder = ambientOf<AppStateHolder>()
val AmbientScaffoldState = ambientOf<ScaffoldState>()