package com.reihan.latihanarka1.oop.sepeda

class SepedaTandomAksi {
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            //Membuat Objek
            var sepedaTandomKu = SepedaTandom()

            sepedaTandomKu.ubahGir(8)
            sepedaTandomKu.tambahKec(80)
            sepedaTandomKu.addSaddle(3)
        }
    }
}