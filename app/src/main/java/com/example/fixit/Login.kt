package com.example.fixit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var btnLogin = findViewById<Button>(R.id.login_button)
        btnLogin.setOnClickListener{
            var intent = Intent(this,Customer::class.java)
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