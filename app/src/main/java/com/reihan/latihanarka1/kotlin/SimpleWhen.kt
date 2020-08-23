package com.reihan.latihanarka1.kotlin

fun main(){
    print("Pilih Menu : ")
    var foodId = readLine()!!.toInt()

    when(foodId){
        1 -> print("Ayam+Nasi+Esteh")
        2 -> print("Lele+Nasi+Teh manis")
        3 -> print("Lele+Nasi+Esteh")
        else -> print("Menu Tak tersedia")
    }
}