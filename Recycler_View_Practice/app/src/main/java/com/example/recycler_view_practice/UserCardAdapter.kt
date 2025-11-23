package com.example.recycler_view_practice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class UserCardAdapter(private val data:List<UserCard>): RecyclerView.Adapter<MyDataVH>() {

    // 1️⃣ Inflate the item layout and create ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyDataVH {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view: View = layoutInflater.inflate(R.layout.list_item_layout, parent, false)
        return MyDataVH(view)
    }

    // 2️⃣ Return total number of items
    override fun getItemCount(): Int {
        return data.size
    }

    // 3️⃣ Bind data to the views
    override fun onBindViewHolder(holder: MyDataVH, position: Int) {
        val singleData = data[position]

        //.text is only for TextView or Button (string content). profileImageResId and iconResId are Int
        // Set text
        holder.tvName.text = singleData.name
        holder.tvDescription.text = singleData.description

        // Set images
        holder.imgProfile.setImageResource(singleData.profileImageResId)
        holder.imgIcon.setImageResource(singleData.iconResId)

    }
}