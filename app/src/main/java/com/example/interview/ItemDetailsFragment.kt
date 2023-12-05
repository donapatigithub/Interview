package com.example.interview

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Spinner
import android.widget.TextView
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
           currentItem = ItemModel("Dell Inspiron",59999.00,"Inspiron 14_Plus")

           //Video view
           val mediaList = mutableListOf<MediaItem>()

           val image= listOf(
               R.drawable.dell,
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

           //comments
           val addcommentsBtn= binding.root.findViewById<Button>(R.id.btnComments)
           addcommentsBtn.setOnClickListener {
               addcomment()
           }

           val reviewscontainers = binding.root.findViewById<LinearLayout>(R.id.reviews)
           dispaly(reviewscontainers)

           return binding.root

    }

    private fun dispaly(reviewscontainer : LinearLayout){
        val reviews = listOf("Awesome!","Looks Good","Average","Not Recommended")
        for (reviews in reviews){
            val reviewTxt = TextView(requireContext())
            reviewTxt.text=reviews
            reviewscontainer.addView(reviewTxt)
        }
    }

    private fun addcomment(){
        val reviewEdt = binding.root.findViewById<EditText>(R.id.edtcomments)
        val newComment = reviewEdt.text.toString()
        if (newComment.isNotEmpty()){
            val reviewscontainer = binding.root.findViewById<LinearLayout>(R.id.reviews)
            val newcmnt=TextView(requireContext())
            newcmnt.text=newComment
            newcmnt.textSize = 10f
            reviewscontainer.addView(newcmnt)
            reviewEdt.text.clear()
            newcmnt.setOnLongClickListener {
                reviewscontainer.removeView(newcmnt)
                true
            }
        }else{
            Toast.makeText(requireContext(),"Please enter your comments",Toast.LENGTH_SHORT).show()
        }
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