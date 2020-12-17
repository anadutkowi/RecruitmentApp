package com.example.recrutationapp.feature.accountSearch

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.WindowManager
import android.widget.EditText
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recrutationapp.R
import com.example.recrutationapp.application.base.BaseActivity
import com.example.recrutationapp.feature.accountDetails.AccountDetailsActivity
import com.example.recrutationapp.feature.accountDetails.REPO_LINK
import com.example.recrutationapp.feature.accountSearch.ProfileData.Companion.profileList
import kotlinx.android.synthetic.main.activity_account_search.*
import javax.inject.Inject

const val PROFILE_ID = "id"


class AccountSearchActivity : BaseActivity(),
    AccountSearchContract.View {

    @Inject
    lateinit var presenterFactory: ViewModelProvider.Factory
    private lateinit var presenter: AccountSearchContract.Presenter
    private lateinit var adapter: ProfileAdapter
    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter =
            ViewModelProvider(this, presenterFactory).get(AccountSearchPresenter::class.java)
        presenter.attach(this)
        setContentView(R.layout.activity_account_search)
        profilesList.layoutManager = LinearLayoutManager(this)
        adapter = ProfileAdapter(this, profileList)
        profilesList.adapter = adapter
        editText = findViewById(R.id.input_text)
        editText.addTextChangedListener(textWatcher)
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN)

    }

    private val textWatcher = object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {
            filter(s.toString())
        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        }
    }

    private fun filter(text: String) {
        val filteredList = mutableListOf<ProfileData>()

        for (profile in profileList) {
            if (profile.name.toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(profile)
            }
            adapter.filterList(filteredList)
        }
    }

    fun goToDetailsOnClick(view: View) {
        val intent = Intent(this, AccountDetailsActivity::class.java)
        intent.putExtra(PROFILE_ID, view.tag.toString())
        startActivity(intent)
    }

    override fun onBackPressed() {
    }


}