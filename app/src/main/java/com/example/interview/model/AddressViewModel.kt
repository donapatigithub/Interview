package com.example.interview.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AddressViewModel : ViewModel() {
    private val _addressLiveData = MutableLiveData<String?>()

    fun getAddress(): String? {
        return _addressLiveData.value
    }
    fun saveAddress(address : String?){
        _addressLiveData.value=address
    }
}