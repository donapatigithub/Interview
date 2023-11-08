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
            return emptyList()
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

    fun filterItems(query : String): List<DashboardModel>{
        return _dashboardItems.value?.filter {
        it.name.contains(query, ignoreCase = true)
        }?: emptyList()
    }
    companion object{
        private lateinit var context: Context

        fun initialize(context: Context){
            this.context = context
        }
    }
}