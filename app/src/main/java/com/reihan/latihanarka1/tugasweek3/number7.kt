package com.reihan.latihanarka1.tugasweek3

fun tahunKabisat(tahun:Int){
    if (tahun % 400 == 0 || tahun % 100 != 0 || tahun % 4 == 0){
        println("Merupakan Tahun Kabisat")
    } else {
        println("Bukan Merupakan Tahun Kabisat")
    }
}
fun main(){
    println("Perhitungan Tahun Kabisat")
    print("Masukan Tahun : ")
    tahunKabisat(readLine()!!.toInt())
}