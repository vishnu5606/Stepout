package com.example.aatmnirbhar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class loginpage : AppCompatActivity() {

    private lateinit var forgotpassword_txt:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginpage)

        forgotpassword_txt=findViewById(R.id.forgotpassword_txt)
    }
}