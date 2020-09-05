package com.reihan.latihanarka1.oop.kucing

class kucingAnggoraAct{
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            var kucing = kucingAnggora()
            kucing.berkaki()
            kucing.bulu = "berbulu lebat"
            kucing.berbulu()
            kucing.anggora("Banyak")
        }

    }
}