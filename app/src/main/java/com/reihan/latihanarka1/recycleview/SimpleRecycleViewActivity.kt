package com.reihan.latihanarka1.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.reihan.latihanarka1.R
import com.reihan.latihanarka1.databinding.ActivitySimpleRecycleViewBinding
import kotlinx.android.synthetic.main.activity_simple_recycle_view.*

class SimpleRecycleViewActivity : AppCompatActivity() {

    private lateinit var  binding : ActivitySimpleRecycleViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_simple_recycle_view)

        binding.recycleView.adapter = SimpleRecycleViewAdapter()
        binding.recycleView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
    }
}