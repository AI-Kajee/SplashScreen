package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class HomeScreenChinese : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen_chinese)

        val button= findViewById<Button>(R.id.buttonBack)
        button.setOnClickListener{
            clickBack(it)
        }
    }

    private fun clickBack(it: View?) {
        Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show()

        val intent = Intent(this, HomeScreen::class.java)
        startActivity(intent)
    }
}