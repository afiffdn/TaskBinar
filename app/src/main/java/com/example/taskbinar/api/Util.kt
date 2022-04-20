package com.example.taskbinar.api

import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONObject

object Util {
    fun createRequestBody(vararg params :Pair<String,Any>) =
        JSONObject(mapOf(*params)).toString()
            .toRequestBody("application/json; charset=utf-8".toMediaTypeOrNull())
}