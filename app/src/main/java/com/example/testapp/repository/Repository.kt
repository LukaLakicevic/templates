package com.example.testapp.repository

import com.example.testapp.Model.Post
import com.example.testapp.api.RetrofitInstance
import retrofit2.Response

class Repository {

    suspend fun getPost():Response<Post> {
        return RetrofitInstance.api.getPost()
    }
}