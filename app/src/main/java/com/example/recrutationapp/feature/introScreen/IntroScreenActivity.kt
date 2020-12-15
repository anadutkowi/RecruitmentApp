package com.example.recrutationapp.feature.introScreen

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.recrutationapp.R
import com.example.recrutationapp.application.base.BaseActivity
import com.example.recrutationapp.feature.accountSearch.AccountSearchActivity
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

    }

    fun nextActivity(view: View) {
        startActivity(Intent(this, AccountSearchActivity::class.java))
    }

}

