package com.example.recrutationapp.feature.accountDetails

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import com.example.recrutationapp.R
import com.example.recrutationapp.application.base.BaseActivity
import com.example.recrutationapp.feature.accountSearch.PROFILE_ID
import kotlinx.android.synthetic.main.activity_account_details.*
import javax.inject.Inject
var REPO_LINK = "link"
class AccountDetailsActivity : BaseActivity(),
    AccountDetailsContract.View {
    @Inject
    lateinit var presenterFactory: ViewModelProvider.Factory
    private lateinit var presenter: AccountDetailsContract.Presenter
    private lateinit var button: Button

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter =
            ViewModelProvider(this, presenterFactory).get(AccountDetailsPresenter::class.java)
        presenter.attach(this)
        setContentView(R.layout.activity_account_details)
        val profileId = intent.getStringExtra(PROFILE_ID)!!.toInt()
        presenter.findProfilePhoto(profileId)
        button = findViewById(R.id.online_view)
        button.setOnClickListener {v: View -> displayLink(REPO_LINK, v)}

    }

    override fun setProfilePhoto(photoRes: Int) {
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


    override fun setRepoLink(link: String) {
        REPO_LINK = link

    }

    fun displayLink(link: String, v: View) {
        val repoLink = Uri.parse(link)
        val intent = Intent(Intent.ACTION_VIEW, repoLink)
        startActivity(intent)
    }


}