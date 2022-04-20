package com.example.taskbinar.model

import com.google.gson.annotations.SerializedName

data class DataUser (
    @SerializedName("email")
    val email: String,
    @SerializedName("_id")
    val id: String,
    @SerializedName("token")
    val token: String,
    @SerializedName("username")
    val username: String
)