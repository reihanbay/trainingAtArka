package com.reihan.latihanarka1.oop.pegawai

open class Karyawan {
    var nama : String? = null
    var nip : Int = 0
    var alamat : String? = null

    fun addKaryawan(nama: String, nip: Int, alamat: String){
        this.nama = nama
        this.nip = nip
        this.alamat = alamat
    }

    open fun printKaryawan(){
        println("Nama : $nama")
        println("Nip : $nip")
        println("Alamat : $alamat")
    }
}
