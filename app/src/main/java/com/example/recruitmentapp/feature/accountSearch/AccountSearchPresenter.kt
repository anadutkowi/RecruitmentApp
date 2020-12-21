package com.example.recruitmentapp.feature.accountSearch

import com.example.recruitmentapp.application.base.BasePresenter
import javax.inject.Inject

class AccountSearchPresenter @Inject constructor() : BasePresenter<AccountSearchContract.View>(),
    AccountSearchContract.Presenter