package com.worldline.kotlin.intro

fun interfaces() {
    val network: Network = WorkshopNetwork()
    println(network.getUsers())
    println(network.getUsers2())
}

interface Network {
    fun getUsers(): List<User>
    fun getUsers2() = getUsers()
}

class WorkshopNetwork : Network {
    override fun getUsers(): List<User> = listOf(User(name = "Sergio", surname = "Casero"))
}