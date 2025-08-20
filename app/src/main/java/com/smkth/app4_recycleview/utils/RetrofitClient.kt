package com.smkth.app4_recycleview.utils

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL =  "https://api.abdyllaan.cc/"

    val instance: ApiService by lazy {
        val retrofit = Retrofit.builder()
            .baseUrl(baseUrl = BASE_URL)
            .addConverterFactory(factory = GsonConverterFactory.create())
            .build()

        retrofit.create(ApiService::class.java)
    }
}