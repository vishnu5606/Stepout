package com.example.aatmnirbhar

import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signupButton = findViewById<Button>(R.id.signup)
        signupButton.setOnClickListener {
            val Intent = Intent(this,signin_page::class.java)
            startActivity(Intent)
        }

    }

}