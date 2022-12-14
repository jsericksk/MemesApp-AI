package com.kproject.memesappai

import retrofit2.Retrofit
import retrofit2.awaitResponse
import retrofit2.converter.gson.GsonConverterFactory

class MemeRepository {

    private val api: Api = Retrofit.Builder()
        .baseUrl("https://api.imgflip.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(Api::class.java)

    suspend fun getMemes(): List<Meme> {
        val response = api.getMemes().awaitResponse()
        return response.body()?.data?.memes ?: emptyList()
    }
}