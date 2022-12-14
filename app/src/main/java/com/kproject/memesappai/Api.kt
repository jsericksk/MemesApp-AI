package com.kproject.memesappai

import retrofit2.Call
import retrofit2.http.GET

interface Api {

    @GET("/get_memes")
    fun getMemes(): Call<GetMemes>
}