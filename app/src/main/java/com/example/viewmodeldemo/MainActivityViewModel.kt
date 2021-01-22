package com.example.viewmodeldemo

import android.util.Log
import androidx.lifecycle.ViewModel

class MainActivityViewModel(name: String): ViewModel() {

    var myName: String = name

    init {
        Log.d("ViewModel", "My Youtube channel name is $myName")
    }

}