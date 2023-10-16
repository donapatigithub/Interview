package com.example.interview.dB;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/interview/dB/UserRepo;", "", "conext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "userDB", "Lcom/example/interview/dB/AppDB;", "getUserByEmail", "Lcom/example/interview/model/RegisterModel;", "email", "", "registerUser", "", "user", "app_debug"})
public final class UserRepo {
    private final com.example.interview.dB.AppDB userDB = null;
    
    public UserRepo(@org.jetbrains.annotations.NotNull
    android.content.Context conext) {
        super();
    }
    
    public final long registerUser(@org.jetbrains.annotations.NotNull
    com.example.interview.model.RegisterModel user) {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable
    @android.annotation.SuppressLint(value = {"Range"})
    public final com.example.interview.model.RegisterModel getUserByEmail(@org.jetbrains.annotations.NotNull
    java.lang.String email) {
        return null;
    }
}