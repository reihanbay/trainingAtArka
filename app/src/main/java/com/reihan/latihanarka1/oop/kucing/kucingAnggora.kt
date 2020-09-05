package com.reihan.latihanarka1.oop.kucing

class kucingAnggora: kucing() {
    var bulunya = "banyak banget"

    fun anggora(bulu: String){
        bulunya = bulu
        println("kucing anggora berbulu $bulu")
    }
}