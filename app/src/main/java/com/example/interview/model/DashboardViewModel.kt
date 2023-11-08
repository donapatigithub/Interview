package com.example.interview.model

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.interview.R
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.File
import java.io.FileWriter

class DashboardViewModel: ViewModel() {

    private val _dashboardItems = MutableLiveData<List<DashboardModel>>()
    val dashboardItems: LiveData<List<DashboardModel>> = _dashboardItems
    init {
        _dashboardItems.value = loadDashboardItems()
    }

    private fun loadDashboardItems() : List<DashboardModel>{
        val file = File(context.filesDir, "dashboard_items.json")
        if (file.exists()){
            val json = file.readText()
            val type = object : TypeToken<List<DashboardModel>>() {}.type
            return Gson().fromJson(json, type)
        }else{
            return getDashItems()
        }
    }
    fun saveDashboardItems(){
        val json = Gson().toJson(_dashboardItems.value)
        val file = File(context.filesDir,"dashboard_items.json")
        FileWriter(file).use {
            it.write(json)
        }
    }

    fun updateDashboardItems(newItems: List<DashboardModel>){
        _dashboardItems.value = newItems
        saveDashboardItems()
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
    companion object{
        private lateinit var context: Context

        fun initialize(context: Context){
            this.context = context
        }
    }
}