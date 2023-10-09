package com.example.interview.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.interview.R

class DashboardViewModel: ViewModel() {

    private val _dashboardItems = MutableLiveData<List<DashboardModel>>()
    val dashboardItems: LiveData<List<DashboardModel>> = _dashboardItems
    init {
        _dashboardItems.value = getDashItems()
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
    fun filterItems(query : String): List<DashboardModel>{
        return getDashItems().filter {
        it.name.contains(query, ignoreCase = true)
        }
    }
}