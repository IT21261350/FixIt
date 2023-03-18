package com.example.fixit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

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

        var btnCancel = findViewById<ImageButton>(R.id.btnCancel)
        btnCancel.setOnClickListener{
            var intent = Intent(this,LogInSignUp::class.java)
            startActivity(intent)
            finish()
        }

    }
}