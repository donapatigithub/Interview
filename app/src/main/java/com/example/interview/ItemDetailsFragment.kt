package com.example.interview

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
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
           currentItem = ItemModel("Dell Inspiron",59999.00,"Hp Probook")

           //Video view
           val mediaList = mutableListOf<MediaItem>()

           val image= listOf(
               R.drawable.electronics,
               )
           mediaList.addAll(image.map { MediaItem.Image(it) })
           mediaList.add(MediaItem.Video(R.raw.demo))

           val pager2 : ViewPager2= binding.root.findViewById(R.id.pager)
           pager2.adapter = MediaAdapter(mediaList)

           binding.itemName.text = currentItem.name
           binding.itemPrice.text = "Price: INR ${currentItem.price}"
           binding.description.text = currentItem.description
           val spinner = binding.root.findViewById<Spinner>(R.id.qntySpinner)
           ArrayAdapter.createFromResource(requireContext(),R.array.qty,android.R.layout.simple_spinner_item)
               .also { adapter->
                   adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                   spinner.adapter=adapter
               }
           binding.cartButton.setOnClickListener {
               val selectedqty = spinner.selectedItem.toString().toInt()
                CartManager.addToCart(currentItem,selectedqty)
               Toast.makeText(requireContext(),"Item Added to cart",Toast.LENGTH_SHORT).show()
           }
           return binding.root

    }


}
object CartManager{
    private val cartModels = mutableListOf<CartModel>()
    fun addToCart(itemModel: ItemModel, quantity: Int){
        val existingItem = cartModels.find {
            itemModel == itemModel
        }
        if (existingItem!=null){
            existingItem.quantity += quantity
        }else{
            cartModels.add(CartModel(itemModel,quantity))
        }
    }
    fun getCartItems():List<CartModel>{
        return cartModels.toList()
    }
}