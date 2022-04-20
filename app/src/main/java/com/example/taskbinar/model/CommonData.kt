package com.example.taskbinar.model

import com.google.gson.annotations.SerializedName

data class CommonData (
    @SerializedName("email")
    val email: String,
    @SerializedName("_id")
    val id: String,
    @SerializedName("username")
    val username: String
)