package com.example.interview.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {
    @GET("weather")
    suspend fun getWeatherByCoordinates(
        @Query("lat") latitude: Double,
        @Query("lon") longitude: Double,
        @Query("appid") apiKey : String
    ) : WeatherModel
}
class WeatherRepository{
    private val apiService: WeatherApiService

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.openweathermap.org/data/2.5/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        apiService = retrofit.create(WeatherApiService::class.java)
    }

    // Replace "YOUR_API_KEY" with your actual OpenWeatherMap API key
    private val apiKey = "YOUR_API_KEY"

    suspend fun getWeatherByCoordinates(latitude: Double, longitude: Double): WeatherModel {
        val apiResponse = apiService.getWeatherByCoordinates(latitude, longitude, apiKey)
        return mapApiResponseToWeatherData(apiResponse)
    }

    private fun mapApiResponseToWeatherData(apiResponse: WeatherModel): WeatherData {
        return WeatherData(
            temperature = apiResponse.main.temp,
            description = apiResponse.weather.first().description,
            // Add other properties as needed
        )
    }
}