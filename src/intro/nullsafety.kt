package com.worldline.kotlin.intro

fun nullsafety() {
    val client = Client(id = 0, name = "Sergio")
    val client2: Client? = Client(id = 0, name = "Sergio")

    if (client == null) {
        println("is null")
    }
    if (client2 != null) {
        println("is not null")
    }

    client.calculatePrice()
    // client2.calculatePrice()

    // if (client2 != null) {
    //     client2.calculatePrice()
    // }
    // if (client2 is Client) {
    //     client2.calculatePrice()
    // }
    // client2?.calculatePrice()
    // client2!!.calculatePrice()
}

data class Client(val id: Int, val name: String) {
    fun calculatePrice(): Double = 3242342.0
}