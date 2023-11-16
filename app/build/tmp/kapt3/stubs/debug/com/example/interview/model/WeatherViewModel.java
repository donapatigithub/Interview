package com.example.interview.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\bJ\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\bR\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010\u00a8\u0006\u001a"}, d2 = {"Lcom/example/interview/model/WeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_cityWeatherList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/interview/model/WeatherModel;", "_errorMessage", "", "_weatherData", "apiKey", "apiService", "Lcom/example/interview/model/ApiService;", "cityWeatherlist", "Landroidx/lifecycle/LiveData;", "getCityWeatherlist", "()Landroidx/lifecycle/LiveData;", "errorMessage", "getErrorMessage", "units", "weatherData", "getWeatherData", "getWeather", "", "city", "searchCity", "app_debug"})
public final class WeatherViewModel extends androidx.lifecycle.ViewModel {
    private final java.lang.String apiKey = "8c0b1dfe5aec8cdca63f8bf1fca2f850";
    private final java.lang.String units = "metric";
    private final com.example.interview.model.ApiService apiService = null;
    private final androidx.lifecycle.MutableLiveData<com.example.interview.model.WeatherModel> _weatherData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _errorMessage = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.interview.model.WeatherModel>> _cityWeatherList = null;
    
    public WeatherViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.interview.model.WeatherModel> getWeatherData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.interview.model.WeatherModel>> getCityWeatherlist() {
        return null;
    }
    
    public final void getWeather(@org.jetbrains.annotations.NotNull
    java.lang.String city) {
    }
    
    public final void searchCity(@org.jetbrains.annotations.NotNull
    java.lang.String city) {
    }
}