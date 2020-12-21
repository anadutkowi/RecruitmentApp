package com.example.recruitmentapp.application.di

import com.example.recruitmentapp.application.PresenterFactoryBuilder
import com.example.recruitmentapp.application.RecruitmentApp
import com.example.recruitmentapp.application.di.module.ActivityBuilderModule
import com.example.recruitmentapp.application.di.module.RecrutationModule
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
interface RecrutationComponent : AndroidInjector<RecruitmentApp> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<RecruitmentApp>()
}