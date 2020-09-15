package com.reihan.latihanarka1.sharedpref

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import androidx.databinding.DataBindingUtil
import com.reihan.latihanarka1.R
import com.reihan.latihanarka1.databinding.ActivityLearnSharedPrefBinding

class LearnSharedPrefActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLearnSharedPrefBinding

    companion object {
        const val SHARED_PREFERENCES_NAME = "Learn Shared Pref"
        const val KEY_EMAIL = "KEY_EMAIL"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_learn_shared_pref)

        val sharedPref = applicationContext.getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)
        val defaultSharedPref = androidx.preference.PreferenceManager.getDefaultSharedPreferences(this)

        binding.btnUpdateEmail.setOnClickListener {
            defaultSharedPref.edit().putString(KEY_EMAIL, "rei@gmail.com").apply()

        binding.tvEmail.text = defaultSharedPref.getString(KEY_EMAIL, ".../")
        }
    }
}