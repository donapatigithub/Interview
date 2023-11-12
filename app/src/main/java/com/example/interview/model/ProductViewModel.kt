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

        init {
            _productItems.value = getProducts()
        }
    private fun getProducts() : List<ProductModel>{
        return listOf(
            ProductModel("Hp ProBook","58999",R.drawable.electronics,generateFilePath("Hp_ProBook.pdf")),
            ProductModel("Dell","250",R.drawable.toys,"Dell.pdf")

        ).map { product->
            val fileName = "${product.name}_file.pdf"
            val filePath=generateFilePath(fileName)
            ProductModel(product.name,product.price,product.image,filePath)
        }
    }
    private fun generateFilePath(fileName: String): String{
        val directoryPath = "/storage/emulated/0/Downloads/"
        return "$directoryPath$fileName"
    }
}