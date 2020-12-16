package com.example.recrutationapp.feature.accountDetails

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.recrutationapp.R
import com.example.recrutationapp.application.base.BaseActivity
import com.example.recrutationapp.feature.accountSearch.PROFILE_ID
import kotlinx.android.synthetic.main.activity_account_details.*
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
        val profileId = intent.getStringExtra(PROFILE_ID)!!.toInt()
        presenter.findProfilePhoto(profileId)

    }
    override fun setProfilePhoto(photoRes: Int){
        profile_photo.setImageResource(photoRes)
    }

    override fun setRepoTitle(repoTitle: String) {
        repo_title.text = repoTitle
    }

    override fun setAuthorsName(name: String) {
        author_name.text = name
    }

    override fun setStarScore(stars: String) {
        stars_value.text = getString(R.string.star_number, stars)
    }

}