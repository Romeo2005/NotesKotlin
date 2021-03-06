package org.romeo.noteskotlin

import androidx.multidex.MultiDexApplication
import org.koin.core.context.startKoin

class App : MultiDexApplication() {
    override fun onCreate() {
        super.onCreate()

        startKoin { modules(appModule) }
    }
}