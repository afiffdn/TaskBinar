package com.example.taskbinar.model

import com.google.gson.annotations.SerializedName

class UpdateResponse(
    @SerializedName("data")
    val updateData: UpdateData,
    @SerializedName("success")
    val success: Boolean
)