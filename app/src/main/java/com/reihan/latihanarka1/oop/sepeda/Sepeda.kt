package com.reihan.latihanarka1.oop.sepeda
/*
* Inheritance Concept
* */

open class Sepeda {
    //Deklarasi Attribut
    var gir = 0
    var kecepatan = 0

    //method
    fun ubahGir (pertambahanGir: Int){
        gir += pertambahanGir
        println("Gir : $gir")
    }

    fun tambahKec(pertambahanKec: Int){
        kecepatan += pertambahanKec
        println("kecepatan $kecepatan")
    }
}