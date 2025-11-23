package com.example.tutorial_06_recycler_view

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// This code defines the container for all the UI elements in a single row, allowing the system to reuse them efficiently
class MyDataVH(itemView: View) : RecyclerView.ViewHolder(itemView) { //our class inherits all the properties and methods from the built-in Android class RecyclerView.ViewHolder
    //initialize UI components
    val tvUserName: TextView = itemView.findViewById(R.id.tvUserName)
    val tvDescription:TextView = itemView.findViewById(R.id.tvDescription)
    val btnLike: Button = itemView.findViewById(R.id.btnLike)
}

//so this is our view holder which will initialize text objects and button objects to access in the running environment
//These references will be used by the Adapter (Step 5) to quickly bind data to the UI elements in the onBindViewHolder method