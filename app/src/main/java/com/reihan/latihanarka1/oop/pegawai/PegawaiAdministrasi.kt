package com.reihan.latihanarka1.oop.pegawai

class PegawaiAdministrasi : Pegawai(){
    var tempatKerja: String? = null

    fun addPegawaiAdministrasi(nama: String?, nip: Int, alamat: String?, tempatKerja: String){
        super.addPegawai(nama, nip, alamat)
        this.tempatKerja = tempatKerja
    }

    fun getTempatBekerja(): String? {
        return this.tempatKerja
    }

//    override method printpeg -> dpt merubah method parent/ methodnya sama tapi bisa dirubah isinya
    override fun printPeg(){
        super.printPeg() //super mengacu pada class parent
        println("Tempat Bekerja : ${this.getTempatBekerja()}")
    }



    //Overload -> nama function methodnya sama tapi parameternya beda/bisa berubah sesuai kbutuhan
    fun cetakInfo(){
        this.printPeg()
    }

    fun cetakInfo(keterangan: String){
        this.printPeg()
        println("Keterangan : $keterangan")
    }

    fun cetakInfo(keterangan: String, Jabatan: String){
        this.printPeg()
        println("Keterangan : $keterangan")
        println("Jabatan : $Jabatan")
    }
}

fun main() {
    val pegawai = PegawaiAdministrasi()

    pegawai.addPegawaiAdministrasi("Wahyu Kurniawan", 221231, "Jakarta", "A01")
    pegawai.cetakInfo("PNS", "ketua")
    pegawai.cetakInfo()
}