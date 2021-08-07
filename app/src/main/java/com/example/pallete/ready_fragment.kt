package com.example.pallete

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.kofigyan.stateprogressbar.StateProgressBar

class ready_fragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View {
        val view: View = inflater.inflate(com.example.pallete.R.layout.ready_fragment, container, false)
        val next = view.findViewById<Button>(R.id.continue1)
        val stateProgressBar = activity?.findViewById<StateProgressBar>(R.id.your_state_progress_bar_id)
        next.setOnClickListener {
            val intent = Intent(this.context, team_suggestion::class.java)
            this.context?.startActivity(intent)
        }
        return view
    }
}