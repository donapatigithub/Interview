package com.example.interview

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.interview.databinding.ProductsListIemBinding
import com.example.interview.model.ProductModel

class ProductAdapter : ListAdapter<ProductModel, ProductAdapter.ProductVH>(ProductDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductVH {
        val binding  = ProductsListIemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ProductVH(binding)
    }
    override fun onBindViewHolder(holder: ProductVH, position: Int) {
        val product =getItem(position)
        holder.bind(product)
    }
    inner class ProductVH(private val binding: ProductsListIemBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ProductModel){
            binding.product=item
            Log.d("Das","Image Id: ${item.image}, Name:${item.name}, Price:${item.price}")
            binding.executePendingBindings()

        }

    }
}

private class ProductDiffCallback : DiffUtil.ItemCallback<ProductModel>(){
    override fun areItemsTheSame(oldItem: ProductModel, newItem: ProductModel): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: ProductModel, newItem: ProductModel): Boolean {
        return oldItem.name == newItem.name
    }

}
