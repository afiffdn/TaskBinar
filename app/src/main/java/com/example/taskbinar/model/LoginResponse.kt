package com.example.taskbinar.model

import com.google.gson.annotations.SerializedName

class LoginResponse(
    @SerializedName("data")
    val dataLogin: DataUser,
    @SerializedName("success")
    val success: Boolean
)