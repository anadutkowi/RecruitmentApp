package com.example.recruitmentapp.feature.accountDetails

import com.example.recruitmentapp.application.base.BasePresenter
import com.example.recruitmentapp.feature.accountSearch.ProfileData
import javax.inject.Inject

class AccountDetailsPresenter @Inject constructor() : BasePresenter<AccountDetailsContract.View>(),
    AccountDetailsContract.Presenter{

    override fun findProfilePhoto(profileId: Int){
        val profile = ProfileData.profileList[profileId]
        getScreen()!!.setProfilePhoto(profile.photo)
        getScreen()!!.setRepoTitle(profile.repoTitle)
        getScreen()!!.setAuthorsName(profile.name)
        getScreen()!!.setStarScore(profile.stars)
        getScreen()!!.setRepoLink(profile.repoLink)


    }



}