package com.aldyjrz.kalkulatorkotlin


class Hitung{
    var hasil: Int = 0

    fun tambah(a: Int, b: Int){
        hasil = a+b
    }

    fun kurang(a: Int, b: Int){
        hasil = a-b
    }

    fun kali(a: Int, b: Int){
        hasil = a*b
    }

    fun bagi(a: Int, b: Int){
        hasil = a/b
    }


}