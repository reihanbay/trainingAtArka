package com.reihan.latihanarka1.room

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.reihan.latihanarka1.R
import com.reihan.latihanarka1.databinding.ActivityAddWordBinding
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext


class AddWordActivity : AppCompatActivity() {

    private lateinit var binding : ActivityAddWordBinding
    private lateinit var coroutineScope : CoroutineScope

    companion object{
        const val ADD_WORD_REQUESt = 9013
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_word)
        coroutineScope = CoroutineScope(Job() + Dispatchers.IO)

        val wordDao = WordRoomDatabase.getWordDatabase(this).wordDao()

        binding.btnSaveRoom.setOnClickListener{
            if(binding.etSaveRoom.text.isNotEmpty()) {
                coroutineScope.launch {
                    wordDao.insert(WordRoomEntity(binding.etSaveRoom.text.toString(), System.currentTimeMillis()))
                }
                setResult(Activity.RESULT_OK)
                finish()
            }
        }
    }

    override fun onDestroy() {
        coroutineScope.cancel()
        super.onDestroy()
    }
}