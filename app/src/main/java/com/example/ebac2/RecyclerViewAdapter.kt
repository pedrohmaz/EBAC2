package com.example.ebac2


import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

import com.example.ebac2.databinding.RvItemBinding

class RecyclerViewAdapter(private val list: List<ContactInfo>): RecyclerView.Adapter<RecyclerViewAdapter.ListItemViewHolder>() {

    class ListItemViewHolder(binding: RvItemBinding) : RecyclerView.ViewHolder(binding.root){
        var name: TextView = binding.itemName
        var phone: TextView = binding.itemPhone
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        return ListItemViewHolder(RvItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false))

    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        holder.name.text = list[position].name
        holder.phone.text = list[position].phone
    }

    override fun getItemCount(): Int {
        return list.size
    }

}