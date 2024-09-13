package com.nathan.phonetreemanager.ui.inbound_calls

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InboundCallsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is the inbound calls Fragment"
    }
    val text: LiveData<String> = _text
}