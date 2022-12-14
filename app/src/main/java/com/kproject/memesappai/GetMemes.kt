package com.kproject.memesappai

data class GetMemes(
    val success: Boolean,
    val data: Data
)

data class Data(
    val memes: List<Meme>
)

data class Meme(
    val id: String,
    val name: String,
    val url: String,
    val width: Int,
    val height: Int
)