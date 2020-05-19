package com.aldyjrz.kalkulatorkotlin.presenter

import com.aldyjrz.kalkulatorkotlin.view.HitungView


class HitungPresenter(mainView: HitungView) : KalkulatorPresenterImp {

    var mainView : HitungView? = mainView

    override fun perhitungantambah(nilai1: String, nilai2: String) {

        var hasil= nilai1.toDouble() + nilai2.toDouble()

        mainView?.hitung(hasil.toString())

    }

    override fun perhitungankurang(nilai1: String, nilai2: String) {

        var hasil= nilai1.toDouble() - nilai2.toDouble()

        mainView?.hitung(hasil.toString())

    }

    override fun perhitungankali(nilai1: String, nilai2: String) {

        var hasil= nilai1.toDouble() * nilai2.toDouble()

        mainView?.hitung(hasil.toString())
    }
}