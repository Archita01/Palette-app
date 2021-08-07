package com.example.pallete

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.kofigyan.stateprogressbar.StateProgressBar

class team_formation_fragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View {
        val view: View = inflater.inflate(com.example.pallete.R.layout.team_formaton_fragment, container, false)
        val next1 = view.findViewById<Button>(R.id.button)
        val viewpager = activity?.findViewById<ViewPager2>(R.id.viewpager)
        val stateProgressBar = activity?.findViewById<StateProgressBar>(R.id.your_state_progress_bar_id)
        next1.setOnClickListener {
            viewpager?.currentItem = 4
            stateProgressBar?.setAllStatesCompleted(true)
        }
        val next2 = view.findViewById<Button>(R.id.join)
        next2.setOnClickListener {
            viewpager?.currentItem = 4
            stateProgressBar?.setAllStatesCompleted(true)
        }
        return view
    }
}