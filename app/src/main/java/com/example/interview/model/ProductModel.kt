package com.example.interview.model

import android.media.Image
import androidx.fragment.app.Fragment

data class ProductModel (
    val name: String,
    val price: String,
    val image: Int,
    val filepath : String
)
class ShoppingCart{
    val items : MutableList<ProductModel> = mutableListOf()
            fun addItem(item: ProductModel){
                items.add(item)
            }
    fun removeItem(item: ProductModel){
        items.remove(item)
    }
}