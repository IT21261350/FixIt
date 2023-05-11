package com.example.fixit

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.RatingBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.fixit.model.ReviewData
import com.google.firebase.FirebaseApp
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import java.lang.Exception

class AddReview : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_review)
                FirebaseApp.initializeApp(this)

                var database = Firebase.database.reference

                val nameTextField = findViewById<EditText>(R.id.nameTextField)
                val emailTextField = findViewById<EditText>(R.id.emailTextField)
                val reviewTitleTextField = findViewById<EditText>(R.id.reviewTitleTextField)
                val reviewDescriptionTextFiled = findViewById<EditText>(R.id.reviewDescriptionTitleField)
                var ratingsBar = findViewById<RatingBar>(R.id.ratingBar)
                var submitButton = findViewById<Button>(R.id.submitButton)

                Log.d("Add Review Activity", "On Create Activity")

                submitButton.setOnClickListener(){

                        Log.d("Add Review Activity", "On Click Listener Works")

                        val name = nameTextField.text.toString()
                        val email = emailTextField.text.toString()
                        val reviewTitle = reviewTitleTextField.text.toString()
                        val reviewDescription = reviewDescriptionTextFiled.text.toString()
                        val rating = ratingsBar.rating

                        val review = ReviewData(name,email,reviewTitle,reviewDescription,rating)

                        try {
                                database
                                        .child("reviews")
                                        .setValue(review)
                                        .addOnSuccessListener {
                                                Log.d("Add Review Activity", "DB Works")
                                                val intent = Intent(this, ReviewProfile::class.java)
                                                intent.putExtra("added_review", review.toString())
                                                startActivity(intent)
                                        }.addOnFailureListener {
                                                Log.d("Add Review Activity", "DB fail")
                                                Toast.makeText(this@AddReview,"Couldn't add review", Toast.LENGTH_SHORT ).show()
                                        }.addOnCompleteListener {
                                                Log.d("Add Review Activity", "DB Complete")
                                        }
                        }catch (exception:Exception){
                                Log.d("Add Review Activity",exception.toString())

                        }


                }

        }

        override fun onStart() {
                super.onStart()


        }


} 