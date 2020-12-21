package com.example.recruitmentapp.feature.introScreen

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.recruitmentapp.R
import com.example.recruitmentapp.application.base.BaseActivity
import com.example.recruitmentapp.feature.accountSearch.AccountSearchActivity
import javax.inject.Inject

class IntroScreenActivity : BaseActivity(), IntroScreenContract.View {
    @Inject
    lateinit var presenterFactory: ViewModelProvider.Factory
    private lateinit var presenter: IntroScreenContract.Presenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = ViewModelProvider(this, presenterFactory).get(IntroScreenPresenter::class.java)
        presenter.attach(this)
        setContentView(R.layout.activity_intro_screen)
        presenter.loadingApp()


    }

    override fun nextActivity() {
        startActivity(Intent(this, AccountSearchActivity::class.java))
    }

}

