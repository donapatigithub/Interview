package com.example.interview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.interview.databinding.FragmentAddressBinding
import com.example.interview.model.AddressViewModel


class AddressFragment : Fragment() {
    private var currentAddress : String? = null
    private lateinit var binding: FragmentAddressBinding
    private lateinit var viewModel: AddressViewModel
    private var isEditing = false
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=FragmentAddressBinding.inflate(inflater,container,false)

        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity()).get(AddressViewModel::class.java)

        binding.edtText.setOnClickListener {
            if (!isEditing){
                val saveddata = viewModel.getAddress()
                if (!isEditing){
                    binding.edtText.setText(saveddata)
                    isEditing = true
                }
            }
        }
        binding.delbtn.setOnClickListener {
            currentAddress = null
            binding.edtText.text.clear()
            binding.savedText.text = ""
            showToast("Address deleted")
        }
        binding.savebtn.setOnClickListener {
           val editAddress =  binding.edtText.text.toString().trim()
            if (editAddress.isNotEmpty()) {
                viewModel.saveAddress(editAddress)
                binding.savedText.text="Saved Address : $editAddress"
                showToast("Address saved : $editAddress")
                binding.edtText.text.clear()
                isEditing=false
            } else {
                showToast("No address to save")
            }
        }
        binding.cancel.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,ProfileFragment())
                .addToBackStack(null)
                .commit()
        }
    }
    private fun showToast(message: String){
        Toast.makeText(requireContext(),message,Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        val lastData = viewModel.getAddress()
        if (!lastData.isNullOrBlank()) {
            binding.savedText.text = "Saved Address : $lastData"
        } else {
            binding.savedText.text = ""
        }
    }

}