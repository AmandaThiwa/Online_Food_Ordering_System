package com.example.a1stpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Profile1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)

        val bank= findViewById<Button>(R.id.button6)
        val menu = findViewById<Button>(R.id.button7)

        bank.setOnClickListener{
            val intent = Intent(this@Profile1,bankdetails::class.java)
            startActivity(intent)
        }
        menu.setOnClickListener{
            val intent = Intent(this@Profile1,Menu::class.java)
            startActivity(intent)
        }

    }
}

