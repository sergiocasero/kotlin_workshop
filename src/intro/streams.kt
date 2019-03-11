package com.worldline.kotlin.intro

fun streams() {
    val users = mutableListOf<User>()
    val clients = users.mapIndexed { index, user -> Client(id = index, name = user.name) }
    val filteredClients = clients.filter { it.name.contains("ser") }
    val client = clients.first { it.id == 0 }
    val clientLast = clients.last { it.id == 0 }
    val clientAny = clients.any { it.id == 0 }
    val clientCouldBeNull = clients.firstOrNull { it.name.contains("Sergio") }

    clients.forEach { println(it) }

    val users2 = mutableListOf<MutableList<User>>()
    users2.add(users)

    val clients2 = users2.flatMap { it.mapIndexed { index, user -> Client(id = index, name = user.name) } }

    clients.sortedBy { it.id }
}