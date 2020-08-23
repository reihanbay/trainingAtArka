package com.reihan.latihanarka1.tugasweek3

fun umurTahun(tahun : Int) {
    var umur = 2020 - tahun
    println("Usia anda $umur")
}
fun main(){
    print("Masukan Tahun Lahir : ")
    umurTahun(readLine()!!.toInt())
}