package ru.startandroid.dagger_sample_sckillbranch

import android.app.Application
import android.content.Context
import javax.inject.Inject
import javax.inject.Singleton

class App: Application() {

    companion object{
        private var instance: App? = null
        fun applicationContext(): Context {
            return instance!!.applicationContext
        }
    }

    @Inject
    lateinit var monitor: NetworkMonitor
    @Inject
    lateinit var preferences: PrefManager

    init {
        instance = this
    }

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent().builder()
    }
}