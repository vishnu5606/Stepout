package com.example.aatmnirbhar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class forgotpassword : AppCompatActivity() {

    private lateinit var resendotptext: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgotpassword)

        resendotptext=findViewById(R.id.resendotptext)



    }
}