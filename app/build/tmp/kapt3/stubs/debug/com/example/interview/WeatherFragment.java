package com.example.interview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0003J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J-\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00042\u000e\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#H\u0002\u00a2\u0006\u0002\u0010$J\u001a\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\'\u001a\u00020\u0014H\u0002J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020!H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/example/interview/WeatherFragment;", "Landroidx/fragment/app/Fragment;", "()V", "Location_Permission_Request", "", "binding", "Lcom/example/interview/databinding/FragmentWeatherBinding;", "cityListAdapter", "Lcom/example/interview/WeatherAdapter;", "fusedLocation", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "locationUpdatesReq", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "userRepo", "Lcom/example/interview/dB/UserRepo;", "viewModel", "Lcom/example/interview/model/WeatherViewModel;", "getLiveLocation", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissions", "requstCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "requestLocationPermission", "showError", "message", "app_debug"})
public final class WeatherFragment extends androidx.fragment.app.Fragment {
    private com.example.interview.databinding.FragmentWeatherBinding binding;
    private com.example.interview.model.WeatherViewModel viewModel;
    private com.example.interview.WeatherAdapter cityListAdapter;
    private com.example.interview.dB.UserRepo userRepo;
    private android.content.SharedPreferences sharedPreferences;
    private final int Location_Permission_Request = 123;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocation;
    private boolean locationUpdatesReq = false;
    
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
}