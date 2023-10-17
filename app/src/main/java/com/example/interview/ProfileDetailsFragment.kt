package com.example.interview

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.interview.dB.UserRepo
import com.example.interview.databinding.FragmentProfileDetailsBinding

class ProfileDetailsFragment : Fragment() {

    private lateinit var binding: FragmentProfileDetailsBinding
    private lateinit var userRepo: UserRepo
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding=FragmentProfileDetailsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        userRepo = UserRepo(requireContext())
        sharedPreferences = requireActivity().getSharedPreferences("Pref", Context.MODE_PRIVATE)
        val userEmail = sharedPreferences.getString("userEmail",null)
        if (userEmail!=null){
            val users = userRepo.getUserByEmail(userEmail)
            if (users != null){
                binding.apply {
                    firstName.text = "FirstName : ${users.name?.firstName}"
                    midName.text = "MiddleName : ${users.name?.middleName}"
                    lastName.text= "LastName : ${users.name?.lastName}"
                    mobile.text = "Mobile : ${users.mobile}"
                    email.text = "Email ID : ${users.email}"
                    flatNo.text = "Flat No : ${users.address?.flatno}"
                    street.text = "Street Name : ${users.address?.street}"
                    landmark.text = "Landmark : ${users.address?.landmark}"
                    city.text = "City : ${users.address?.city}"
                    pincode.text = "Pincode : ${users.address?.pincode}"
                }
            }
        }
    }
}