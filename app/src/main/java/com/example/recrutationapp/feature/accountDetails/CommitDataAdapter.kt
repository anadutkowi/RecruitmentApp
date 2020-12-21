package com.example.recrutationapp.feature.accountDetails

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recrutationapp.R
import com.example.recrutationapp.feature.accountSearch.ProfileData


import kotlinx.android.synthetic.main.commit_history_view.view.*

class CommitDataAdapter(
    val context: Context,
    private var profileList: List<ProfileData>,
    private var commitDetails: List<CommitData>,
    private var authorId: Int
) :
    RecyclerView.Adapter<CommitDataAdapter.CommitViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CommitDataAdapter.CommitViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.commit_history_view, parent, false)
        return CommitViewHolder(view)

    }

    override fun getItemCount(): Int {
        return commitDetails.size
    }

    override fun onBindViewHolder(holder: CommitDataAdapter.CommitViewHolder, position: Int) {
        val listElement = commitDetails[position]
        holder.bind(position, listElement)
    }

    inner class CommitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(position: Int, commitData: CommitData) {
            itemView.commit_message.text = commitData.commit
            itemView.commit_number.setText(commitData.commit_number)
            itemView.author_mail.text = profileList[authorId].email
            itemView.commit_author_name.text = profileList[authorId].name

        }

    }

}
