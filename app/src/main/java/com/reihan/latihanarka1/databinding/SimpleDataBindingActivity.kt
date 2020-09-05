package com.reihan.latihanarka1.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.reihan.latihanarka1.R

class SimpleDataBindingActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySimpleDataBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_simple_data_binding)

//        binding.tvName.text = "Reihan Bayzaky"
//        binding.tvEmail.text = "rei@gmail.com"
//        binding.tvAddress.text = "Berkoh"

        binding.model = ArkademyModel("Rei", " rei@gmail.com ", "Jkt")

        binding.btnChange.setOnClickListener {
            binding.model = ArkademyModel("Reihan", "@gmail.com", "berkoh")
        }
    }
}