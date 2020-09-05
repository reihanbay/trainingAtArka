package com.reihan.latihanarka1.oop.encapsulation

class Calc{
    private var a = 0.0
    private var b = 0.0

    fun setA(a: Int){
        this.a = a.toDouble()
    }

    fun getA(): Double{
        return a
    }

    fun setB(b: Int){
        this.b = b.toDouble()
    }

    fun getB(): Double{
        return b
    }

    fun hasilKali(): Double {
        return getA() * getB()
    }

    fun hasilBagi(): Double{
        return getA() / getB()
    }

}

fun main(){
    val calc = Calc()

    print("Masukan Nilai A : ")
    calc.setA(readLine()!!.toInt())

    print("Masukan Nilai B : ")
    calc.setB(readLine()!!.toInt())

    println("hasil kali : ${calc.hasilKali()}")
    println("hasil bagi: ${calc.hasilBagi()}")
}