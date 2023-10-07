package com.example.interview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_dashboard)
        if (savedInstanceState == null){
            val homeFragment =HomeFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer,homeFragment)
                .commit()
        }
    }
}