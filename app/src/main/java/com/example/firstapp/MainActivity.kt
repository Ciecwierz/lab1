package com.example.firstapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate (savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonLog = findViewById<Button>(R.id.buttonLog)

    }
}