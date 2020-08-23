package com.reihan.latihanarka1.tugasweek3

fun vokalKonsonan(text:String){
    var x = text.length-1
    var collectVokal = listOf<String>()
    var collectKonsonan = listOf<String>()
    while (x>=0){
        var b = text[x].toString()
        if (b == "A" || b == "a" || b == "I" || b == "i" || b == "U" || b == "u" || b == "E" || b == "e" || b == "O" || b == "o"){
            collectVokal += b
        } else {
            collectKonsonan +=b
        }
        x= x-1
    }
    val collect = collectKonsonan+collectVokal
    var index = collect.size-1
    while (index >= 0){
        println(collect[index])
        index = index-1
    }
}

fun main(){
    print("Masukan Text : ")
    vokalKonsonan(readLine()!!)

}