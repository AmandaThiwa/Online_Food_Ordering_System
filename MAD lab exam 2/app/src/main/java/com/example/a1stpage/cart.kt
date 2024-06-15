package com.example.a1stpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class cart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cart)

        val checkout = findViewById<Button>(R.id.button2)
        val home = findViewById<ImageView>(R.id.imageView26)
        val search = findViewById<ImageView>(R.id.imageView30)
        val shoppingcart = findViewById<ImageView>(R.id.imageView31)
        val user = findViewById<ImageView>(R.id.imageView32)

        checkout.setOnClickListener{
            val intent = Intent(this@cart,Profile1::class.java)
            startActivity(intent)

        }
        home.setOnClickListener{
            val intent = Intent(this@cart,Menu::class.java)
            startActivity(intent)

        }
        search.setOnClickListener{
            val intent = Intent(this@cart,Menu::class.java)
            startActivity(intent)

        }
        shoppingcart.setOnClickListener{
            val intent = Intent(this@cart,cart::class.java)
            startActivity(intent)

        }
        user.setOnClickListener{
            val intent = Intent(this@cart,Profile1::class.java)
            startActivity(intent)

        }
    }
}