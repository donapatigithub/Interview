package com.example.interview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.interview.databinding.FragmentAddressBinding


class AddressFragment : Fragment() {
    private var currentAddress : String? = null
    private lateinit var binding: FragmentAddressBinding
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


        binding.btnedit.setOnClickListener {
            currentAddress?.let { address->
                binding.edtText.setText(address)
                showToast("Edit Address : $address")
            }?: showToast("No address to edit")
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
                currentAddress = editAddress
                binding.savedText.text="Saved Address : $currentAddress"
                showToast("Address saved : $editAddress")
                binding.edtText.text.clear()
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

}