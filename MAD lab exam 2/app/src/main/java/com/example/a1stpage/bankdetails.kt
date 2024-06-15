package com.example.a1stpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class bankdetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bankdetails)

        val save = findViewById<Button>(R.id.button4)
        val homepage = findViewById<Button>(R.id.button8)


        save.setOnClickListener{
            val intent = Intent(this@bankdetails,last::class.java)
            startActivity(intent)

        }
        homepage.setOnClickListener{
            val intent = Intent(this@bankdetails,Menu::class.java)
            startActivity(intent)

        }
    }
}