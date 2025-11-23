package com.example.tutorial_07_fragments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FragmentViewModel: ViewModel() {

    private val backgroundColor = MutableLiveData<Int>()

    //since private, lets have some functions
    fun getBackgroundColor(): LiveData<Int>{
        return backgroundColor
    }

    fun setBackground(color:Int){
        backgroundColor.value = color
    }
}

//specialty about LiveData is, we can observe the changes of variable