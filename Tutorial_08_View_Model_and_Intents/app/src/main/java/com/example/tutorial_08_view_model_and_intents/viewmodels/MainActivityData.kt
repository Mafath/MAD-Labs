package com.example.tutorial_08_view_model_and_intents.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityData: ViewModel() {

    private val _count = MutableLiveData<Int>().apply { value = 0 }

    val count: LiveData<Int> = _count

    fun increment(){
        _count.value = _count.value!! + 1
    }
}