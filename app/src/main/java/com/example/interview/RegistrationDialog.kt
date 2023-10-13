package com.example.interview

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.interview.dB.UserRepo
import com.example.interview.databinding.FragmentRegistrationDialogBinding
import com.example.interview.model.RegisterModel

class RegistrationDialog: DialogFragment() {

    private lateinit var binding : FragmentRegistrationDialogBinding
    private lateinit var nameEditText: EditText
    private lateinit var mobileEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var newPasswordEditText: EditText
    private lateinit var confirmPasswordEditText: EditText
    private lateinit var userRepo: UserRepo
    override fun onAttach(context: Context) {
        super.onAttach(context)
        userRepo = UserRepo(context)
    }
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Register")
        val dialogView = layoutInflater.inflate(R.layout.fragment_registration_dialog,null)

        nameEditText=dialogView.findViewById(R.id.regName)
        mobileEditText=dialogView.findViewById(R.id.regMobile)
        emailEditText=dialogView.findViewById(R.id.regEmail)
        newPasswordEditText=dialogView.findViewById(R.id.regPassword)
        confirmPasswordEditText=dialogView.findViewById(R.id.regCnfPassword)

        builder.setView(dialogView)
        builder.setPositiveButton("Register"){ dialog, which ->
            val name=nameEditText.text.toString()
            val mobile=mobileEditText.text.toString()
            val email=emailEditText.text.toString()
            val newPassword=newPasswordEditText.text.toString()
            val confirmPassword=confirmPasswordEditText.text.toString()

            if (newPassword == confirmPassword){
                val user = RegisterModel(name,mobile,email,newPassword)
                val result = userRepo.registerUser(user)
                if (result != -1L){
                    Toast.makeText(requireContext(),"Registration Successful",Toast.LENGTH_SHORT).show()
                    dialog.dismiss()
                }else{
                    Toast.makeText(requireContext(),"Registration Failed",Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(requireContext(),"Passwords do not match",Toast.LENGTH_SHORT).show()
            }
        }
            builder.setNegativeButton("Cancel"){ dailog,which ->
                dailog.dismiss()
        }
        return builder.create()
    }
}