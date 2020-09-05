package com.reihan.latihanarka1.dialog

import android.app.DatePickerDialog
import android.content.DialogInterface
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.reihan.latihanarka1.R
import com.reihan.latihanarka1.databinding.ActivitySimpleDialogBinding
import com.reihan.latihanarka1.databinding.DialogAlertBinding
import kotlinx.android.synthetic.main.activity_simple_dialog.view.*

class SimpleDialogActivity: AppCompatActivity(), View.OnClickListener{

    private lateinit var binding : ActivitySimpleDialogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_simple_dialog)

        binding.btnDialog1.setOnClickListener(this)
        binding.btnDialog2.setOnClickListener(this)
        binding.btnDialog3.setOnClickListener(this)
        binding.btnDialog4.setOnClickListener(this)
        binding.btnDialog5.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_dialog_1 -> {
                showDialog1()

            }
            R.id.btn_dialog_2 -> {
                showDialog2()
            }
            R.id.btn_dialog_3 -> {
                showDialog3()
            }
            R.id.btn_dialog_4 -> {
                showDialog4()
            }
            R.id.btn_dialog_5 -> {
                showDialog5()
            }
        }
    }

    private fun showDialog1(){
        val dialog = AlertDialog.Builder(this)
            .setTitle("Test Dialog One")
            .setMessage("Ini dialog 1")
            .create()
        dialog.show()
    }

    private fun showDialog2(){
        val dialog = AlertDialog.Builder(this)
            .setTitle("Konfirmasi User")
            .setPositiveButton("Show Toast") { dialog: DialogInterface?, which: Int ->
                Toast.makeText(this, "Show Dialog", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Dismiss"){ dialogInterface, i ->
                dialogInterface.dismiss()
            }
        dialog.show()
    }
    private fun showDialog3(){
        val rootView = DataBindingUtil.inflate<DialogAlertBinding>(layoutInflater, R.layout.dialog_alert, null , false)
        val dialog = AlertDialog.Builder(this)
            .setView(rootView.root)
            .setCancelable(true)
            .create()
        dialog.show()
        rootView.btnOk.setOnClickListener { dialog.dismiss() }

    }

    private fun showDialog4(){
        try {
            val dialogFragment = supportFragmentManager.findFragmentByTag(TestDialogFragment.TAG)
            if (dialogFragment != null) {
                supportFragmentManager.beginTransaction().remove(dialogFragment).commit()
            }

            TestDialogFragment().show(supportFragmentManager, TestDialogFragment.TAG)
        } catch (e: Throwable){
            e.printStackTrace()
        }
    }

    private fun showDialog5(){
        DatePickerDialog(this, DatePickerDialog.OnDateSetListener{view,year, month, dayOfMonth->
            // action memilih tanggal

        }, 2020,8,4
        ).show()
    }
}