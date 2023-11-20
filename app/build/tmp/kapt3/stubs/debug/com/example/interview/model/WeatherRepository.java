package com.example.interview.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/interview/model/WeatherRepository;", "", "()V", "apiKey", "", "apiService", "Lcom/example/interview/model/WeatherApiService;", "getWeatherByCoordinates", "Lcom/example/interview/model/WeatherData;", "latitude", "", "longitude", "(DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mapApiResponseToWeatherData", "apiResponse", "Lcom/example/interview/model/WeatherModel;", "app_debug"})
public final class WeatherRepository {
    private final com.example.interview.model.WeatherApiService apiService = null;
    private final java.lang.String apiKey = "8c0b1dfe5aec8cdca63f8bf1fca2f850";
    
    public WeatherRepository() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getWeatherByCoordinates(double latitude, double longitude, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.interview.model.WeatherData> continuation) {
        return null;
    }
    
    private final com.example.interview.model.WeatherData mapApiResponseToWeatherData(com.example.interview.model.WeatherModel apiResponse) {
        return null;
    }
}