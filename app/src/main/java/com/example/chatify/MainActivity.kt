package com.example.chatify

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState:    Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        setContentView(R.layout.activity_main)



        val otpPageButton = findViewById<Button>(R.id.to_otp_very)
        otpPageButton.setOnClickListener {
            val intent = Intent(this, otp_verification::class.java)
            startActivity(intent)
        }
    }
}