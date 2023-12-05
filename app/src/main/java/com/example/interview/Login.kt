package com.example.interview

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.interview.dB.UserRepo

class Login : AppCompatActivity() {
    private lateinit var userName: EditText
    private lateinit var userPassword: EditText
    private lateinit var login: Button
    private lateinit var register: TextView
    private lateinit var userRepo: UserRepo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val sharedPreferences = getSharedPreferences("Pref", Context.MODE_PRIVATE)
        val userEmail = sharedPreferences.getString("userEmail", null)
        if (userEmail != null) {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
            finish()
        } else {
            setContentView(R.layout.activity_login)
            userName = findViewById(R.id.userid)
            userPassword = findViewById(R.id.passwordid)
            login = findViewById(R.id.loginbtn)
            register = findViewById(R.id.register)
            userRepo = UserRepo(this)
            userPassword.hint = "Password"
            register.setOnClickListener {
                val intent = Intent(this, RegisterActivity::class.java)
                startActivity(intent)
            }
            onClick()
        }
    }

    fun onClick() {
        login.setOnClickListener {
            val email = userName.text.toString()
            val password = userPassword.text.toString()

            val user = userRepo.getUserByEmail(email)

            if (user != null && user.password == password) {
                val isLoginsuccess = true
                if (isLoginsuccess) {

                    val intent = Intent(this, DashboardActivity::class.java)
                    startActivity(intent)
                    finish()

                    val sharedPreferences = getSharedPreferences("Pref", Context.MODE_PRIVATE)
                    sharedPreferences.edit().putString("userEmail",email).apply()
                }
            } else {
                Toast.makeText(this, "Invalid Input", Toast.LENGTH_LONG).show()
            }
        }
    }
}