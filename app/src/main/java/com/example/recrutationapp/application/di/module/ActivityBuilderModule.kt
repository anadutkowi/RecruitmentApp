package com.example.recrutationapp.application.di.module

import com.example.recrutationapp.application.di.module.accountDetailsModule.AccountDetailsActivityModule
import com.example.recrutationapp.application.di.module.accountSearchModule.AccountSearchActivityModule
import com.example.recrutationapp.application.di.module.introScreenModule.IntroScreenActivityModule
import com.example.recrutationapp.feature.accountDetails.AccountDetailsActivity
import com.example.recrutationapp.feature.accountSearch.AccountSearchActivity
import com.example.recrutationapp.feature.introScreen.IntroScreenActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBuilderModule {
    @ContributesAndroidInjector(modules = [AccountSearchActivityModule::class])
    abstract fun accountSearchActivity(): AccountSearchActivity

    @ContributesAndroidInjector(modules = [AccountDetailsActivityModule::class])
    abstract fun accountDetailsActivity(): AccountDetailsActivity

    @ContributesAndroidInjector(modules = [IntroScreenActivityModule::class])
    abstract fun introScreenActivity(): IntroScreenActivity


}