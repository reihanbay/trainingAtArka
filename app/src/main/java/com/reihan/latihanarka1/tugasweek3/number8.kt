package com.reihan.latihanarka1.tugasweek3

fun main(){
    println("Program Rata - Rata Ujian Nasional")

    print("Masukan Nilai Matematika         : ")
    var mtk = readLine()!!.toInt()

    print("Masukan Nilai Bahas Inggris      : ")
    var bIng = readLine()!!.toInt()

    print("Masukan Nilai Bahasa Indonesia   : ")
    var bIndo = readLine()!!.toInt()

    print("Masukan Nilai IPA                : ")
    var ipa = readLine()!!.toInt()

    var rata = (mtk + bIndo + bIng + ipa) / 4

    println("Rata rata = $rata")

    if (rata <= 100){
        println("Grade A")
    } else
    if (rata <= 90){
        println("Grade B")
    } else
    if (rata <= 80){
        println("Grade C")
    } else
    if (rata <= 70){
        println("Grade D")
    } else
    if (rata <= 60){
        println("Grade E")
    }
}