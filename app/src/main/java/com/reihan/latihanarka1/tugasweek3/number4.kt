package com.reihan.latihanarka1.tugasweek3

fun checkAge(year : Int) {
    var age = 2020 - year
    println("Usia anda $age")
}
fun main(){
    print("Masukan Tahun Lahir : ")
    checkAge(readLine()!!.toInt())
}