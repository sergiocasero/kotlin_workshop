package com.worldline.kotlin.intro

fun lambdas() {
    println(sumNumbers(1, 1))

    sumNumbers(number1 = 1, number2 = 2, result = { result -> println(result) })
}

fun sumNumbers(number1: Int, number2: Int) = number1 + number2

fun sumNumbers(number1: Int, number2: Int, result: (Int) -> Unit) {
    result(number1 + number2)
}