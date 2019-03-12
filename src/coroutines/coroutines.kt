package com.worldline.kotlin.coroutines

import com.worldline.kotlin.intro.Client
import com.worldline.kotlin.intro.User
import io.ktor.client.HttpClient
import io.ktor.client.engine.apache.Apache
import io.ktor.client.request.get
import kotlinx.coroutines.*

fun main() {
    val job = SupervisorJob()
    val scope = CoroutineScope(job + Dispatchers.Main)

    scope.launch {
        // val clients = getClientsAsync()
    }
}

// private suspend fun getClientsAsync(): Deferred<List<Client>> {
//     val client = HttpClient(Apache)
//
//     return withContext(Dispatchers.IO) {
//         client.get<Client> {  }
//     }
// }