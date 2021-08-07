package com.example.pallete

import android.graphics.Typeface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.kofigyan.stateprogressbar.StateProgressBar


class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)
        val descriptionData = arrayOf("Basic\nDetails", "Email\nVerification", "Team\nFormation", "Ready to\nshift pixels")

        val stateProgressBar = findViewById<StateProgressBar>(com.example.pallete.R.id.your_state_progress_bar_id)
        stateProgressBar.setStateDescriptionData(descriptionData)
        stateProgressBar.setStateDescriptionTypeface(ResourcesCompat.getFont(this, R.font.montserrat).toString());
        val fragmentList = arrayListOf<Fragment>(
                basic_details(),
                email_ver(),
                team_formation1(),
                team_formation_fragment(),
                ready_fragment()
        )
        val viewpager = findViewById<ViewPager2>(com.example.pallete.R.id.viewpager)
        val adapter = ViewPagerAdapter(fragmentList, supportFragmentManager, lifecycle)
        viewpager.adapter = adapter
        viewpager.isUserInputEnabled = false


    }

}

    class ViewPagerAdapter(list: ArrayList<Fragment>,fm: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fm, lifecycle)
    {
        private val fragmentList : ArrayList<Fragment> = list

        override fun getItemCount(): Int {
            return fragmentList.size
        }

        override fun createFragment(position: Int): Fragment {
            return fragmentList[position]
        }


    }
