package com.example.interview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        val btnAddress = view.findViewById<Button>(R.id.btnAddress)
        val cancel = view.findViewById<ImageButton>(R.id.cancel)
        val profile = view.findViewById<Button>(R.id.btnprofiledetails)
        cancel.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,HomeFragment())
                .addToBackStack(null)
                .commit()
        }
        btnAddress.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,AddressFragment())
                .addToBackStack(null)
                .commit()
        }
        profile.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,ProfileDetailsFragment())
                .addToBackStack(null)
                .commit()
        }



        return view
    }

}