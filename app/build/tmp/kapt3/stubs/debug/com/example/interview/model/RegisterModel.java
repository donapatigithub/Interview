package com.example.interview.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J?\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e\u00a8\u0006!"}, d2 = {"Lcom/example/interview/model/RegisterModel;", "", "name", "Lcom/example/interview/model/NameModel;", "mobile", "", "email", "address", "Lcom/example/interview/model/Address;", "password", "(Lcom/example/interview/model/NameModel;Ljava/lang/String;Ljava/lang/String;Lcom/example/interview/model/Address;Ljava/lang/String;)V", "getAddress", "()Lcom/example/interview/model/Address;", "getEmail", "()Ljava/lang/String;", "getMobile", "getName", "()Lcom/example/interview/model/NameModel;", "setName", "(Lcom/example/interview/model/NameModel;)V", "getPassword", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class RegisterModel {
    @org.jetbrains.annotations.Nullable
    private com.example.interview.model.NameModel name;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String mobile = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String email = null;
    @org.jetbrains.annotations.Nullable
    private final com.example.interview.model.Address address = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String password = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.interview.model.RegisterModel copy(@org.jetbrains.annotations.Nullable
    com.example.interview.model.NameModel name, @org.jetbrains.annotations.NotNull
    java.lang.String mobile, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.Nullable
    com.example.interview.model.Address address, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public RegisterModel(@org.jetbrains.annotations.Nullable
    com.example.interview.model.NameModel name, @org.jetbrains.annotations.NotNull
    java.lang.String mobile, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.Nullable
    com.example.interview.model.Address address, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.interview.model.NameModel component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.interview.model.NameModel getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable
    com.example.interview.model.NameModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMobile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.interview.model.Address component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.interview.model.Address getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPassword() {
        return null;
    }
}