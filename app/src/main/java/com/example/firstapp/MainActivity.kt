package com.example.firstapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate (savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu1, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       return when (item.itemId)
       {
           R.id.action_goto_activity -> {
               val mStartActBtn = findViewById<Button>(R.id.action_goto_activity)

               mStartActBtn.setOnClickListener{
                   startActivity(Intent(this@MainActivity, Info::class.java))

               }
               true
           }
           else -> super.onOptionsItemSelected(item)
       }
    }
}