package com.reihan.latihanarka1.kotlin

fun main(){
    val a = 55
    val b = 22

    if (a > b) {
        print("Sum ${a+b}")
    }

    print("Input your grade : ")
    var grade = readLine()!!.toInt()

    if (grade >= a){
        println("A")
    } else {
        print("gagal")
    }
}