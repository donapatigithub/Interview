package com.example.interview.model

import android.os.Environment
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.interview.R
import java.io.File

class ProductViewModel : ViewModel() {
    private val _productItems = MutableLiveData<List<ProductModel>>()
    val productItems: LiveData<List<ProductModel>> =_productItems

    private val directoryPath = "/storage/emulated/0/Downloads/"
    private val fileName = "ProductList.txt"
    val filepath="$directoryPath$fileName"
        init {
            _productItems.value = getProducts()
        }
    private fun getProducts() : List<ProductModel>{
        return listOf(
            ProductModel("Hp ProBook","58999",R.drawable.electronics, filepath),
            ProductModel("Elec","250",R.drawable.toys,filepath)

        )
    }
}