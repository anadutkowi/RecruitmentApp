package com.example.recruitmentapp.application.di.module.accountSearchModule

import androidx.lifecycle.ViewModel
import com.example.recruitmentapp.application.PresenterKey
import com.example.recruitmentapp.feature.accountSearch.AccountSearchPresenter
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