package com.example.interview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J+\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020$H\u0016\u00a2\u0006\u0002\u0010%J\u000e\u0010&\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/example/interview/RegisterActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "MY_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE", "", "cancel", "Landroid/widget/Button;", "cityEditText", "Landroid/widget/EditText;", "confirmPasswordEditText", "emailEditText", "flatEditText", "landmarkEditText", "lastnameEditText", "midnameEditText", "mobileEditText", "nameEditText", "newPasswordEditText", "pincodeEditText", "register", "streetEditText", "user", "Lcom/example/interview/model/RegisterModel;", "userRepo", "Lcom/example/interview/dB/UserRepo;", "checkAndRequestPermissions", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "saveUserInformationToExternalStorage", "app_debug"})
public final class RegisterActivity extends androidx.appcompat.app.AppCompatActivity {
    private android.widget.EditText nameEditText;
    private android.widget.EditText midnameEditText;
    private android.widget.EditText lastnameEditText;
    private android.widget.EditText flatEditText;
    private android.widget.EditText streetEditText;
    private android.widget.EditText landmarkEditText;
    private android.widget.EditText cityEditText;
    private android.widget.EditText pincodeEditText;
    private android.widget.EditText mobileEditText;
    private android.widget.EditText emailEditText;
    private android.widget.EditText newPasswordEditText;
    private android.widget.EditText confirmPasswordEditText;
    private com.example.interview.dB.UserRepo userRepo;
    private android.widget.Button register;
    private android.widget.Button cancel;
    private final int MY_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE = 123;
    private com.example.interview.model.RegisterModel user;
    
    public RegisterActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void checkAndRequestPermissions() {
    }
    
    @java.lang.Override
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    public final void saveUserInformationToExternalStorage(@org.jetbrains.annotations.NotNull
    com.example.interview.model.RegisterModel user) {
    }
}