package com.example.interview.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.interview.R

class ProductViewModel : ViewModel() {
    private val _productItems = MutableLiveData<List<ProductModel>>()
    val productItems: LiveData<List<ProductModel>> =_productItems

        init {
            _productItems.value = getProducts()
        }
    private fun getProducts() : List<ProductModel>{
        return listOf(
            ProductModel("Dell Inspiron","59999",R.drawable.electronics),
            ProductModel("HP","45999",R.drawable.toys)

        )
    }
}