package com.example.recyle_view

import android.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.NameList
import java.lang.NullPointerException
import java.nio.file.Files.delete

class CustomAdapter(private var mList: List<ViewModel>):RecyclerView.Adapter<CustomAdapter.ViewHolder> (){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    {
            return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = mList[position]
        holder.imageView.setImageResource(ItemsViewModel.image)
        holder.textView.text = ItemsViewModel.text
    }


    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.no)
        val textView: TextView = itemView.findViewById(R.id.name)
    }
}


