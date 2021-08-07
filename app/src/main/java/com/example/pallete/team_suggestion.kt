package com.example.pallete

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class team_suggestion : AppCompatActivity() {
    var recycle: RecyclerView? = null
    var adapter: team_adapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val names = arrayOf("Mathhew John", "John B", "Kiara Taylor","James Potter", "Severus Snape")
       val images = arrayOf(R.drawable.photo,R.drawable.photo,R.drawable.photo,R.drawable.photo,R.drawable.photo)
        setContentView(R.layout.team_suggestionn)
        recycle = findViewById(R.id.recycle)
        recycle?.layoutManager = LinearLayoutManager(this)
        adapter = team_adapter(this, names, images)
        recycle?.adapter = adapter
    }
}
