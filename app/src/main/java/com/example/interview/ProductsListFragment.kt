package com.example.interview

import android.content.ActivityNotFoundException
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.FileProvider
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.interview.databinding.FragmentProductsListBinding
import com.example.interview.model.ProductViewModel
import java.io.File

class ProductsListFragment : Fragment() {

    private lateinit var binding: FragmentProductsListBinding
    private lateinit var productViewModel: ProductViewModel
    private val MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE = 123

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("tag","tagged")
        binding = FragmentProductsListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        checkStoragePermissin()

        productViewModel = ViewModelProvider(this).get(ProductViewModel::class.java)

        val adapter = ProductAdapter()
        adapter.setOnItemClickListener { position, prodtype ->
            val product = adapter.currentList.getOrNull(position)
            if (product?.filepath != null) {
                if (doesFileExist(product.filepath)){
                    openFile(product.filepath)
                when (prodtype) {
                    "Hp ProBook" -> {
                        requireActivity().supportFragmentManager.beginTransaction()
                            .replace(R.id.fragmentContainer, ItemDetailsFragment())
                            .addToBackStack(null)
                            .commit()
                    }
                }
            }else{
                Toast.makeText(requireContext(),"File does not exist",Toast.LENGTH_SHORT).show()
            }
        }
    }
        binding.productsRecycle.adapter = adapter
        binding.productsRecycle.layoutManager = LinearLayoutManager(requireContext())
        binding.productItems=productViewModel.productItems
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
    private fun checkStoragePermissin(){
        if (ContextCompat.checkSelfPermission(
            requireContext(),android.Manifest.permission.READ_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(requireActivity(), arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE),MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE)
        }
    }
    private fun doesFileExist(filePath: String): Boolean{
        val file = File(filePath)
        return file.exists()
    }
    private fun openFile(filePath: String){
        Log.d("Fragment", "Opening file at: $filePath")
        val file = File(filePath)
        val exists = file.exists()
        Log.d("Fragment", "File at $filePath exists.")

        if (file.exists()){
            val intent = Intent(Intent.ACTION_VIEW)
            val uri = FileProvider.getUriForFile(requireContext(),"com.example.interview.fileprovider",file)
            intent.setDataAndType(uri,"text/plain")
            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
            try {
                startActivity(intent)
            }catch (e: ActivityNotFoundException){
                Toast.makeText(requireContext(),"No application available to open the file",Toast.LENGTH_SHORT).show()
            }
        }else{
            Log.d("Fragment", "File at $filePath does not exists.")
            Toast.makeText(requireContext(),"File does not exist",Toast.LENGTH_SHORT).show()
        }
    }
}