package com.example.a1stpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)

        val Kottu = findViewById<ImageView>(R.id.imageView2)
        val Dessert = findViewById<ImageView>(R.id.imageView7)
        val Home = findViewById<ImageView>(R.id.imageView18)
        val Search = findViewById<ImageView>(R.id.imageView19)
        val Shoppingcart = findViewById<ImageView>(R.id.imageView20)
        val profile = findViewById<ImageView>(R.id.imageView21)


        Kottu.setOnClickListener {
            val intent = Intent(this@Menu, kottu::class.java)
            startActivity(intent)
        }
        Dessert.setOnClickListener {
            val intent = Intent(this@Menu, dessert::class.java)
            startActivity(intent)
        }
        Home.setOnClickListener {
            val intent = Intent(this@Menu, Menu::class.java)
            startActivity(intent)
        }
        Search.setOnClickListener {
            val intent = Intent(this@Menu, Menu::class.java)
            startActivity(intent)
        }
        Shoppingcart.setOnClickListener {
            val intent = Intent(this@Menu, cart::class.java)
            startActivity(intent)
        }
        profile.setOnClickListener {
            val intent = Intent(this@Menu, Profile1::class.java)
            startActivity(intent)
        }

    }
}