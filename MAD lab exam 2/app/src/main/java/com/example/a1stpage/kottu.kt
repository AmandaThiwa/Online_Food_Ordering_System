package com.example.a1stpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class kottu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kottu)

        val AddtoCart = findViewById<Button>(R.id.button5)
        val back = findViewById<ImageView>(R.id.imageView29)

        AddtoCart.setOnClickListener{
            val intent = Intent(this@kottu,cart::class.java)
            startActivity(intent)

        }
        back.setOnClickListener{
            val intent = Intent(this@kottu,Menu::class.java)
            startActivity(intent)

        }
    }
}