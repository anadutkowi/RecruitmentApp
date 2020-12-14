package com.example.recrutationapp.feature.introScreen

import com.example.recrutationapp.application.base.BasePresenter
import javax.inject.Inject

class IntroScreenPresenter @Inject constructor(): BasePresenter<IntroScreenContract.View>(),
IntroScreenContract.Presenter
