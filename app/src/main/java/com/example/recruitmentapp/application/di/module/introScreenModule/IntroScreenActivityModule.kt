package com.example.recruitmentapp.application.di.module.introScreenModule

import androidx.lifecycle.ViewModel
import com.example.recruitmentapp.application.PresenterKey
import com.example.recruitmentapp.feature.introScreen.IntroScreenPresenter
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