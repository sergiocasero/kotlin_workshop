package com.worldline.kotlin.intro

fun dataclasses() {
    val user = User("Sergio", "Casero")
    val user2 = user.copy(name = "Daniel")

    println(user)
    println(user2)
}

// public by default
data class User(val name: String, val surname: String)