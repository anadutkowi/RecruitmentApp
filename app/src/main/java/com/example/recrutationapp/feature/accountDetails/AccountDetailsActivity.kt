package com.example.recrutationapp.feature.accountDetails

import android.annotation.SuppressLint
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recrutationapp.R
import com.example.recrutationapp.application.base.BaseActivity
import com.example.recrutationapp.feature.accountDetails.CommitData.Companion.commitDetails
import com.example.recrutationapp.feature.accountSearch.AccountSearchActivity
import com.example.recrutationapp.feature.accountSearch.PROFILE_ID
import com.example.recrutationapp.feature.accountSearch.ProfileData.Companion.profileList
import kotlinx.android.synthetic.main.activity_account_details.*
import javax.inject.Inject
var REPO_LINK = "link"
class AccountDetailsActivity : BaseActivity(),
    AccountDetailsContract.View {
    @Inject
    lateinit var presenterFactory: ViewModelProvider.Factory
    private lateinit var presenter: AccountDetailsContract.Presenter
    private lateinit var onlineViewButton: Button
    private lateinit var copyRepoLinkButton: Button
    private var myClipBoard: ClipboardManager? = null
    private var myClip: ClipData? = null
    private lateinit var back_button :RelativeLayout
    private lateinit var adapter: CommitDataAdapter



    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter =
            ViewModelProvider(this, presenterFactory).get(AccountDetailsPresenter::class.java)
        presenter.attach(this)
        setContentView(R.layout.activity_account_details)
        val profileId = intent.getStringExtra(PROFILE_ID)!!.toInt()
        presenter.findProfilePhoto(profileId)
        onlineViewButton = findViewById(R.id.online_view)
        onlineViewButton.setOnClickListener { v: View -> displayLink(REPO_LINK, v)}
        myClipBoard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager?
        copyRepoLinkButton = findViewById(R.id.share_button)
        copyRepoLinkButton.setOnClickListener { v: View -> copyLink(REPO_LINK,v)}
        back_button = findViewById(R.id.goBackSet)
        back_button.setOnClickListener { v: View -> displaySearchActivityOnBack(v) }
        commit_history_list.layoutManager = LinearLayoutManager(this)
        adapter = CommitDataAdapter(this, profileList ,commitDetails, profileId)
        commit_history_list.adapter = adapter

    }

    override fun setProfilePhoto(photoRes: Int) {
        profile_photo.setImageResource(photoRes)
    }

    override fun setRepoTitle(repoTitle: String) {
        repo_title.text = repoTitle
    }

    override fun setAuthorsName(name: String) {
        author_name.text = name
    }

    override fun setStarScore(stars: String) {
        stars_value.text = getString(R.string.star_number, stars)
    }


    override fun setRepoLink(link: String) {
        REPO_LINK = link

    }

    override fun setAuthorsEmail(email: String) {

    }


    private fun displayLink(link: String, v: View) {
        val repoLink = Uri.parse(link)
        val intent = Intent(Intent.ACTION_VIEW, repoLink)
        startActivity(intent)
    }

    private fun copyLink(link : String, v: View){
        myClip = ClipData.newPlainText("repoLink", link)
        myClipBoard?.setPrimaryClip(myClip!!)

        Toast.makeText(this,R.string.copy_link_info, Toast.LENGTH_SHORT).show()

    }
    private fun displaySearchActivityOnBack(view: View){
        startActivity(Intent(this, AccountSearchActivity::class.java))
    }


}