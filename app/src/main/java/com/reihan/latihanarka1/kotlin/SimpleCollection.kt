package com.reihan.latihanarka1.kotlin

fun main(){
    println("Collection")
    println("Immutable")
    val listImmutable = listOf("Anggur","Pepaya")
//    listImmutable[0] = "Sirsak" ---->karena Immutable
    for ( fruit in listImmutable){
        println(fruit)
    }

    println("\nMutable")

    var listMutable = mutableListOf("Nasi", "Goreng", "Ayam")
    listMutable[2] = "Kambing"
    for (food in listMutable){
        println(food)
    }
}