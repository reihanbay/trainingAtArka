package com.reihan.latihanarka1.tugasweek3

fun divideAndSort(deret: Long){
    var bilangan = deret.toString()
    var x = bilangan.split("0")
    var arr = x.size-1
    while (arr>=0){
        var output = x[arr].map { it.toString().toLong() }.sorted().reversed()
        var longIndex= output.size -1

        while(longIndex>=0){
            print(output[longIndex])
            longIndex-=1
        }
        arr -= 1
    }
}

fun main(){
    println("Divide And Sort")
    print("Masukan Angka : ")
    divideAndSort(readLine()!!.toLong())
//    var deret = 1212120222333.toString()
//    var b = deret.split("0")
//    var n= b.size -1
//    var data : CharArray
//    var p : CharArray
//    for (n in 0..n){
//        data = b[n].toCharArray()
//        p = data.sortedArray()
//    print(p)
//    }
}