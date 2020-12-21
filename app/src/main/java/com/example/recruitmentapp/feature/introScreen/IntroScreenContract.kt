package com.example.recruitmentapp.feature.introScreen

import com.example.recruitmentapp.application.base.BasePresenterInterface

interface IntroScreenContract {
    interface View{
        fun nextActivity()
    }
    interface Presenter: BasePresenterInterface<View>{
        fun loadingApp()
    }
}