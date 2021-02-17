package ru.gmasalskikh.testjetpackcompose

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import ru.gmasalskikh.testjetpackcompose.di.appStateHolderModule
import ru.gmasalskikh.testjetpackcompose.di.viewModels

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(
                appStateHolderModule,
                viewModels
            )
        }
    }
}