package com.example.recrutationapp.application.di.module.accountSearchModule

import androidx.lifecycle.ViewModel
import com.example.recrutationapp.application.PresenterKey
import com.example.recrutationapp.feature.accountSearch.AccountSearchPresenter
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AccountSearchActivityModule {
    @Binds
    @IntoMap
    @PresenterKey(AccountSearchPresenter::class)
    abstract fun bindAlertActivityViewModel(presenter: AccountSearchPresenter): ViewModel
}