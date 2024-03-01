package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class HomeScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        val buttonItalian = findViewById<Button>(R.id.buttonItalian)
        buttonItalian.setOnClickListener{
            clickItalian(it)
        }

        val buttonChinese = findViewById<Button>(R.id.buttonChinese)
        buttonChinese.setOnClickListener{
            clickChinese(it)
        }

        val buttonHindi = findViewById<Button>(R.id.buttonHindi)
        buttonHindi.setOnClickListener{
            clickHindi(it)
        }

        val buttonJapanese = findViewById<Button>(R.id.buttonJapanese)
        buttonJapanese.setOnClickListener{
            clickJapanese(it)
        }

        val buttonZulu = findViewById<Button>(R.id.buttonZulu)
        buttonZulu.setOnClickListener{
            clickZulu(it)
        }

    }

    private fun clickItalian(it: View?) {
        Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show()

        val intent = Intent(this, HomeScreenItalian::class.java)
        startActivity(intent)
    }

    private fun clickChinese(it: View?) {
        Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show()

        val intent = Intent(this, HomeScreenChinese::class.java)
        startActivity(intent)
    }

    private fun clickHindi(it: View?) {
        Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show()

        val intent = Intent(this, HomeScreenHindi::class.java)
        startActivity(intent)
    }

    private fun clickJapanese(it: View?) {
        Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show()

        val intent = Intent(this, HomeScreenJapanese::class.java)
        startActivity(intent)
    }

    private fun clickZulu(it: View?) {
        Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show()

        val intent = Intent(this, HomeScreenZulu::class.java)
        startActivity(intent)
    }

}