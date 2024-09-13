package com.nathan.phonetreemanager.ui.parked_calls

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ParkedCallsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is the parked calls Fragment"
    }
    val text: LiveData<String> = _text
}