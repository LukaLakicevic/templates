package com.example.testapp.Main

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testapp.BottomNavigation.NavigationActivity
import com.example.testapp.Main.model.ProjectList
import com.example.testapp.Main.model.MainAdapter
import com.example.testapp.Menu.MenuActivity
import com.example.testapp.Menu.models.TopSpacingItemDecoration
import com.example.testapp.PictureSwap.PictureSwapActivity
import com.example.testapp.R
import com.example.testapp.RetroView.RetroActivity

class MainActivity : AppCompatActivity() {

    private lateinit var mainAdapter: MainAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRcyclerView()
        addDataSet()
    }

    private fun initRcyclerView() {
        recyclerView = findViewById(R.id.rec_view)

        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            val topSpacingDecoration = TopSpacingItemDecoration(30)
            addItemDecoration(topSpacingDecoration)
            mainAdapter = MainAdapter { setClick(it) }
            adapter = mainAdapter

        }
    }

    private fun setClick(pozicija: Int) {
        Toast.makeText(
            this@MainActivity,
            "Made it #${pozicija}",
            Toast.LENGTH_SHORT
        ).show()

        var screen = when(pozicija) {
            0 -> {PictureSwapActivity::class.java}
            1 -> {MenuActivity::class.java}
            2 -> {NavigationActivity::class.java}
            3 -> {RetroActivity::class.java}
            else -> {MenuActivity::class.java}
        }
        val intent = Intent(this, screen)
        startActivity(intent)
    }

    private fun addDataSet() {
        val data = ProjectList.createDataSet()
        mainAdapter.submitList(data)
    }

}


//override fun onCreate(savedInstanceState: Bundle?) {
//    super.onCreate(savedInstanceState)
//    setContentView(R.layout.activity_main)
//
//    var textView : TextView = findViewById(R.id.text_view)
//    var imageView : ImageView = findViewById(R.id.image_view)
//    var buttonNext : Button = findViewById(R.id.button_next)
//    var buttonPlay : Button = findViewById(R.id.button_play)
//    var buttonMenu : Button = findViewById(R.id.menu)
//
//    buttonNext.setOnClickListener(View.OnClickListener {
//        imageView.setImageDrawable(getDrawable(R.drawable.ic_launcher_background))
//    }
//    )
//    buttonPlay.setOnClickListener(View.OnClickListener {
//        imageView.setImageDrawable(getDrawable(R.drawable.ic_launcher_foreground))
//    }
//    )
//    buttonMenu.setOnClickListener(View.OnClickListener {
//        val intent = Intent(this, MenuActivity::class.java)
//        startActivity(intent)
//    }
//    )
//}