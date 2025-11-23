package com.example.tutorial_06_recycler_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tutorial_06_recycler_view.model.Post

class MyDataAdapter(private val data: List<Post>) : RecyclerView.Adapter<MyDataVH>() {  //Primary Constructor: It takes the list of data (data: List<Post>) that it needs to display.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyDataVH { //this method is similar to onCreate method in MainActivity. here we initialize layout
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view: View = layoutInflater.inflate(R.layout.list_item_layout, parent, false)
        return MyDataVH(view)
    }

    override fun getItemCount(): Int { //this is where we determine how many no. of elements should be rendered on the screen
        return data.size
    }

    //  holder object refers to MyDataVH. so any name we give must exist as a variable in our ViewHolder
    //  singleData is a Post object. so we should give the variable name in data class here
    //  holder. MyDataVH eke tyn nama = singleData. dataclass eke tyna nama
    override fun onBindViewHolder(holder: MyDataVH, position: Int) { // at this method we have access to the objects in the UI
        val singleData = data[position]
        var toggle = true

        holder.tvUserName.text = singleData.userName
        holder.tvDescription.text = singleData.description
        holder.btnLike.text = "${singleData.likes}👍"

        holder.btnLike.setOnClickListener {
            if (toggle) {
                holder.btnLike.text = "${singleData.likes + 1}👍"
                toggle = false
            } else {
                holder.btnLike.text = "${singleData.likes}👍"
                toggle = true
            }
        }
    }

}
