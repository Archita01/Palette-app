package com.example.palette.view

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.palette.R
import com.example.palette.model.UserLink

class LinkAdapter(val c:Context,val userList: ArrayList<UserLink>): RecyclerView.Adapter<LinkAdapter.UserViewHolder>() {
    inner class UserViewHolder(val v:View):RecyclerView.ViewHolder(v){
        var userLink:TextView
        var mMenus:ImageView
        init {
            userLink = v.findViewById(R.id.link)
            mMenus=v.findViewById(R.id.menu_bar)
            mMenus.setOnClickListener { popupMenus() }

        }
        private fun popupMenus(){
            val position=userList[adapterPosition]
            val popupMenus = PopupMenu(c,v)
            popupMenus.inflate(R.menu.show_menu)
            popupMenus.setOnMenuItemClickListener {
                when(it.itemId){
                    R.id.editLink->{
                        val v =LayoutInflater.from(c).inflate(R.layout.add_link,null)
                        val link=v.findViewById<EditText>(R.id.uLink)
                        AlertDialog.Builder(c).setView(v).
                        setPositiveButton("Ok"){
                            dialog,_->
                            position.addLink=link.text.toString()
                            notifyDataSetChanged()
                            dialog.dismiss()

                        }.setNegativeButton("Cancel"){
                            dialog,_->
                            dialog.dismiss()

                        }.create().show()
                        true
                    }
                    R.id.delete->{
                        AlertDialog.Builder(c).setTitle("Delete").setIcon(R.drawable.ic_warning).
                        setMessage("Are you sure you want to delete this item?").
                        setPositiveButton("Yes"){
                                    dialog,_->
                            userList.removeAt(adapterPosition)
                            notifyDataSetChanged()
                            dialog.dismiss()

                        }.setNegativeButton("No"){
                            dialog,_->
                            dialog.dismiss()
                        }.create().show()
                        true
                    }
                    else->true
                }

            }
            popupMenus.show()
            val popup=PopupMenu::class.java.getDeclaredField("mPopup")
            popup.isAccessible=true
            val menu=popup.get(popupMenus)
            menu.javaClass.getDeclaredMethod("setForceShowIcon",Boolean::class.java).invoke(menu,true )
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val inflater=LayoutInflater.from(parent.context)
        val v=inflater.inflate(R.layout.list_link,parent,false)
        return UserViewHolder(v)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val newList=userList[position]
        holder.userLink.text=newList.addLink
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}