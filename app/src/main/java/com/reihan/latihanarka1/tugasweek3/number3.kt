package com.reihan.latihanarka1.tugasweek3

fun main(){
    print("Masukan Nomor : ")
    var inputNumber = readLine()!!.toInt()

    if (inputNumber % 2 == 0){
        println("The Number is Even") //genap
    }else {
        println("The Number is Odd") //ganjil
    }
}