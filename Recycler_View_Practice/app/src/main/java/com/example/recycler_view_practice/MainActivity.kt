package com.example.recycler_view_practice

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val userList = mutableListOf<UserCard>()

    init {
        userList.add(UserCard(R.drawable.user_profile1, "Hannah Ice", "Anyone else here from New York?", R.drawable.user_icon))
        userList.add(UserCard(R.drawable.user_profile2, "Jane Smith", "Sunsets are so beautiful.", R.drawable.user_icon))
        userList.add(UserCard(R.drawable.user_profile3, "George Hill", "At the beach with friends.", R.drawable.user_icon))
        userList.add(UserCard(R.drawable.user_profile4, "Charlie Davis", "Loving Android development!", R.drawable.user_icon))
        userList.add(UserCard(R.drawable.user_profile5, "Eddie Foster", "Exploring new cafes.", R.drawable.user_icon))
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1️⃣ Find RecyclerView
        val rvList: RecyclerView = findViewById(R.id.rvList)

        // 2️⃣ Set LayoutManager (linear vertical by default)
        rvList.layoutManager = LinearLayoutManager(this)

        // 3️⃣ Create adapter and attach
        val adapter = UserCardAdapter(userList)
        rvList.adapter = adapter

    }
}