package com.reihan.latihanarka1.tugasweek3

fun main(){
    print("Masukan Text :")
    var text = readLine()!!
    var x = text.length-1
    var tampung : String = ""
    while (x>=0){
        tampung += text[x]
        x = x - 1
    }
    if (tampung == text){
        print("$tampung adalah palindrom")
    }else{
        print("$tampung bukan palindrom")
    }
}