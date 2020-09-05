package com.reihan.latihanarka1.oop.sepeda

class SepedaGunungAksi {
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            //Membuat Objek
            val sepedaku = SepedaGunung()

            sepedaku.ubahGir(6)
            sepedaku.tambahKec(20)
            sepedaku.setSaddle(4)
        }
    }
}