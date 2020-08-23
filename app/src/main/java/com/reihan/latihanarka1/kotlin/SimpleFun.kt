package com.reihan.latihanarka1.kotlin

fun addNumber(x:Double= 0.0, y:Double= 0.0): Double{
    return x+y
}
fun main(){
    println("Start function")

    var returnAdd = addNumber(2.0, 4.0)
    println("return add : $returnAdd")
}