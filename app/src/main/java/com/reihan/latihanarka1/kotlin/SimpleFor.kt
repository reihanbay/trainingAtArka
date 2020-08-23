package com.reihan.latihanarka1.kotlin

fun main(){
    println("Increament")

    for (i in 0..10){
        if (i == 9){
            break
        }
        println("Angka $i")
    }

    println("Decreament")
    for (a in 10 downTo 1 step 2){
        if(a == 6){
            continue
        }
        println("Angka $a")
    }
}