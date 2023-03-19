package com.example.firstapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate (savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonLog = findViewById<Button>(R.id.buttonLog)
        val buttonToast = findViewById<Button>(R.id. buttonToast)
        val buttonRewrite =findViewById<Button>(R.id. buttonRewrite)
        val editTextMessage = findViewById<EditText>(R.id. editTextMessage)
        buttonLog.setOnClickListener{


            val text = editTextMessage.text.toString()
            Log.d("FirstApp", "$text")

        }

        buttonToast.setOnClickListener{
            val text = editTextMessage.text.toString()
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()

        }
        buttonRewrite.setOnClickListener {
            val textViewRewriteText = findViewById<TextView>(R.id. textViewRewriteText)
            textViewRewriteText.text = editTextMessage.text.toString()

        }

    }
}