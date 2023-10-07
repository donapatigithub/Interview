package com.example.interview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.FragmentManager

class Login : AppCompatActivity() {
   private lateinit var userName : EditText
   private lateinit var userPassword : EditText
   private lateinit var login: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        userName = findViewById(R.id.userid)
        userPassword = findViewById(R.id.password)
        login = findViewById(R.id.loginbtn)

        onClick()
    }
    fun onClick(){
        login.setOnClickListener {
            val user = userName.text.toString()
            val password = userPassword.text.toString()

            if (user == "1" && password=="1"){
                val isLoginsuccess= true
                if (isLoginsuccess) {
                    /*val fragment = HomeFragment()
                    val fragmentManager = supportFragmentManager
                    val transaction = fragmentManager.beginTransaction()
                    transaction.replace(R.id.fragmentcontainer, fragment)
                    transaction.commit()
                    finish()*/
                    val intent = Intent(this,DashboardActivity::class.java)
                    startActivity(intent)
                }
            }else{
                Toast.makeText(this,"Invalid Input",Toast.LENGTH_LONG).show()
            }
        }
    }
}