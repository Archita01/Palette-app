package com.example.pallete

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tab = findViewById<TabLayout>(R.id.tab)
        val viewpager = findViewById<ViewPager>(R.id.viewpager)
        tab.setupWithViewPager(viewpager)
        viewpager.adapter = ViewPagerAdapter(supportFragmentManager)
    }

    class ViewPagerAdapter(fm: androidx.fragment.app.FragmentManager) : FragmentPagerAdapter(fm) {
        override fun getCount(): Int {
            return 2
        }


        override fun getItem(position: Int): Fragment {
            return when(position){
                0 -> {
                    register_fragment()
                }
                1 -> {
                    login_fragment()
                }
                else -> {
                    register_fragment()
                }
            }
        }
        override fun getPageTitle(position: Int): CharSequence? {
            when(position) {
                0 -> {
                    return "REGISTER"
                }
                1 -> {
                    return "LOGIN"
                }
            }
            return super.getPageTitle(position)
        }

    }
}