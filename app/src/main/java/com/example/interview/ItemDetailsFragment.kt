package com.example.interview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.interview.model.ProductModel
import com.example.interview.model.ShoppingCart

class ItemDetailsFragment : Fragment() {

    private val shoppingCart = ShoppingCart()
       override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val item = ProductModel("Siva /n I'm a Human","9999999",R.drawable.toys)
           val addToCartButton = view?.findViewById<Button>(R.id.cartButton)

           if (addToCartButton != null) {
               addToCartButton.setOnClickListener {
                   shoppingCart.addItem(item)
               }
           }
           return view
    }


}