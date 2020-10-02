package com.reihan.latihanarka1.kotlin

fun main() {
    val count : Int
    val price : Int
    println("Masukan Total Makanan : ")
    count = readLine()!!.toInt()
    println("Masukan Harga Makanan : ")
    price = readLine()!!.toInt()
    print(arkFood(count, price))
}
fun arkFood(count: Int, price: Int) {
    var discount = 0.35
    var maksDiscount = 50000
    var priceFix = 0
    var total = count * price
    if (total > 60000) {
        priceFix = (total * discount).toInt()
        println("Total Harga = ${total}")
        if (priceFix>maksDiscount){
            total = total - maksDiscount
            println("Potongan = ${maksDiscount}")
            println("Sub Total = ${total}")
        } else {
            total = total - priceFix
            println("Potongan = ${priceFix}")
            println("Sub Total = ${total}")
        }
    } else {
        println("Total Harga = ${total}")
        println("Potongan = ${priceFix}")
        println("Sub Total = ${total}")
    }
}
