package ru.startandroid.dagger_sample_sckillbranch.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import ru.startandroid.dagger_sample_sckillbranch.PrefManager

@Module
class PreferencesModule(val context: Context) {

    @Provides
    fun providePrefManager():PrefManager = PrefManager(context)
}