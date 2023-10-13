package com.example.interview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import com.example.interview.dB.UserRepo

class Login : AppCompatActivity() {
   private lateinit var userName : EditText
   private lateinit var userPassword : EditText
   private lateinit var login: Button
   private lateinit var register: Button
   private lateinit var userRepo: UserRepo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        userName = findViewById(R.id.userid)
        userPassword = findViewById(R.id.password)
        login = findViewById(R.id.loginbtn)
        register = findViewById(R.id.register)
        userRepo=UserRepo(this)
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
}