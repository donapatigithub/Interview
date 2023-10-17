package com.example.interview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.interview.dB.UserRepo
import com.example.interview.databinding.ActivityRegisterBinding
import com.example.interview.model.RegisterModel

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    private lateinit var nameEditText: EditText
    private lateinit var mobileEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var newPasswordEditText: EditText
    private lateinit var confirmPasswordEditText: EditText
    private lateinit var userRepo: UserRepo
    private lateinit var register: Button
    private lateinit var cancel: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        userRepo = UserRepo(this)
        setContentView(R.layout.activity_register)
        nameEditText=findViewById(R.id.regName)
        mobileEditText=findViewById(R.id.regMobile)
        emailEditText=findViewById(R.id.regEmail)
        newPasswordEditText=findViewById(R.id.regPassword)
        confirmPasswordEditText=findViewById(R.id.regCnfPassword)
        register=findViewById(R.id.register)
        cancel=findViewById(R.id.cancel)

        register.setOnClickListener {
            val name=nameEditText.text.toString()
            val mobile=mobileEditText.text.toString()
            val email=emailEditText.text.toString()
            val newPassword=newPasswordEditText.text.toString()
            val confirmPassword=confirmPasswordEditText.text.toString()

            if (newPassword == confirmPassword){
                val user = RegisterModel(name,mobile,email,newPassword)
                val result = userRepo.registerUser(user)
                if (result != -1L){
                    Toast.makeText(this,"Registration Successful", Toast.LENGTH_SHORT).show()
                    finish()
                }else{
                    Toast.makeText(this,"Registration Failed", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this,"Passwords do not match", Toast.LENGTH_SHORT).show()
            }
        }
            cancel.setOnClickListener {
                finish()
            }
    }
}