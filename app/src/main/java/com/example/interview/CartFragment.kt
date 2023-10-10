package com.example.interview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.interview.model.CartModel

class CartFragment : Fragment() {

    private lateinit var cartRV : RecyclerView
    private lateinit var totalPrice: TextView
    private lateinit var cartAdapter: CartAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_cart,container,false)

        cartRV = view.findViewById(R.id.cart_RV)
        totalPrice = view.findViewById(R.id.totalPrice)
        val cartItems = CartManager.getCartItems()
        cartAdapter = CartAdapter(cartItems)
        val layoutManager = LinearLayoutManager(context)
        cartRV.layoutManager=layoutManager
        cartRV.adapter = cartAdapter

        val totalprice = calculate(cartItems)
        totalPrice.text="Total Price: INR $totalprice"
        return view
    }
    private fun calculate(cartItems : List<CartModel>):Double{
        var totalPrice = 0.0
        for (cartItem in cartItems){
            totalPrice += cartItem.item.price * cartItem.quantity
        }
        return totalPrice
    }

}