package com.example.testapp.PictureSwap

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.Main.MainActivity
import com.example.testapp.R
class PictureSwapActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_picture_swap)

    var textView : TextView = findViewById(R.id.text_view)
    var imageView : ImageView = findViewById(R.id.image_view)
    var buttonNext : Button = findViewById(R.id.button)
    var buttonPlay : Button = findViewById(R.id.button2)
    var buttonMenu : Button = findViewById(R.id.button3)

    buttonNext.setOnClickListener(View.OnClickListener {
        imageView.setImageDrawable(getDrawable(R.drawable.one))
    }
    )
    buttonPlay.setOnClickListener {
        imageView.setImageDrawable(getDrawable(R.drawable.two))
    }
        buttonMenu.setOnClickListener(View.OnClickListener {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    )
}
}