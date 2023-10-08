package com.example.interview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.interview.databinding.FragmentProductsListBinding
import com.example.interview.model.ProductViewModel

class ProductsListFragment : Fragment() {

    private lateinit var binding: FragmentProductsListBinding
    private lateinit var productViewModel: ProductViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProductsListBinding.inflate(inflater, container, false)
        //binding.productItems=productViewModel.productItems
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        productViewModel = ViewModelProvider(this).get(ProductViewModel::class.java)

        val adapter = ProductAdapter()
        binding.productsRecycle.adapter = adapter
        binding.productsRecycle.layoutManager = LinearLayoutManager(requireContext())
        binding.productItems=productViewModel.productItems
        /*binding.adapter = ProductAdapter()
        productViewModel.productItems.observe(viewLifecycleOwner){
            ProductAdapter().submitList(it)
        }*/
        binding.lifecycleOwner = this
        productViewModel.productItems.observe(viewLifecycleOwner, Observer {
            adapter.submitList(it)
        })
        onClick()

    }
    fun onClick(){
        binding.cancel.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,HomeFragment())
                .addToBackStack(null)
                .commit()
        }
    }
}