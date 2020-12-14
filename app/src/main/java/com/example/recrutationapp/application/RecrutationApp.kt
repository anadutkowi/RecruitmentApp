package com.example.recrutationapp.application

import com.example.recrutationapp.application.di.DaggerRecrutationComponent
import com.facebook.stetho.BuildConfig
import com.facebook.stetho.Stetho
import com.jakewharton.threetenabp.AndroidThreeTen
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import timber.log.Timber.*



class RecrutationApp: DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerRecrutationComponent.builder().create(this)
    }

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
        AndroidThreeTen.init(this)
        if (BuildConfig.DEBUG) plant(DebugTree())
    }
}