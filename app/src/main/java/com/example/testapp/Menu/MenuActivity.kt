package com.example.testapp.Menu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testapp.R
import com.example.testapp.Menu.models.DataSource
import com.example.testapp.Menu.models.MenuAdapter
import com.example.testapp.Menu.models.TopSpacingItemDecoration

class MenuActivity : AppCompatActivity() {

    private lateinit var postAdapter : MenuAdapter
    private lateinit var recyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        initRcyclerView()
        addDataSet()
        }

    private fun initRcyclerView() {
        recyclerView = findViewById(R.id.rec_view)

        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MenuActivity)
            val topSpacingDecoration = TopSpacingItemDecoration(30)
            addItemDecoration(topSpacingDecoration)
            postAdapter = MenuAdapter()
            adapter = postAdapter

//        recyclerView.layoutManager = LinearLayoutManager(this@MenuActivity)
//        postAdapter = MenuAdapter()
//        recyclerView.adapter = postAdapter                    SAME AS THIS ONE DOWN

        }
    }

    private fun addDataSet() {
        val data = DataSource.createDataSet()
        postAdapter.submitList(data)
    }
}