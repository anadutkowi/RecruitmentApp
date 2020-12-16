package com.example.recrutationapp.feature.accountDetails

import com.example.recrutationapp.application.base.BasePresenterInterface

interface AccountDetailsContract {
    interface View{
        fun setProfilePhoto(photoRes: Int)
        fun setRepoTitle(repoTitle: String)
        fun setAuthorsName(name: String)
        fun setStarScore(stars: String)
    }
    interface Presenter: BasePresenterInterface<View>{
        fun findProfilePhoto(profileId: Int)
    }
}