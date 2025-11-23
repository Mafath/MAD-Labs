package com.example.recycler_view_practice

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyDataVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
//    Connects the ImageView from XML (imgProfile) to Kotlin.
    val imgProfile: ImageView = itemView.findViewById(R.id.imgProfile)
    val tvName: TextView = itemView.findViewById(R.id.tvName)
    val tvDescription: TextView = itemView.findViewById(R.id.tvDescription)
    val imgIcon: ImageView = itemView.findViewById(R.id.imgIcon)
    val btnOpen: Button = itemView.findViewById(R.id.btnOpen)
}