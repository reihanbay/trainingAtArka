package com.reihan.latihanarka1.tugasweek3

fun main(){
    fun printSegitiga(num: Int){
        for (num in num downTo 1){
            println()
            for (num in 1..num){
                print(num)
            }
        }
        println()
    }
    printSegitiga(5)

    var b = 5
    for ( b in 1..5){
        println()
        for ( b in 1..b){
            print(b)
        }
    }


}