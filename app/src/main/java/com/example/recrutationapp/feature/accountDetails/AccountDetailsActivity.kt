package com.example.recrutationapp.feature.accountDetails

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.recrutationapp.R
import com.example.recrutationapp.application.base.BaseActivity
import javax.inject.Inject

class AccountDetailsActivity : BaseActivity(),
    AccountDetailsContract.View {
    @Inject
    lateinit var presenterFactory: ViewModelProvider.Factory
    private lateinit var presenter: AccountDetailsContract.Presenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = ViewModelProvider(this, presenterFactory).get(AccountDetailsPresenter::class.java)
        presenter.attach(this)
        setContentView(R.layout.activity_account_details)
    }
}