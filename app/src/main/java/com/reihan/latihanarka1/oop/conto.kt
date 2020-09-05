package com.reihan.latihanarka1.oop

abstract class inherit{
    abstract fun overR()
}

class conto : inherit() {
    override fun overR() { // Ovverride mengubah isi body dari method
    }

//    overloading mengubah parameter tanpa mengubah nama methodnya
    fun dicoba (name: String){
        var rei = name
        println(rei)
    }
    fun dicoba (name: String, age: Int){
        var umur = age
        var rei = name
        println(rei)
        print(age)
    }
}

//
//object {
//    @JvmStatic
//    fun main(args: Array<String>){
//        var turunkan = conto()
//        turunkan.dicoba()
//        turunkan.name
//    }
//}