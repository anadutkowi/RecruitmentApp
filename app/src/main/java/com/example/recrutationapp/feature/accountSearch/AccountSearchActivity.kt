package com.example.recrutationapp.feature.accountSearch

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.recrutationapp.DataDao
import com.example.recrutationapp.R
import com.example.recrutationapp.application.base.BaseActivity
import javax.inject.Inject

class AccountSearchActivity : BaseActivity(),
    AccountSearchContract.View {

    @Inject
    lateinit var presenterFactory: ViewModelProvider.Factory
    private lateinit var presenter: AccountSearchContract.Presenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = ViewModelProvider(this, presenterFactory).get(AccountSearchPresenter::class.java)
        presenter.attach(this)
        setContentView(R.layout.activity_account_search)
    }
}