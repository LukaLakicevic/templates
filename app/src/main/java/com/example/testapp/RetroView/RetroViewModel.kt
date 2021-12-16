package com.example.testapp.RetroView

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testapp.Model.Post
import com.example.testapp.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class RetroViewModel(private val repository: Repository): ViewModel() {

    val myResponse: MutableLiveData<Response<Post>> = MutableLiveData()

    fun getPost() {
        viewModelScope.launch {
            val response = repository.getPost()
            myResponse.value = response
        }
    }
}