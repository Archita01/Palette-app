package com.example.pallete

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class team_adapter(val context: Context?, val names: Array<String>, val img: Array<Int>) :RecyclerView.Adapter<team_adapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(com.example.pallete.R.layout.team, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.profile_picture.setImageResource(img[position])
        holder.name.text = names[position]
    }

    override fun getItemCount(): Int {
        return names.size
    }

    class Holder(itemView: View, ) : RecyclerView.ViewHolder(itemView) {
        val profile_picture: ImageView = itemView.findViewById(R.id.imag)
        val name: TextView = itemView.findViewById(R.id.title)

    }
}