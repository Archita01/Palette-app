package com.example.pallete

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class successs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.success)
        val continu = findViewById<Button>(R.id.cont)
        continu.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }


    }
}