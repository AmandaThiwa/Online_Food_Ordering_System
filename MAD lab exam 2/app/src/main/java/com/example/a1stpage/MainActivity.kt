package com.example.a1stpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        val getstartbtn = findViewById<Button>(R.id.button)

        getstartbtn.setOnClickListener{
            val intent = Intent(this@MainActivity,Menu::class.java)
            startActivity(intent)

        }
    }
}