package com.example.pallete

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.kofigyan.stateprogressbar.StateProgressBar

class team_formation1: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View {
        val view: View = inflater.inflate(com.example.pallete.R.layout.team_formation1, container, false)
        val next1 = view.findViewById<Button>(R.id.solo)
        val next2 = view.findViewById<Button>(R.id.team)
        val viewpager = activity?.findViewById<ViewPager2>(R.id.viewpager)

        val stateProgressBar = activity?.findViewById<StateProgressBar>(R.id.your_state_progress_bar_id)
        next1.setOnClickListener {
            viewpager?.currentItem = 3
            stateProgressBar?.setCurrentStateNumber(StateProgressBar.StateNumber.THREE)

        }
        next2.setOnClickListener {
            viewpager?.currentItem = 3
            stateProgressBar?.setCurrentStateNumber(StateProgressBar.StateNumber.THREE)
        }
        return view
    }
}