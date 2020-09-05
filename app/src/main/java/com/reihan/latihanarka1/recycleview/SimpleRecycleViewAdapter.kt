package com.reihan.latihanarka1.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.reihan.latihanarka1.R

class SimpleRecycleViewAdapter : RecyclerView.Adapter<SimpleRecycleViewAdapter.fruitViewHolder>() {

    val listFruit = listOf("Pisang", "Apel", "Jambu", "mangga", "Durian")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): fruitViewHolder {
        return fruitViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_recycle_view, parent, false))
    }

    override fun getItemCount(): Int = listFruit.size

    override fun onBindViewHolder(holder: fruitViewHolder, position: Int) {
        holder.tvName.text = listFruit[position]
        holder.tvPosition.text = (position + 1).toString()
    }

    class fruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var tvName = itemView.findViewById<TextView>(R.id.tv_name_item)
        var tvPosition = itemView.findViewById<TextView>(R.id.tv_position)
    }


}