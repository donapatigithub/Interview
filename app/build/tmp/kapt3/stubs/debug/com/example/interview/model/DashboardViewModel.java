package com.example.interview.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/example/interview/model/DashboardViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_dashboardItems", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/interview/model/DashboardModel;", "dashboardItems", "Landroidx/lifecycle/LiveData;", "getDashboardItems", "()Landroidx/lifecycle/LiveData;", "filterItems", "query", "", "getDashItems", "loadDashboardItems", "saveDashboardItems", "", "updateDashboardItems", "newItems", "Companion", "app_debug"})
public final class DashboardViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.interview.model.DashboardModel>> _dashboardItems = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.example.interview.model.DashboardModel>> dashboardItems = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.interview.model.DashboardViewModel.Companion Companion = null;
    private static android.content.Context context;
    
    public DashboardViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.interview.model.DashboardModel>> getDashboardItems() {
        return null;
    }
    
    private final java.util.List<com.example.interview.model.DashboardModel> loadDashboardItems() {
        return null;
    }
    
    public final void saveDashboardItems() {
    }
    
    public final void updateDashboardItems(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.interview.model.DashboardModel> newItems) {
    }
    
    private final java.util.List<com.example.interview.model.DashboardModel> getDashItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.interview.model.DashboardModel> filterItems(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/interview/model/DashboardViewModel$Companion;", "", "()V", "context", "Landroid/content/Context;", "initialize", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void initialize(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
        }
    }
}