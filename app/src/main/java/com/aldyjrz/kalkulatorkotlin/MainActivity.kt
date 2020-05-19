package com.aldyjrz.kalkulatorkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.aldyjrz.kalkulatorkotlin.presenter.HitungPresenter
import com.aldyjrz.kalkulatorkotlin.view.HitungView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , HitungView {

    lateinit var presenter : HitungPresenter

    override fun hitung(data: String) {

        hasil.text = data
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initPresenter()
        initView()
    }

    private fun initPresenter() {
        presenter = HitungPresenter(this
        )
    }

    private fun  initView() {

        btntambah.setOnClickListener{
            presenter.perhitungantambah(edtBil1.text.toString(),edtBil2.text.toString())
        }

        btnkurang.setOnClickListener {
            presenter.perhitungankurang(edtBil1.text.toString(), edtBil2.text.toString())
        }

        btnkali.setOnClickListener{
            presenter.perhitungankali(edtBil1.text.toString(), edtBil2.text.toString())
        }

    }
}