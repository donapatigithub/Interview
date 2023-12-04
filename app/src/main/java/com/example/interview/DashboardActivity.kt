package com.example.interview

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.ViewTreeObserver
import android.view.WindowManager
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
        val navHomeFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainer) as NavHostFragment
        val navController = navHomeFragment.navController
        DashboardViewModel.initialize(applicationContext)
        val viewModel = ViewModelProvider(this).get(DashboardViewModel::class.java)
        val newItems = listOf(
            DashboardModel(R.drawable.electronics, "Electronics"),
            DashboardModel(R.drawable.mobile, "Mobiles"),
            DashboardModel(R.drawable.clothes, "Clothes"),
            DashboardModel(R.drawable.shoe, "Footwear"),
            DashboardModel(R.drawable.furniture, "Furniture"),
            DashboardModel(R.drawable.toys, "Toys"),
            DashboardModel(R.drawable.kitchen, "Kitchen")
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
                when (it.itemId) {
                    R.id.profile -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fragmentContainer, ProfileFragment())
                            .addToBackStack(null)
                            .commit()
                        true
                    }

                    R.id.cart -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fragmentContainer, CartFragment())
                            .addToBackStack(null)
                            .commit()
                        true
                    }

                    R.id.home -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fragmentContainer, HomeFragment())
                            .addToBackStack(null)
                            .commit()
                        true
                    }

                    else -> false
                }
            }
        // Add an OnPreDrawListener to detect changes in the layout
        val mainLayout = findViewById<View>(R.id.layout)
        mainLayout.viewTreeObserver.addOnPreDrawListener(object :
            ViewTreeObserver.OnPreDrawListener {
            override fun onPreDraw(): Boolean {
                // Check if the height of the content view has changed (keyboard visibility)
                val heightDiff = mainLayout.rootView.height - mainLayout.height
                if (heightDiff > dpToPx(this@DashboardActivity, 200)) {
                    window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
                } else {
                    window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN)
                }
                return true
            }
        })
    }
    private fun dpToPx(context: Context, dp: Int): Int {
        val density = context.resources.displayMetrics.density
        return (dp * density).toInt()
    }
}