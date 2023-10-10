package com.example.interview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.interview.model.CartModel

class CartAdapter(private val cartModels: List<CartModel>):RecyclerView.Adapter<CartAdapter.ViewHolder>() {
    inner class ViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        val itemname : TextView = itemView.findViewById(R.id.c_itemName)
        val itemprice : TextView = itemView.findViewById(R.id.c_itemPrice)
        val qnty : TextView = itemView.findViewById(R.id.quantity)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cart_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cartModels.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cartModels = cartModels[position]
        val item=cartModels.item
        holder.itemname.text = item.name
        holder.itemprice.text = "INR ${item.price}"
        holder.qnty.text = "Quantity: ${cartModels.quantity}"
    }
}