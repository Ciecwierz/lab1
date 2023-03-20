package com.example.firstapp

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity

class Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        supportActionBar?.setDisplayHomeAsUpEnabled(true);
//        val actionBar: ActionBar? = actionBar
//        actionBar.setHomeButtonEnabled(true)
    }

    override fun onNavigateUp(): Boolean {
        finish()
        true
    }
}