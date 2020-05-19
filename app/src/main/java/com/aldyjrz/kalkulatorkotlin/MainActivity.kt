package com.aldyjrz.kalkulatorkotlin

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun init(){
        btn_0.setOnClickListener(this)
        btn_1.setOnClickListener(this)
        btn_2.setOnClickListener(this)
        btn_3.setOnClickListener(this)
        btn_4.setOnClickListener(this)
        btn_5.setOnClickListener(this)
        btn_6.setOnClickListener(this)
        btn_7.setOnClickListener(this)
        btn_8.setOnClickListener(this)
        btn_9.setOnClickListener(this)
        btn_00.setOnClickListener(this)
        btn_000.setOnClickListener(this)
        btn_tambah.setOnClickListener(this)
        btn_kurang.setOnClickListener(this)
        btn_x.setOnClickListener(this)
        btn_bagi.setOnClickListener(this)
        btn_ac.setOnClickListener(this)

    }

    @SuppressLint("SetTextI18n")
    override fun onClick(p0: View?) {
        val a = tv_hasil.text.toString()
        //njir kebanyakan kalo 1-1
        when(p0!!.id){
            R.id.btn_0 -> tv_hasil.setText("$a 0")
            R.id.btn_1 -> tv_hasil.setText("$a 1")
            R.id.btn_2 -> tv_hasil.setText("$a 2")
            R.id.btn_3 -> tv_hasil.setText("$a 3")
            R.id.btn_4 -> tv_hasil.setText("$a 4")
            R.id.btn_5 -> tv_hasil.setText("$a 5")
            R.id.btn_6 -> tv_hasil.setText("$a 6")
            R.id.btn_7 -> tv_hasil.setText("$a 7")
            R.id.btn_8 -> tv_hasil.setText("$a 8")
            R.id.btn_8 -> tv_hasil.setText("$a 8")
            R.id.btn_00 -> tv_hasil.setText("$a 00")
            R.id.btn_000 -> tv_hasil.setText("$a 000")
            R.id.btn_tambah -> tv_hasil.setText("$a +")

            R.id.btn_kurang -> tv_hasil.setText("$a 000")
            R.id.btn_x -> tv_hasil.setText("$a 000")
            R.id.btn_bagi -> tv_hasil.setText("$a 000")


        }
    }

}
