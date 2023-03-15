package com.example.fixit.Adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.fixit.Fragments.Completed
import com.example.fixit.Fragments.On_going
import com.example.fixit.Fragments.Requests

class ViewPagerAdapter(var context: Context, fm:FragmentManager,var totalTabs:Int) : FragmentStatePagerAdapter(fm) {



    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> {
                Requests()
            }

            1 -> {
                On_going()
            }

            2 -> {
                Completed()
            }
            else -> getItem(position)
        }
    }


    override fun getCount(): Int {
       return totalTabs
    }




}