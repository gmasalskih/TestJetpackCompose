package ru.gmasalskikh.testjetpackcompose.screen2

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel

class Screen2ViewModel : ViewModel() {
    val screenText by mutableStateOf("Screen2")
}