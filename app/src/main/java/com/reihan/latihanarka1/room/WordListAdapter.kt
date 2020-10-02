package com.reihan.latihanarka1.room

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.reihan.latihanarka1.R
import kotlinx.android.synthetic.main.item_word_list.view.*
import java.util.*

class WordListAdapter : RecyclerView.Adapter<WordListAdapter.WordListViewHolder>() {

    private  val items = mutableListOf<WordRoomEntity>()

    fun addItem(words : List<WordRoomEntity>) {
        items.clear()
        items.addAll(words)
        notifyDataSetChanged()
    }
    override fun onBindViewHolder(holder: WordListViewHolder, position: Int) {
        val word = items[position]
        holder.tvWordNo.text = word.id.toString()
        holder.tvWordName.text = word.name
        holder.tvCreatedWord.text = formatDate(word.createdAt)
    }

    override fun getItemCount(): Int = items.size

    private fun formatDate(date: Long) : String {
        val formatedDate : String
        val c = Calendar.getInstance()

        c.timeInMillis = date
        formatedDate = "${c.get(Calendar.DAY_OF_MONTH)} - ${c.get(Calendar.MONTH)} - ${c.get(Calendar.YEAR)} ${c.get(Calendar.HOUR_OF_DAY)}:${c.get(Calendar.MINUTE)}"
        return formatedDate
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordListViewHolder {
        return WordListViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_word_list, parent, false))
    }

    class WordListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvWordNo = itemView.findViewById<TextView>(R.id.tv_word_no)
        val tvWordName = itemView.findViewById<TextView>(R.id.tv_word_name)
        val tvCreatedWord = itemView.findViewById<TextView>(R.id.tv_word_created)
    }

}