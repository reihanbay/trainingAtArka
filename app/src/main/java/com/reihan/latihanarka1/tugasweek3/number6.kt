package com.reihan.latihanarka1.tugasweek3

fun luasLingkaran(r: Int){
    var luas: Int

    if (r % 7 == 0){
        luas = r * r * 22 / 7
        println("Hasil Luas Lingkaran adalah $luas")
    } else {
        luas = 3.14.toInt() * r * r
        println("Hasil Luas Lingkaran adalah $luas")
    }
}

fun main(){
    print("Masukan Jari jari lingkaran : ")
    luasLingkaran(readLine()!!.toInt())
}