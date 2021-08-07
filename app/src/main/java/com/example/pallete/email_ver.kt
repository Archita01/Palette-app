package com.example.pallete

import android.os.Bundle
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.kofigyan.stateprogressbar.StateProgressBar

class email_ver: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View {
        val view: View = inflater.inflate(com.example.pallete.R.layout.email_ver_fragment, container, false)
        val next = view.findViewById<Button>(R.id.verify)
        val viewpager = activity?.findViewById<ViewPager2>(R.id.viewpager)
        val text = activity?.findViewById<TextView>(R.id.textView)
        val stateProgressBar = activity?.findViewById<StateProgressBar>(R.id.your_state_progress_bar_id)
        next.setOnClickListener {
            text?.text = "You are all set to submit your individual application or join a team!"
            viewpager?.currentItem = 2
            stateProgressBar?.setCurrentStateNumber(StateProgressBar.StateNumber.THREE)
        }
        return view
    }
}