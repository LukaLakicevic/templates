package com.example.testapp.api

import com.example.testapp.Model.Post
import retrofit2.Response
import retrofit2.http.GET

interface SimpleApi {

    @GET("posts/1")
    suspend fun getPost(): Response<Post>
}