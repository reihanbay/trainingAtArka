package com.reihan.latihanarka1.room

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.reihan.latihanarka1.R
import com.reihan.latihanarka1.databinding.ActivityWordListBinding
import kotlinx.coroutines.*

class WordListActivity : AppCompatActivity() {

    private lateinit var binding : ActivityWordListBinding
    private lateinit var coroutineScope: CoroutineScope

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_word_list)
        coroutineScope = CoroutineScope(Job() + Dispatchers.IO)

        binding.rvWords.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        binding.rvWords.adapter = WordListAdapter()

        binding.btnAddWord.setOnClickListener {
            val intent = Intent(this, AddWordActivity::class.java)
            startActivityForResult(intent, AddWordActivity.ADD_WORD_REQUESt)

        }
        populatedList()
    }

    private fun populatedList() {
        coroutineScope.launch {
            val wordDao = WordRoomDatabase.getWordDatabase(this@WordListActivity).wordDao()
            val list = wordDao.getAllWord()
            withContext(Dispatchers.Main) {
                (binding.rvWords.adapter as WordListAdapter).addItem(list)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && requestCode == AddWordActivity.ADD_WORD_REQUESt) {
            populatedList()
        }
    }
    override fun onDestroy() {
        coroutineScope.cancel()
        super.onDestroy()
    }
}