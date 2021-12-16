package com.example.testapp.RetroView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.testapp.R
import com.example.testapp.repository.Repository


private lateinit var viewModel: RetroViewModel

class RetroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retro)

        val textView: TextView = findViewById(R.id.textView)
        val textView2: TextView = findViewById(R.id.textView2)
        val textView3: TextView = findViewById(R.id.textView3)
        val textView4: TextView = findViewById(R.id.textView4)

        val repository = Repository()
        val viewModelFactory = RetroViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(RetroViewModel::class.java)
        viewModel.getPost()
        viewModel.myResponse.observe(this, Observer { response ->
            if(response.isSuccessful) {
                Log.d("Response", response.body()?.userId.toString())
                Log.d("Response", response.body()?.id.toString())
                Log.d("Response", response.body()?.title!!)
                Log.d("Response", response.body()?.body!!)

                textView.text = response.body()?.userId.toString()
                textView2.text = response.body()?.id.toString()
                textView3.text = response.body()?.title!!
                textView4.text = response.body()?.body!!
            }else{
                textView.text = response.code().toString()
            }
        })
    }
}