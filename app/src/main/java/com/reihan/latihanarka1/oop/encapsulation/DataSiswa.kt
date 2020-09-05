package com.reihan.latihanarka1.oop.encapsulation

class DataSiswa{
    var nama: String? =null
    var nis : Int = 0
    var kelas : String? = null

    private var nilaiku: Int = 0

    fun setNilai(nilai: Int){
        nilaiku = nilai
    }

    fun getNilai():Int {
        return nilaiku
    }
}

fun main(){
    val biodata = DataSiswa()
    biodata.nama = "Reihan Bay"
    biodata.nis = 2224242
    biodata.kelas = "9E"
    biodata.setNilai(100)

    println("Nama   : ${biodata.nama}")
    println("NIS    : ${biodata.nis}")
    println("Kelas  : ${biodata.kelas}")
    println("Nilai  : ${biodata.getNilai()}")
}