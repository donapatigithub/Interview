package com.example.interview

import android.health.connect.datatypes.units.Length
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.interview.databinding.FragmentItemDetailsBinding
import com.example.interview.model.CartModel
import com.example.interview.model.ItemModel

class ItemDetailsFragment : Fragment() {

    private lateinit var currentItem : ItemModel
    private lateinit var binding: FragmentItemDetailsBinding
       override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
           binding= FragmentItemDetailsBinding.inflate(inflater,container,false)
            Log.d("name","Name : Hp ProBook")
           currentItem = ItemModel("Hp ProBook",59999.00,"Hp Probook",R.drawable.electronics)
           binding.itemName.text = currentItem.name
           binding.itemPrice.text = "Price: INR ${currentItem.price}"
           binding.description.text = currentItem.description
           binding.itemImage.setImageResource(currentItem.image)
           binding.cartButton.setOnClickListener {
                CartManager.addToCart(currentItem)
               Toast.makeText(requireContext(),"Item Added to cart",Toast.LENGTH_SHORT).show()
           }
           return binding.root

    }


}
object CartManager{
    private val cartModels = mutableListOf<CartModel>()
    fun addToCart(itemModel: ItemModel){
        val existingItem = cartModels.find {
            itemModel == itemModel
        }
        if (existingItem!=null){
            existingItem.quantity++
        }else{
            cartModels.add(CartModel(itemModel,1))
        }
    }
    fun getCartItems():List<CartModel>{
        return cartModels.toList()
    }
}