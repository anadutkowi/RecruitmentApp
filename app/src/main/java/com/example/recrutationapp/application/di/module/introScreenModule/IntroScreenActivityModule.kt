package com.example.recrutationapp.application.di.module.introScreenModule

import androidx.lifecycle.ViewModel
import com.example.recrutationapp.application.PresenterKey
import com.example.recrutationapp.feature.introScreen.IntroScreenPresenter
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class IntroScreenActivityModule {
    @Binds
    @IntoMap
    @PresenterKey(IntroScreenPresenter::class)
    abstract fun bindAlertActivityViewModel(presenter: IntroScreenPresenter):ViewModel
}