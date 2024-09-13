package com.nathan.phonetreemanager.ui.held_calls

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HeldCallsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is the held calls fragment"
    }
    val text: LiveData<String> = _text
}