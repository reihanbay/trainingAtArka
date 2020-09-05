package com.reihan.latihanarka1.toolbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.reihan.latihanarka1.R
import com.reihan.latihanarka1.activity_two
import com.reihan.latihanarka1.databinding.SimpleDataBindingActivity
import com.reihan.latihanarka1.dialog.SimpleDialogActivity
import com.reihan.latihanarka1.fragment.SimpleFragmentActivity
import com.reihan.latihanarka1.recycleview.SimpleRecycleViewActivity
import com.reihan.latihanarka1.sharedpref.LearnSharedPrefActivity
import com.reihan.latihanarka1.tabpager.SimpleTabPagerActivity
import com.reihan.latihanarka1.webview.SimpleWebViewActivity

class SimpleToolbarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_toolbar)

        //SharedPref in other activity
        val defaultSharedPref = androidx.preference.PreferenceManager.getDefaultSharedPreferences(this)
        val txtContent = findViewById<TextView>(R.id.tv_content_toolbar)
        txtContent.text = defaultSharedPref.getString(LearnSharedPrefActivity.KEY_EMAIL, "ContentToolbar")


        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true) // mengaktifkan icon back
        toolbar.setNavigationOnClickListener { onBackPressed() } // mengaktifkan intent back/kembali

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater?.inflate(R.menu.menu_main, menu) //konfigurasi menu
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean { //memberi perintah pada option ketika terselect
        when (item.itemId) {
            R.id.action_to_show_toast -> {
                Toast.makeText(this, " Menu Toast ", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.action_to_second_activity -> {
                val intent = Intent(this, SimpleFragmentActivity::class.java)
                startActivity(intent)
                return true
            }

            R.id.action_to_data_binding -> {
                val intent = Intent(this, SimpleDataBindingActivity::class.java)
                startActivity(intent)
                return true
            }

            R.id.action_to_dialog-> {
                val intent = Intent(this, SimpleDialogActivity::class.java)
                startActivity(intent)
                return true
            }
            R.id.action_to_tabpager-> {
                val intent = Intent(this, SimpleTabPagerActivity::class.java)
                startActivity(intent)
                return true
            }
            R.id.action_to_webview-> {
                val intent = Intent(this, SimpleWebViewActivity::class.java)
                startActivity(intent)
                return true
            }

            R.id.action_to_recycle-> {
                val intent = Intent(this, SimpleRecycleViewActivity::class.java)
                startActivity(intent)
                return true
            }

            R.id.action_to_shared-> {
                val intent = Intent(this, LearnSharedPrefActivity::class.java)
                startActivity(intent)
                return true
            }
        }

        return super.onOptionsItemSelected(item)
    }
}