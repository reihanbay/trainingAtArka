package com.reihan.latihanarka1.oop.kucing

class kucingPersAct {
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            val printIt = kucingPers()
            printIt.berbulu()
            printIt.berkaki()
            printIt.persia("Persia")
        }
    }
}