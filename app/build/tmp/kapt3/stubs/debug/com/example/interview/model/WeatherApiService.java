package com.example.interview.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/interview/model/WeatherApiService;", "", "getWeatherByCoordinates", "Lcom/example/interview/model/WeatherModel;", "latitude", "", "longitude", "apiKey", "", "(DDLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface WeatherApiService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "weather")
    public abstract java.lang.Object getWeatherByCoordinates(@retrofit2.http.Query(value = "lat")
    double latitude, @retrofit2.http.Query(value = "lon")
    double longitude, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "appid")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.interview.model.WeatherModel> continuation);
}