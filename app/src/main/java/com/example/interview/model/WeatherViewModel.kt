package com.example.interview.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Response

class WeatherViewModel :ViewModel() {
    private val apiKey = "8c0b1dfe5aec8cdca63f8bf1fca2f850"
    private val units = "metric"

    private val apiService = RetrofitClient.apiService
    private val _weatherData = MutableLiveData<WeatherModel>()
    val weatherData : LiveData<WeatherModel>
        get() = _weatherData

    private val _errorMessage = MutableLiveData<String>()
    val errorMessage : LiveData<String>
        get() = _errorMessage

    private val _cityWeatherList = MutableLiveData<List<WeatherModel>>()
    val cityWeatherlist:LiveData<List<WeatherModel>>
        get() = _cityWeatherList

    fun getWeather(city : String){
        val url = "weather?q=$city&appid=$apiKey&units=$units"

        apiService.getWeather(url).enqueue(object : retrofit2.Callback<WeatherModel>{
            override fun onResponse(call: Call<WeatherModel>, response: Response<WeatherModel>) {
                if (response.isSuccessful){
                    _weatherData.postValue(response.body())
                }else{
                    _errorMessage.postValue("Failed to fetch data for $city.\n ${response.message()}")
                }
            }

            override fun onFailure(call: Call<WeatherModel>, t: Throwable) {
                _errorMessage.postValue("Failed to fetch data for $city.\n ${t.message}")
            }
        })
    }
    fun searchCity(city: String){
        val url = "weather?q=$city&appid=$apiKey&units=$units"
        apiService.getWeather(url).enqueue(object  : retrofit2.Callback<WeatherModel>{
            override fun onResponse(call: Call<WeatherModel>, response: Response<WeatherModel>) {
                if (response.isSuccessful){
                    val currentList = _cityWeatherList.value ?: emptyList()
                    _cityWeatherList.postValue((currentList + response.body()) as List<WeatherModel>?)
                }else{
                    _errorMessage.postValue("Failed to fetch data for $city.\n ${response.message()}")
                }
            }

            override fun onFailure(call: Call<WeatherModel>, t: Throwable) {
                _errorMessage.postValue("Failed to fetch data for $city.\n ${t.message}")
            }
        })
    }
}