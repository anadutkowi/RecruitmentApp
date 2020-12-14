package com.example.recrutationapp.application.di.module.accountDetailsModule

import androidx.lifecycle.ViewModel
import com.example.recrutationapp.application.PresenterKey
import com.example.recrutationapp.feature.accountDetails.AccountDetailsPresenter
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AccountDetailsActivityModule {
    @Binds
    @IntoMap
    @PresenterKey(AccountDetailsPresenter::class)
    abstract fun bindAlertActivityViewModel(presenter: AccountDetailsPresenter): ViewModel
}