package com.example.recrutationapp.feature.accountSearch

import com.example.recrutationapp.R

data class ProfileData(
    val id: Int,
    val photo: Int,
    val name: String,
    val stars: String,
    val repoLink: String,
    val repoTitle: String,
    val email: String
) {
    companion object {
        val profileList = listOf(
            ProfileData(
                0,
                R.drawable.ic_iconmonstr_github_1,
                "First author",
                "800",
                "https://github.com/magento/commerce-data-export", "First Repo",
                "firstAuthor@email.com"
            ),
            ProfileData(
                1,
                R.drawable.ic_iconmonstr_github_1,
                "Second author",
                "678",
                "https://github.com/magento/commerce-data-export",
                "Second Repo",
                "secondAuthor@email.com"
            ),
            ProfileData(
                2,
                R.drawable.ic_iconmonstr_github_1,
                "Third author",
                "289",
                "https://github.com/magento/commerce-data-export",
                "Third Repo",
                "thirdAuthor@email.com"
            ),
            ProfileData(
                3,
                R.drawable.ic_iconmonstr_github_1,
                "Fourth author",
                "987",
                "https://github.com/magento/commerce-data-export",
                "Fourth Repo",
                "fourthAuthor@email.com"
            ),
            ProfileData(
                4,
                R.drawable.ic_iconmonstr_github_1,
                "Fifth author",
                "490",
                "https://github.com/magento/commerce-data-export",
                "Fifth Repo",
                "fifthAuthor@email.com"
            ),
            ProfileData(
                5,
                R.drawable.ic_iconmonstr_github_1,
                "Sixth author",
                "890",
                "https://github.com/magento/commerce-data-export",
                "Sixth Repo",
                "SixthAuthor@email.com"
            ),
            ProfileData(
                6,
                R.drawable.ic_iconmonstr_github_1,
                "Seventh author",
                "768",
                "https://github.com/magento/commerce-data-export",
                "Seventh Repo",
                "seventhAuthor@email.com"
            ),
            ProfileData(
                7,
                R.drawable.ic_iconmonstr_github_1,
                "Eighth author",
                "978",
                "https://github.com/magento/commerce-data-export",
                "Eight Repo",
                "eighthAuthor@email.com"
            )

            )
    }
}
