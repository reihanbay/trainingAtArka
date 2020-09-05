package com.reihan.latihanarka1.oop.encapsulation

/**
 * Encapsulation Concept
 * */

class Cat {
    var mood: Int = 0 //modifier open bisa diakses manapun
    protected var hungry : Int = 0 //modifier protected bisa diakses di class child
    internal var energy : Int = 0 //bisa di akses class, subclass, atau package
    private fun meow(){ // hanya bisa diakses class asalnya
        println("Meow")
    }

    fun sleep(){
        hungry++
        energy++
        status()
    }

    fun play(){
        mood++
        energy--
        status()
    }

    fun feed(){
        hungry--
        mood++
        energy++
        meow()
        status()
    }

    private fun status(){
        println("Mood : $mood")
        println("Hungry : $hungry")
        println("Energy : $energy")
    }
}

fun main(){
    val playCat = Cat()
    playCat.feed()
}