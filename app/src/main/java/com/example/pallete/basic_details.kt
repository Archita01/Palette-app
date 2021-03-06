package com.example.pallete

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.kofigyan.stateprogressbar.StateProgressBar

class basic_details :Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View {
        val view: View = inflater.inflate(com.example.pallete.R.layout.basic_details_fragment,container,false)

        val next = view.findViewById<Button>(R.id.next1)
        val viewpager = activity?.findViewById<ViewPager2>(R.id.viewpager)
        val stateProgressBar = activity?.findViewById<StateProgressBar>(R.id.your_state_progress_bar_id)
        next.setOnClickListener {
            viewpager?.currentItem = 1
            stateProgressBar?.setCurrentStateNumber(StateProgressBar.StateNumber.TWO)
        }
        return view
    }
}