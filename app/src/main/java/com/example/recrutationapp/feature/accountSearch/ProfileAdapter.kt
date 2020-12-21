package com.example.recrutationapp.feature.accountSearch

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recrutationapp.R
import kotlinx.android.synthetic.main.profile_view.view.*

class ProfileAdapter(val context: Context, private var profileList: List<ProfileData>) :
    RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProfileAdapter.ProfileViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.profile_view, parent, false)
        return ProfileViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProfileAdapter.ProfileViewHolder, position: Int) {
        val listElement = profileList[position]
        holder.itemView.tag = listElement.id
        holder.bind(position, listElement)
    }

    override fun getItemCount(): Int {
        return profileList.size

    }
    fun filterList(filterList: List<ProfileData>){
        profileList = filterList
        notifyDataSetChanged()

    }
    inner class ProfileViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind(position: Int, profileData: ProfileData){
            itemView.repo_name.text = profileData.name
            itemView.star_number.text = profileData.stars
            itemView.author_profile.setImageDrawable(context.getDrawable(profileData.photo))

        }

    }
}