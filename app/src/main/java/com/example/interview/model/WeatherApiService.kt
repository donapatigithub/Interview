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
data class WeatherData(
    val name: String,
    val temp: Double,
    val description: String,
    val speed: Double,
    val all: Int
)
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
    private val apiKey = "8c0b1dfe5aec8cdca63f8bf1fca2f850"

    suspend fun getWeatherByCoordinates(latitude: Double, longitude: Double): WeatherData {
        val apiResponse = apiService.getWeatherByCoordinates(latitude, longitude, apiKey)
        return mapApiResponseToWeatherData(apiResponse)
    }

    private fun mapApiResponseToWeatherData(apiResponse: WeatherModel): WeatherData {
       val name = apiResponse.name
       val temp = apiResponse.main.temp
       val description = apiResponse.weather.first().description
       val speed = apiResponse.wind.speed
       val all = apiResponse.clouds.all
        return WeatherData(
            name = name,
            temp = temp,
            description = description,
            speed = speed,
            all = all
        )
    }
}