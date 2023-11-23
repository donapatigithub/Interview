package com.example.interview.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\bJ\u000e\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\bJ\u0016\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/example/interview/model/WeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_cityWeatherList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/interview/model/WeatherModel;", "_errorMessage", "", "_liveData", "Lcom/example/interview/model/WeatherData;", "_weatherData", "apiKey", "apiService", "Lcom/example/interview/model/ApiService;", "errorMessage", "Landroidx/lifecycle/LiveData;", "getErrorMessage", "()Landroidx/lifecycle/LiveData;", "liveData", "getLiveData", "units", "weatherData", "getWeatherData", "weatherRepository", "Lcom/example/interview/model/WeatherRepository;", "getWeather", "", "city", "searchCity", "searchCityByCoordnates", "latitude", "", "longitude", "app_debug"})
public final class WeatherViewModel extends androidx.lifecycle.ViewModel {
    private final java.lang.String apiKey = "8c0b1dfe5aec8cdca63f8bf1fca2f850";
    private final java.lang.String units = "metric";
    private final com.example.interview.model.ApiService apiService = null;
    private final androidx.lifecycle.MutableLiveData<com.example.interview.model.WeatherModel> _weatherData = null;
    private final androidx.lifecycle.MutableLiveData<com.example.interview.model.WeatherData> _liveData = null;
    private final com.example.interview.model.WeatherRepository weatherRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _errorMessage = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.interview.model.WeatherModel>> _cityWeatherList = null;
    
    public WeatherViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.interview.model.WeatherData> getLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.interview.model.WeatherModel> getWeatherData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getErrorMessage() {
        return null;
    }
    
    public final void getWeather(@org.jetbrains.annotations.NotNull
    java.lang.String city) {
    }
    
    public final void searchCity(@org.jetbrains.annotations.NotNull
    java.lang.String city) {
    }
    
    public final void searchCityByCoordnates(double latitude, double longitude) {
    }
}