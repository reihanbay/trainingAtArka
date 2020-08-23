package com.reihan.latihanarka1.kotlin

fun main(){
    //Print
    println("Rei")

    //Variabel
    val name = "Reihan Bay"
    val age = 18
    val domain = "reihan.com"

    println("Nama ku $name, umurku $age, domainku $domain")

    var nilai = 4.0
    nilai = 3.4
    println("Nilaiku = $nilai")

//    var city : String = 1      error
    var city : String = 1.toString()
    var no : String = "1"


    //Komentar 1 barus
    /*Multiline comment
    Camel CAse = akuDisini
    Snack CAse = aku_disini
    Pascal case = AkuDisini
    */

    var tinggiBadan : Int = 10
    var beratBadan : Int? = null

//    print("Beratbadan : ${beratBadan!!.toDouble()}")
    print("Beratbadan : ${beratBadan?.toDouble() ?: "100"}") //elvis operator

}