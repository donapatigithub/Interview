package com.example.interview.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.interview.R

class ProductViewModel : ViewModel() {
    private val _productItems = MutableLiveData<List<ProductModel>>()
    val productItems: LiveData<List<ProductModel>>
        get() = _productItems
    init {
        _productItems.value= listOf(

            ProductModel("Hp ProBook","58999",R.drawable.electronics)
        )
    }
}