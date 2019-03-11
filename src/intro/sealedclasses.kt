package com.worldline.kotlin.intro

fun sealedclasses() {
    val result: Result = Result.Success.Created(0)
    // val result: Result = Result.Success.Ok

    /* val message = when(result) {
         Result.Success.Ok -> "Ok"
         Result.Error.NotFound -> "Not found"
         is Result.Error.ServerError -> result.message
         is Result.Success.Created -> result.id.toString()
     }*/
}

sealed class Result {
    sealed class Success : Result() {
        object Ok : Success()
        class Created(val id: Int) : Success()
    }

    sealed class Error : Result() {
        object NotFound : Error()
        class ServerError(val message: String) : Error()
    }
}