package com.example.pallete

import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.kofigyan.stateprogressbar.StateProgressBar


class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.pallete.R.layout.profile)
        val descriptionData = arrayOf("Step One", "Step Two", "Step Three", "Step Four")

        var button: Button
        val stateProgressBar = findViewById<StateProgressBar>(com.example.pallete.R.id.your_state_progress_bar_id)
        stateProgressBar.setStateDescriptionData(descriptionData)

        button = findViewById<Button>(com.example.pallete.R.id.button)

        button.setOnClickListener{
            when (stateProgressBar.currentStateNumber) {
                1 -> stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.TWO)
                2 -> stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.THREE)
                3 -> stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.FOUR)
                4 -> stateProgressBar.setAllStatesCompleted(true)
            }
        }

    }
}