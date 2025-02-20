package com.example.recruitmentapp.feature.introScreen

import android.os.Handler
import com.example.recruitmentapp.application.base.BasePresenter
import javax.inject.Inject

class IntroScreenPresenter @Inject constructor() : BasePresenter<IntroScreenContract.View>(),
    IntroScreenContract.Presenter {
    override fun loadingApp() {
        Handler().postDelayed({ getScreen()?.nextActivity() }, LOAD_TIME)
    }

    companion object {
        private const val LOAD_TIME: Long = 500
    }
}
