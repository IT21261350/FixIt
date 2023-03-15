package com.example.fixit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.fixit.Adapter.ViewPagerAdapter
import com.example.fixit.Adapter.orderAdapter
import com.google.android.material.tabs.TabLayout

class worker_orders_page : AppCompatActivity() {


    private lateinit var tabLayout: TabLayout
    private lateinit var  viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_worker_orders_page)

        tabLayout = findViewById(R.id.tabLayoutOrders)
        viewPager = findViewById(R.id.viewPager)

        tabLayout.addTab(tabLayout.newTab().setText("Requests"))
        tabLayout.addTab(tabLayout.newTab().setText("On Going"))
        tabLayout.addTab(tabLayout.newTab().setText("Completed"))
        tabLayout.tabGravity = TabLayout.GRAVITY_FILL

        val adapter = orderAdapter(this,supportFragmentManager,
        tabLayout.tabCount)
        viewPager.adapter = adapter

        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPager.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })

    }
}