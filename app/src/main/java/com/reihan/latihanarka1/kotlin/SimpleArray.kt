package com.reihan.latihanarka1.kotlin

fun main(){
    println("Pets App")
    print("Enter Number Pets: ")
    val maxSize = readLine()!!.toInt()

    var listOfPet : Array<String> = Array(maxSize){""}
    for (i in 0 until maxSize){
        print("Enter Pet name :")
        listOfPet[i] = readLine()!!.toString()
    }

    for (i in 0 until maxSize){
        println("Pet $i : ${listOfPet[i]}")
    }
}