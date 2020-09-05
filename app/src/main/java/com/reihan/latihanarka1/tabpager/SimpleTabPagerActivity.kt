package com.reihan.latihanarka1.tabpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.reihan.latihanarka1.R
import com.reihan.latihanarka1.databinding.ActivitySimpleTabPagerBinding

class SimpleTabPagerActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySimpleTabPagerBinding
    private lateinit var  pagerAdapter: SimpleTabPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this, R.layout.activity_simple_tab_pager)

        pagerAdapter = SimpleTabPagerAdapter(supportFragmentManager)
        binding.viewPager.adapter =  pagerAdapter

        binding.tabLayout.setupWithViewPager(binding.viewPager)

    }
}