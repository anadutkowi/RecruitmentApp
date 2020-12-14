package com.example.recrutationapp.application.di.module

import android.content.Context
import android.content.SharedPreferences
import com.example.recrutationapp.application.RecrutationApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class RecrutationModule {
    @Module
    companion object{
        @Provides
        @Singleton
        @JvmStatic
        fun provideAppContext(recrutationApp: RecrutationApp): Context =
            recrutationApp.applicationContext

        @Provides
        @Singleton
        @JvmStatic
        fun provideSharedPreferences(context: Context): SharedPreferences =
            context.getSharedPreferences(PREFS_FILENAME, Context.MODE_PRIVATE)

        private const val PREFS_FILENAME = "com.example.recrutationapp.pref"

    }
}