package com.reihan.latihanarka1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class activity_one : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

        val tvDomain = findViewById<TextView>(R.id.tv_domainName)
        val domainName= intent.getStringExtra("domainName")

        tvDomain.text = domainName
        Log.d("domainString", domainName)
    }
}