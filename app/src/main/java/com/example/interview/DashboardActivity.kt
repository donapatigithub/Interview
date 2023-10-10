package com.example.interview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class DashboardActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_dashboard)
        val navHomeFragment=supportFragmentManager.findFragmentById(R.id.fragmentContainer)as NavHostFragment
        val navController = navHomeFragment.navController
        if (savedInstanceState == null) {
            val homeFragment = HomeFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, homeFragment)
                .commit()
        }
        val bind = findViewById<BottomNavigationView>(R.id.bottomNav)
            .setOnItemSelectedListener {
            when(it.itemId){
                R.id.profile-> {
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,ProfileFragment())
                        .addToBackStack(null)
                        .commit()
                    true
                }
                R.id.cart-> {
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,CartFragment())
                        .addToBackStack(null)
                        .commit()
                    true
                }
                R.id.home-> {
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,HomeFragment())
                        .addToBackStack(null)
                        .commit()
                    true
                }
                else -> false
            }
        }
    }
}