package com.worldline.kotlin.intro

fun singleton() {
    println(Utils.user)
    Utils.user = User(name = "Daniel", surname = "Llanos")
    println(Utils.user)
}

object Utils {
    var user: User = User(name = "Sergio", surname = "Casero")
}

