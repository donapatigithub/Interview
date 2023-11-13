package com.example.interview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import com.example.interview.model.DashboardModel
import com.example.interview.model.DashboardViewModel
import com.google.android.material.bottomnavigation.BottomNavigationView


class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_dashboard)
        val navHomeFragment=supportFragmentManager.findFragmentById(R.id.fragmentContainer)as NavHostFragment
        val navController = navHomeFragment.navController
        DashboardViewModel.initialize(applicationContext)
        val viewModel = ViewModelProvider(this).get(DashboardViewModel::class.java)
        val newItems = listOf(
            DashboardModel(R.drawable.electronics,"Electronics"),
            DashboardModel(R.drawable.mobile,"Mobiles"),
            DashboardModel(R.drawable.clothes,"Clothes"),
            DashboardModel(R.drawable.shoe,"Footwear"),
            DashboardModel(R.drawable.furniture,"Furniture"),
            DashboardModel(R.drawable.toys,"Toys"),
            DashboardModel(R.drawable.kitchen,"Kitchen")
        )
        viewModel.updateDashboardItems(newItems)
        if (savedInstanceState == null) {
            val homeFragment = HomeFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, homeFragment)
                .commit()
        }
        findViewById<BottomNavigationView>(R.id.bottomNav)
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