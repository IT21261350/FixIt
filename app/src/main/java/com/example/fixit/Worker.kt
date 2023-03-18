package com.example.fixit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Worker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_worker)

        var btnCancel = findViewById<ImageButton>(R.id.worBtnCancel)
        btnCancel.setOnClickListener{
            var intent = Intent(this,Signup::class.java)
            startActivity(intent)
            finish()
        }

    }
}