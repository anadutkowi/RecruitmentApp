package com.example.recrutationapp.feature.accountSearch

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recrutationapp.R
import com.example.recrutationapp.application.base.BaseActivity
import com.example.recrutationapp.feature.accountSearch.ProfileData.Companion.profileList
import kotlinx.android.synthetic.main.activity_account_search.*
import javax.inject.Inject

class AccountSearchActivity : BaseActivity(),
    AccountSearchContract.View {

    @Inject
    lateinit var presenterFactory: ViewModelProvider.Factory
    private lateinit var presenter: AccountSearchContract.Presenter
    private lateinit var adapter: ProfileAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = ViewModelProvider(this, presenterFactory).get(AccountSearchPresenter::class.java)
        presenter.attach(this)
        setContentView(R.layout.activity_account_search)
        profilesList.layoutManager = LinearLayoutManager(this)
        adapter = ProfileAdapter(this, profileList)
        profilesList.adapter = adapter
    }
}