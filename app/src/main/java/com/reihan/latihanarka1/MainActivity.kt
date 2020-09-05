package com.reihan.latihanarka1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.reihan.latihanarka1.drawer.SimpleDrawerActivity
import com.reihan.latihanarka1.toolbar.SimpleToolbarActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnActivityA = findViewById<Button>(R.id.activity_A)
        val btnActivityB = findViewById<Button>(R.id.activity_B)
        val btnActFl= findViewById<Button>(R.id.activity_FL)
        val btnActLl= findViewById<Button>(R.id.activity_LL)
        val btnActRl= findViewById<Button>(R.id.activity_RL)
        val btnActCl= findViewById<Button>(R.id.activity_CL)
        val btnActTool= findViewById<Button>(R.id.activity_toolbar)



        btnActivityA.setOnClickListener{
            val intentA = Intent(this, SimpleDrawerActivity::class.java)
            intentA.putExtra("domainName","arkademy.com")
            startActivity(intentA)
        }

        btnActivityB.setOnClickListener{
            val intentB = Intent(this, activity_two::class.java)
//            intentB.putExtra("d")
            startActivity(intentB)
        }

        btnActFl.setOnClickListener{
            val intentFl = Intent(this, FrameLayoutActivity::class.java)
            startActivity(intentFl)
        }

        btnActLl.setOnClickListener{
            val intentLl = Intent(this, LinearLayoutActivity::class.java)
            startActivity(intentLl)
        }
        btnActRl.setOnClickListener{
            val intentRl = Intent(this, RelativeLayoutActivity::class.java)
            startActivity(intentRl)
        }
        btnActCl.setOnClickListener{
            val intentCl = Intent(this, ConstraintLayoutActivity::class.java)
            startActivity(intentCl)
        }
        btnActTool.setOnClickListener{
            val intentTool = Intent(this, SimpleToolbarActivity::class.java)
            startActivity(intentTool)
        }
    }
}