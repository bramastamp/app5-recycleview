package com.smkth.app4_recycleview.utils

import com.smkth.app4_recycleview.model.Buku
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET(value="buku")
    fun getBuku(): Call<List<Buku>>
}
