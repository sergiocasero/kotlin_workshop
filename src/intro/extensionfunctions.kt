package com.worldline.kotlin.intro

import java.util.*

fun extensionfunctions() {
    val date1 = 141423424234
    println(date1.toDate())

    date1.logi("hello!!")
}

private fun Long.toDate(): Date = Date(this)

fun Any.logi(message: String) {
    println("${this::class.java} :$message")
}