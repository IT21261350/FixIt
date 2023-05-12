package com.example.fixit

import com.example.fixit.database.ReviewDataAccess
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private lateinit var reviewDataAccess: ReviewDataAccess


    @Before
    fun setUp() {
        reviewDataAccess = ReviewDataAccess()
        //Set Up
    }


}