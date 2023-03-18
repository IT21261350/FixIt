package com.example.fixit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Customer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer)

        var btnCancel = findViewById<ImageButton>(R.id.cusBtnCancel)
        btnCancel.setOnClickListener{
            var intent = Intent(this,Login::class.java)
            startActivity(intent)
            finish()
        }

    }
}