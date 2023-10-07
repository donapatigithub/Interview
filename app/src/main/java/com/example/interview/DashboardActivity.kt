package com.example.interview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.HorizontalScrollView
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.databinding.DataBindingUtil
import com.example.interview.databinding.ActivityDashboardBinding
import com.example.interview.model.DashboardModel

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityDashboardBinding=DataBindingUtil.setContentView(this,R.layout.activity_dashboard)
        binding.dashRV.adapter=DashboardAdapter(getDashItems())

        imageScroll()
    }

    private fun getDashItems():List<DashboardModel>{
        return listOf(
            DashboardModel(R.drawable.electronics,"Electronics"),
            DashboardModel(R.drawable.mobile,"Mobiles"),
            DashboardModel(R.drawable.clothes,"Clothes"),
            DashboardModel(R.drawable.shoe,"Footwear"),
            DashboardModel(R.drawable.furniture,"Furniture"),
            DashboardModel(R.drawable.toys,"Toys"),
            DashboardModel(R.drawable.kitchen,"Kitchen")
        )
    }
    fun imageScroll(){
        val imageContainer = findViewById<LinearLayoutCompat>(R.id.imgscroll)

        val image = arrayOf(
            R.drawable.mobile,
            R.drawable.clothes,
            R.drawable.electronics,
            R.drawable.shoe,
            R.drawable.toys,
            R.drawable.furniture
        )
        val imageSpace = resources.getDimensionPixelSize(R.dimen.img_space)

        for (i in image){
            val imageView = ImageView(this)
            imageView.setImageResource(i)
            val layoutParams = LinearLayoutCompat.LayoutParams(
                LinearLayoutCompat.LayoutParams.WRAP_CONTENT,
                LinearLayoutCompat.LayoutParams.WRAP_CONTENT
            )
            layoutParams.marginEnd = imageSpace
            imageView.layoutParams=layoutParams
            imageContainer.addView(imageView)
        }

    }
}