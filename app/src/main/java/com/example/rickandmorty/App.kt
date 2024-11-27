package com.example.rickandmorty

import android.app.Application
import com.example.rickandmorty.data.dataModule
import com.example.rickandmorty.ui.uiModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@App)
            modules(dataModule)
            modules(uiModule)
        }
    }
}