package com.reihan.latihanarka1.tugasweek3

fun main(){
    print("Masukan Text : ")
    var text = readLine()!!
    var spl = text.split(" ")
    var index = spl.size-1
    var tampung = ""
    while (index>=0){
        tampung += spl[index]+" "
        index -= 1
    }
    print(tampung)
}