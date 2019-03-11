package com.worldline.kotlin.intro

fun types() {

    // Inference
    val car: Vehicle = Vehicle.Car

    if (car is Vehicle.Car) {
        car.carFunction()
    }

    // Type declaration
    val third = 0
    val fourth: Int = 0
}

sealed class Vehicle {
    object Car : Vehicle() {
        fun carFunction() = "I am car"
    }

    object Bike : Vehicle() {
        fun bikeFunction() = "I'm bike"
    }
}