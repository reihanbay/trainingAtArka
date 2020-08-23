package com.reihan.latihanarka1.kotlin

fun main() {
    println("Simple Calculator")

    print("Masukan angka ke 1 : ")
    val num1 = readLine()!!.toInt()
    print("Masukan angka ke 2 : ")
    val num2 = readLine()!!.toInt()

    var tambah = num1 + num2
    println("Tambah : $tambah")

    var kurang = num1 - num2
    println("Kurang : $kurang")

    var kali = num1 * num2
    println("Kali : $kali")

    var bagi = num1 / num2
    println("Bagi : $bagi")
}