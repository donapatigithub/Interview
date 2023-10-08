package com.example.interview

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.interview.model.ProductModel

@BindingAdapter("productList")
fun bindProducts(recyclerView: RecyclerView, productList: List<ProductModel>){
    val adapter=recyclerView.adapter as? ProductAdapter
    adapter?.submitList(productList)
}