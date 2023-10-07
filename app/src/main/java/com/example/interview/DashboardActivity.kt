package com.example.interview

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.HorizontalScrollView
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.view.size
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.interview.databinding.ActivityDashboardBinding
import com.example.interview.model.DashboardModel
import com.example.interview.model.DashboardViewModel

class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding
    private val dashboardAdapter =DashboardAdapter()
    private lateinit var viewModel: DashboardViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_dashboard)
        viewModel = ViewModelProvider(this).get(DashboardViewModel::class.java)
        binding.lifecycleOwner=this
        binding.adapter=dashboardAdapter
        viewModel.dashboardItems.observe(this ,{ items ->
            dashboardAdapter.submitList(items)
        })
        imageScroll()
    }

    fun imageScroll(){
        val imageContainer = binding.imgscroll

        if (imageContainer != null) {
            val image = arrayOf(
                R.drawable.mobile,
                R.drawable.clothes,
                R.drawable.electronics,
                R.drawable.shoe,
                R.drawable.toys,
                R.drawable.furniture
            )
            Log.d("Sizeimg", image.size.toString())
            val imageSpace = resources.getDimensionPixelSize(R.dimen.img_space)

            for (i in image) {
                val imageView = ImageView(this)
                imageView.setImageResource(i)
                val layoutParams = LinearLayoutCompat.LayoutParams(
                    LinearLayoutCompat.LayoutParams.WRAP_CONTENT,
                    LinearLayoutCompat.LayoutParams.WRAP_CONTENT
                )
                layoutParams.marginEnd = imageSpace
                imageView.layoutParams = layoutParams
                imageContainer.addView(imageView)
            }
        }
    }
}