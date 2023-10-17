package com.example.interview.model

data class RegisterModel (
    var name: NameModel? = null,
    val mobile: String,
    val email: String,
    val address: Address? = null,
    val password: String
)