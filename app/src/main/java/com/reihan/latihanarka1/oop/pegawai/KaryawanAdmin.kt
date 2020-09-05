package com.reihan.latihanarka1.oop.pegawai

class KaryawanAdmin: Karyawan(){
    var tempatKerja: String? = null

    fun addKaryawanAdmin(nama:String,nip:Int,alamat:String,tempat:String){
        super.addKaryawan(nama, nip, alamat)
        this.tempatKerja = tempat
    }

    fun getTempatBekerja(): String? {
        return this.tempatKerja
    }

    //override merubah/menambahkan isi
    override fun printKaryawan() {
        super.printKaryawan()
        println("Tempat Kerja : ${getTempatBekerja()}")
    }


//    overload
    fun cetakInfo(){
        this.printKaryawan()
    }

    fun cetakInfo(ket: String){
        this.printKaryawan()
        println("Keterangan : $ket")
    }
    fun cetakInfo(NoHP:Int){
        this.printKaryawan()
        println("No Hp : $NoHP")

    }

}

fun main(){
    val printIt = KaryawanAdmin()
    printIt.addKaryawanAdmin("reihan",212212,"Berkoh", "A11")
    println("-------------------")
    printIt.cetakInfo()
    println("-------------------")
    printIt.cetakInfo(2123123123)
    println("-------------------")
    printIt.cetakInfo("Jombs")

}