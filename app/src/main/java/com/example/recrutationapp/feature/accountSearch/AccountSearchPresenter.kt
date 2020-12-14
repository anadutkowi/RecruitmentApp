package com.example.recrutationapp.feature.accountSearch

import com.example.recrutationapp.application.base.BasePresenter
import javax.inject.Inject

class AccountSearchPresenter @Inject constructor() : BasePresenter<AccountSearchContract.View>(),
    AccountSearchContract.Presenter