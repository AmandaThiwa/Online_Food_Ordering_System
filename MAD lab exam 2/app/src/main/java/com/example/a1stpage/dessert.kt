package com.example.a1stpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class dessert : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dessert)

        val AddtoCart = findViewById<Button>(R.id.button3)
        val back = findViewById<ImageView>(R.id.imageView33)

        AddtoCart.setOnClickListener{
            val intent = Intent(this@dessert,cart::class.java)
            startActivity(intent)

        }
        back.setOnClickListener{
            val intent = Intent(this@dessert,Menu::class.java)
            startActivity(intent)

        }
    }
}