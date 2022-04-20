package com.example.taskbinar.model

import com.google.gson.annotations.SerializedName

class UpdateData(
    @SerializedName("email")
    val email: String,
    @SerializedName("_id")
    val id: String,
    @SerializedName("username")
    val username: String,
    @SerializedName("photo")
    val photo: String?,
)