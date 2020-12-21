package com.example.recrutationapp.feature.introScreen

import com.example.recrutationapp.application.base.BasePresenterInterface

interface IntroScreenContract {
    interface View{
        fun nextActivity()
    }
    interface Presenter: BasePresenterInterface<View>{
        fun loadingApp()
    }
}