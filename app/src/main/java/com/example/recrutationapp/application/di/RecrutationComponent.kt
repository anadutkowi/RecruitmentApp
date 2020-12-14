package com.example.recrutationapp.application.di

import com.example.recrutationapp.application.PresenterFactoryBuilder
import com.example.recrutationapp.application.RecrutationApp
import com.example.recrutationapp.application.di.module.ActivityBuilderModule
import com.example.recrutationapp.application.di.module.RecrutationModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@Component(
    modules = [AndroidSupportInjectionModule::class,
    RecrutationModule::class,
    ActivityBuilderModule::class,
    PresenterFactoryBuilder::class]
)
interface RecrutationComponent : AndroidInjector<RecrutationApp> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<RecrutationApp>()
}