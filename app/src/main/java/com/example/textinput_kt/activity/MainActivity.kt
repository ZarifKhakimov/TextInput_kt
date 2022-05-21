package com.example.textinput_kt.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.textinput_kt.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews(){
        val button = findViewById<Button>(R.id.b_push)
        button.setOnClickListener({
            openNextActivity()
        })
    }

    fun openNextActivity(){
        val intent = Intent(this, Listener::class.java)
        startActivity(intent)
    }
}