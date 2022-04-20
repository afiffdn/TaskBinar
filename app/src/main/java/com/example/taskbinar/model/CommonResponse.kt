package com.example.taskbinar.model

import com.google.gson.annotations.SerializedName

class CommonResponse(
    @SerializedName("data")
    val commonData: CommonData,
    @SerializedName("success")
    val success: Boolean
)