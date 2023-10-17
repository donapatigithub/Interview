package com.example.interview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.interview.dB.UserRepo
import com.example.interview.databinding.ActivityRegisterBinding
import com.example.interview.model.Address
import com.example.interview.model.NameModel
import com.example.interview.model.RegisterModel

class RegisterActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var midnameEditText: EditText
    private lateinit var lastnameEditText: EditText
    private lateinit var flatEditText: EditText
    private lateinit var streetEditText: EditText
    private lateinit var landmarkEditText: EditText
    private lateinit var cityEditText: EditText
    private lateinit var pincodeEditText: EditText
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
        nameEditText=findViewById(R.id.regfirstName)
        midnameEditText=findViewById(R.id.regmidName)
        lastnameEditText=findViewById(R.id.reglastName)
        mobileEditText=findViewById(R.id.regMobile)
        emailEditText=findViewById(R.id.regEmail)
        flatEditText=findViewById(R.id.flatNo)
        streetEditText=findViewById(R.id.street)
        landmarkEditText=findViewById(R.id.landmark)
        cityEditText=findViewById(R.id.city)
        pincodeEditText=findViewById(R.id.pincode)
        newPasswordEditText=findViewById(R.id.regPassword)
        confirmPasswordEditText=findViewById(R.id.regCnfPassword)
        register=findViewById(R.id.register)
        cancel=findViewById(R.id.cancel)

        register.setOnClickListener {
            val fname=nameEditText.text.toString()
            val middleName=midnameEditText.text.toString()
            val lastName=lastnameEditText.text.toString()
            val mobile=mobileEditText.text.toString()
            val email=emailEditText.text.toString()
            val flatno=flatEditText.text.toString()
            val street=streetEditText.text.toString()
            val landmark=landmarkEditText.text.toString()
            val city = cityEditText.text.toString()
            val pincode=pincodeEditText.id
            val newPassword=newPasswordEditText.text.toString()
            val confirmPassword=confirmPasswordEditText.text.toString()

            if (newPassword == confirmPassword){
                val user = RegisterModel(NameModel(fname,middleName,lastName),mobile,email,
                    Address(flatno,street,landmark,city,pincode),newPassword
                )
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