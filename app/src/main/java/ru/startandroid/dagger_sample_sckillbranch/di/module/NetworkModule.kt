package ru.startandroid.dagger_sample_sckillbranch.di.module

import android.content.Context
import android.net.Network
import dagger.Module
import dagger.Provides
import ru.startandroid.dagger_sample_sckillbranch.NetworkMonitor

@Module
class NetworkModule(val context: Context) {

    @Provides
    fun provideNetworkMonitor(): NetworkMonitor = NetworkMonitor(context)
}