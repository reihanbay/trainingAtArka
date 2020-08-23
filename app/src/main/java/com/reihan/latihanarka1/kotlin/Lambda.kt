package com.reihan.latihanarka1.kotlin

var sum = {number1: Int, number2: Int ->
    number1+number2
}
fun main(){
    println("List Of Numbers")
    val listOfNumbers = listOf(10, 15, 32, 40)

    //normal loop
    for (item in listOfNumbers){
        println(item)
    }
    println()
    //lambda forEach
    listOfNumbers.forEach{numbers ->
        println(numbers)}

    println("End List number")
    val addNumber = sum(5,10)
    println("Result $addNumber")
}