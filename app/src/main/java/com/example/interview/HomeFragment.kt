package com.example.interview

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.SearchView.OnQueryTextListener
import androidx.databinding.adapters.SearchViewBindingAdapter.OnQueryTextChange
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.interview.databinding.FragmentHomeBinding
import com.example.interview.model.DashboardViewModel


class HomeFragment : Fragment() {
    private lateinit var binding : FragmentHomeBinding
    private val dashboardAdapter =DashboardAdapter()
    private lateinit var viewModel: DashboardViewModel
    private lateinit var searchView: SearchView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentHomeBinding.inflate(inflater,container,false)
        init()
        imageScroll()
        return binding.root
    }
    private  fun init(){
        viewModel = ViewModelProvider(this).get(DashboardViewModel::class.java)
        binding.lifecycleOwner=this
        binding.adapter=dashboardAdapter
        viewModel.dashboardItems.observe(viewLifecycleOwner) {
            dashboardAdapter.submitList(it)
        }
        dashboardAdapter.onClickItem { position, itemType ->
            when(itemType){
                "Electronics" ->{

                        //Navigation.findNavController(requireActivity(),R.id.fragmentContainer).navigate(R.id.cartFragment)
                    requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,ProductsListFragment())
                        .addToBackStack(null)
                        .commit()
                }
            }

        }
        searchView = binding.search
        searchView.setUpSearchView{ query->
            filterItems(query)
        }
    }
    private fun filterItems(query: String){
        val filteredList = viewModel.filterItems(query)
        dashboardAdapter.submitList(filteredList)
    }
    fun imageScroll(){
        val imageContainer = binding.imgscroll

        if (imageContainer != null) {
            val image = arrayOf(
                R.drawable.mobile,
                R.drawable.clothes,
                R.drawable.electronics,
                R.drawable.shoe,
                R.drawable.toys,
                R.drawable.furniture
            )
            val imageSpace = resources.getDimensionPixelSize(R.dimen.img_space)

            for (i in image.indices) {
                val imageView = ImageView(requireContext())
                imageView.setImageResource(image[i])
                val layoutParams = LinearLayoutCompat.LayoutParams(
                    LinearLayoutCompat.LayoutParams.WRAP_CONTENT,
                    LinearLayoutCompat.LayoutParams.WRAP_CONTENT
                )
                layoutParams.marginEnd = imageSpace
                imageView.layoutParams = layoutParams
                imageContainer.addView(imageView)
                imageView.setOnClickListener {
                    when(i){
                        0 ->{
                            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,ProductsListFragment())
                                .addToBackStack(null)
                                .commit()
                        }
                        2 ->{
                            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,ItemDetailsFragment())
                                .addToBackStack(null)
                                .commit()
                        }
                    }
                }
            }
        }
    }
    private fun SearchView.setUpSearchView(onQueryTextChange: (String)->Unit) {

        this.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }
            override fun onQueryTextChange(newText: String?): Boolean {
                newText?.let { onQueryTextChange(it) }
                return true
            }

        })

    }
}