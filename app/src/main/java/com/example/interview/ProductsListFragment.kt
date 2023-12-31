package com.example.interview

import android.os.Bundle
import android.os.Environment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.interview.databinding.FragmentProductsListBinding
import com.example.interview.model.ProductModel
import com.example.interview.model.ProductViewModel
import com.google.gson.Gson
import java.io.BufferedWriter
import java.io.File
import java.io.FileOutputStream
import java.io.OutputStreamWriter

class ProductsListFragment : Fragment() {

    private lateinit var binding: FragmentProductsListBinding
    private lateinit var productViewModel: ProductViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProductsListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        productViewModel = ViewModelProvider(this).get(ProductViewModel::class.java)

        val adapter = ProductAdapter()
        adapter.setOnItemClickListener { position, prodtype ->
            when (prodtype) {
                "Dell Inspiron" -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, ItemDetailsFragment())
                        .addToBackStack(null)
                        .commit()
                }
            }
        }

        binding.productsRecycle.adapter = adapter
        binding.productsRecycle.layoutManager = LinearLayoutManager(requireContext())
        binding.productItems=productViewModel.productItems
        binding.lifecycleOwner = this
        productViewModel.productItems.observe(viewLifecycleOwner, Observer {
            adapter.submitList(it)
            writeProductstoExtStorage(it)
        })
        onClick()

    }

    private fun writeProductstoExtStorage(products : List<ProductModel>){
        val fileName = "products_data.txt"
        val file = File(requireContext().getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS),fileName)

        try {
            FileOutputStream(file).use { fileOutputStream->
                BufferedWriter(OutputStreamWriter(fileOutputStream)).use { writer->
                    val gson = Gson()
                    val json = gson.toJson(products)
                    writer.write(json)
                }
            }
        }catch (e : Exception){
            e.printStackTrace()
            Toast.makeText(requireContext(),"Error saving products data",Toast.LENGTH_SHORT).show()
        }
    }
    fun onClick(){
        binding.cancel.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,HomeFragment())
                .addToBackStack(null)
                .commit()
        }
    }
}