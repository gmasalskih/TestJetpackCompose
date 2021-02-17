package ru.gmasalskikh.testjetpackcompose.screen1

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel

class Screen1ViewModel : ViewModel() {
    val screenState by mutableStateOf(Screen1State())
}