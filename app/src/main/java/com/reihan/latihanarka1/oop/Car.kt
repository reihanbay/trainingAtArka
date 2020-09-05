package com.reihan.latihanarka1.oop

class Car(var typeName: String, val model: String, var price: Double,
          var km: Int, var owner: String ) {

    init {
        println("Object Class Car is Running")
    }

    fun getCarPrice(): Double{
        return price - (km.toDouble()*10)
    }
}

fun main(){
//    val car = Car("BMW", "TP12", 22222222222222.0, 140, "reihan")
//    println(car.typeName)
//    println(car.model)
//    println(car.owner)
//    println(car.getCarPrice())
//
//    val car2 = Car("toyo", "2020", 2202102.0, 15, "rei")
//    println(car2.typeName)
//    println(car2.model)
//    println(car2.owner)

    val listOfCar = arrayListOf<Car>()
    listOfCar.add(Car("BMW", "TP12", 22222222222222.0, 140, "reihan"))
    listOfCar.add(Car("toyo", "2020", 2202102.0, 15, "rei"))

    for (car in listOfCar) {
        println("List Of Car")
        println(car.model)
        println(car.getCarPrice())
    }
}