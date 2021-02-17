package ru.gmasalskikh.testjetpackcompose.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import ru.gmasalskikh.testjetpackcompose.screen1.Screen1ViewModel
import ru.gmasalskikh.testjetpackcompose.screen2.Screen2ViewModel
import ru.gmasalskikh.testjetpackcompose.screen3.Screen3ViewModel
import ru.gmasalskikh.testjetpackcompose.screen_app.AppStateHolder

val appStateHolderModule = module {
    single { AppStateHolder() }
}

val viewModels = module {
    viewModel { Screen1ViewModel() }
    viewModel { Screen2ViewModel() }
    viewModel { Screen3ViewModel() }
}