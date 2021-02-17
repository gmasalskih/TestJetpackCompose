package ru.gmasalskikh.testjetpackcompose.screen3

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class Screen3ViewModel : ViewModel() {
    val screenText by mutableStateOf("Screen3")
}