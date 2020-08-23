package com.reihan.latihanarka1.tugasweek3

fun luasSegitiga(a: Int, t: Int) {
    var luas = a * t / 2
    println("hasil : $luas")
}

fun main(){
    println("Pemrograman Luas Segitiga")
    print("Masukan Alas : ")
    var a = readLine()!!.toInt()
    print("Masukan Tinggi : ")
    var t = readLine()!!.toInt()

    luasSegitiga(a , t)
}