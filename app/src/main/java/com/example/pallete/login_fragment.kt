package com.example.pallete

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class login_fragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View {

        val view: View = inflater.inflate(com.example.pallete.R.layout.login_fragment, container, false)
        val login = view.findViewById<Button>(R.id.login_button)
        val google = view.findViewById<Button>(R.id.google)
        val figma = view.findViewById<Button>(R.id.figma)
        login.setOnClickListener {
            val intent = Intent(this.context, successs::class.java)
            context?.startActivity(intent)
        }
        google.setOnClickListener {
            val intent = Intent(this.context, successs::class.java)
            context?.startActivity(intent)
        }
        figma.setOnClickListener {
            val intent = Intent(this.context, successs::class.java)
            context?.startActivity(intent)
        }
        return view
    }

}