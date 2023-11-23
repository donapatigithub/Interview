package com.example.interview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0003J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u000bH\u0016J-\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00052\u000e\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020$0#2\u0006\u0010%\u001a\u00020&H\u0002\u00a2\u0006\u0002\u0010\'J\u001a\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010*\u001a\u00020\u0015H\u0002J\u0010\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020$H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/example/interview/WeatherFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "Location_Permission_Request", "", "binding", "Lcom/example/interview/databinding/FragmentWeatherBinding;", "fusedLocation", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "locationUpdatesReq", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "userRepo", "Lcom/example/interview/dB/UserRepo;", "viewModel", "Lcom/example/interview/model/WeatherViewModel;", "getLiveLocation", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onMapReady", "p0", "onRequestPermissions", "requstCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "requestLocationPermission", "showError", "message", "app_debug"})
public final class WeatherFragment extends androidx.fragment.app.Fragment implements com.google.android.gms.maps.OnMapReadyCallback {
    private com.example.interview.databinding.FragmentWeatherBinding binding;
    private com.example.interview.model.WeatherViewModel viewModel;
    private com.example.interview.dB.UserRepo userRepo;
    private android.content.SharedPreferences sharedPreferences;
    private final int Location_Permission_Request = 123;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocation;
    private boolean locationUpdatesReq = false;
    private com.google.android.gms.maps.GoogleMap googleMap;
    
    public WeatherFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showError(java.lang.String message) {
    }
    
    private final void requestLocationPermission() {
    }
    
    private final void onRequestPermissions(int requstCode, java.lang.String[] permissions, int[] grantResults) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void getLiveLocation() {
    }
    
    @java.lang.Override
    public void onMapReady(@org.jetbrains.annotations.NotNull
    com.google.android.gms.maps.GoogleMap p0) {
    }
}