package com.worldline.kotlin.intro

fun delegatedproperties() {
    val user by lazy { User(name = "Sergio", surname = "Casero") }

    println(user)
}