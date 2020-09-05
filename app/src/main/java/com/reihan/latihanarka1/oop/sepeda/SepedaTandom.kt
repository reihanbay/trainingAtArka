package com.reihan.latihanarka1.oop.sepeda

class SepedaTandom: Sepeda() {
    var jumSaddle = 0

    fun addSaddle(jumlahSaddle : Int){
        jumSaddle = jumlahSaddle
        println("Jumlah Saddle : $jumSaddle")
    }
}