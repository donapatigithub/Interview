package com.example.interview

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import com.example.interview.dB.UserRepo
import com.example.interview.model.RegisterModel

class Login : AppCompatActivity() {
   private lateinit var userName : EditText
   private lateinit var userPassword : EditText
   private lateinit var login: Button
   private lateinit var register: TextView
   private lateinit var userRepo: UserRepo

    private lateinit var nameEditText: EditText
    private lateinit var mobileEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var newPasswordEditText: EditText
    private lateinit var confirmPasswordEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        userName = findViewById(R.id.userid)
        userPassword = findViewById(R.id.password)
        login = findViewById(R.id.loginbtn)
        register = findViewById(R.id.register)
        userRepo=UserRepo(this)
        register.setOnClickListener {
            showRegistrationDialog()
        }
        onClick()
    }
    fun onClick(){
        login.setOnClickListener {
            val email = userName.text.toString()
            val password = userPassword.text.toString()

            val user = userRepo.getUserByEmail(email)

            if (user != null && user.password == password){
                val isLoginsuccess= true
                if (isLoginsuccess) {

                    val intent = Intent(this,DashboardActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }else{
                Toast.makeText(this,"Invalid Input",Toast.LENGTH_LONG).show()
            }
        }
    }
    private fun showRegistrationDialog(): AlertDialog? {
        val builder = AlertDialog.Builder(this)
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
                    Toast.makeText(this,"Registration Successful",Toast.LENGTH_SHORT).show()
                    dialog.dismiss()
                }else{
                    Toast.makeText(this,"Registration Failed",Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this,"Passwords do not match",Toast.LENGTH_SHORT).show()
            }
        }
        builder.setNegativeButton("Cancel"){ dailog,which ->
            dailog.dismiss()
        }
        return builder.show()
    }
}