package ru.startandroid.dagger_sample_sckillbranch.di.components

import dagger.Component
import ru.startandroid.dagger_sample_sckillbranch.App
import ru.startandroid.dagger_sample_sckillbranch.di.module.NetworkModule
import ru.startandroid.dagger_sample_sckillbranch.di.module.PreferencesModule

@Component(modules = [PreferencesModule::class, NetworkModule::class])
interface AppComponent {
    fun inject(app: App)
}