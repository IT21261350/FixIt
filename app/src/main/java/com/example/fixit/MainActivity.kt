package com.example.fixit

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fixit.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference


class MainActivity : AppCompatActivity() {

     private lateinit var binding : ActivityMainBinding
     private lateinit var database : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.


    }
}
