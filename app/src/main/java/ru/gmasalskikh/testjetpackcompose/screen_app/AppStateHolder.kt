package ru.gmasalskikh.testjetpackcompose.screen_app

import androidx.compose.runtime.*

class AppStateHolder {
    var appState: AppState by mutableStateOf(AppState())
}