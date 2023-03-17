package com.example.fixit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        var btnLogin = findViewById<Button>(R.id.signup_button)
        btnLogin.setOnClickListener{
            var intent = Intent(this,Worker::class.java)
            startActivity(intent)
            finish()
        }

    }
}