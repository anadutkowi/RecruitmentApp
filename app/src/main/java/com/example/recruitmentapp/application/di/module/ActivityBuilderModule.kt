package com.example.recruitmentapp.application.di.module

import com.example.recruitmentapp.application.di.module.accountDetailsModule.AccountDetailsActivityModule
import com.example.recruitmentapp.application.di.module.accountSearchModule.AccountSearchActivityModule
import com.example.recruitmentapp.application.di.module.introScreenModule.IntroScreenActivityModule
import com.example.recruitmentapp.feature.accountDetails.AccountDetailsActivity
import com.example.recruitmentapp.feature.accountSearch.AccountSearchActivity
import com.example.recruitmentapp.feature.introScreen.IntroScreenActivity
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