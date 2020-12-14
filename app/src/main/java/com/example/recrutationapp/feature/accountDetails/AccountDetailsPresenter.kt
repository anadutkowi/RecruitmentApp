package com.example.recrutationapp.feature.accountDetails

import com.example.recrutationapp.application.base.BasePresenter
import javax.inject.Inject

class AccountDetailsPresenter @Inject constructor() : BasePresenter<AccountDetailsContract.View>(),
    AccountDetailsContract.Presenter