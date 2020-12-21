package com.example.recrutationapp.feature.accountDetails

import com.example.recrutationapp.R

data class CommitData(val commit:String, val commit_number: Int){
    companion object{
        val commitDetails = listOf(
            CommitData(  "first commit message", R.string.commit_1),
            CommitData("second commit message is longer than the first one", R.string.commit_2),
            CommitData("third commit message", R.string.commit_3)
        )
    }
}

