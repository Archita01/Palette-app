package com.example.pallete

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.widget.Adapter
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.palette.model.UserLink
import com.example.palette.view.LinkAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Submission : AppCompatActivity() {
    private lateinit var userAdapter: LinkAdapter
    private lateinit var addsBtn:FloatingActionButton
    private lateinit var recyler:RecyclerView
    private lateinit var userList:ArrayList<UserLink>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submission)
        addsBtn=findViewById(R.id.addBtn)
        recyler=findViewById(R.id.recyclerView2)

        userList= ArrayList()
        userAdapter= LinkAdapter(this,userList)
        recyler.layoutManager=LinearLayoutManager(this)
        recyler.adapter=userAdapter

        addsBtn.setOnClickListener{
            addInfo()
        }


    }
    private fun addInfo(){
        val inflater=LayoutInflater.from(this)
        val v=inflater.inflate(R.layout.add_link,null)
        val addDialog=AlertDialog.Builder(this)
        val userLink=v.findViewById<EditText>(R.id.uLink)
        addDialog.setView(v)
        addDialog.setPositiveButton("Ok"){
            dialog,_->
            val links=userLink.text.toString()
            userList.add(UserLink("$links"))
            userAdapter.notifyDataSetChanged()
            dialog.dismiss()
        }
        addDialog.setNegativeButton("Cancel"){
            dialog,_->
            dialog.dismiss()

        }
        addDialog.create()
        addDialog.show()

    }
}