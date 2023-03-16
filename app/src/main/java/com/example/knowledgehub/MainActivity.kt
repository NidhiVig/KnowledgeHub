package com.example.knowledgehub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val letsgo = findViewById<Button>(R.id.button)
        letsgo.setOnClickListener{
            intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}