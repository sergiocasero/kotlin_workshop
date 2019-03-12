package com.worldline.kotlin.coroutines

import io.ktor.client.HttpClient
import io.ktor.client.features.json.GsonSerializer
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.request.get
import io.ktor.client.request.url
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.runBlocking

fun main() {
    val job = SupervisorJob()
    val scope = CoroutineScope(job)

    runBlocking {
        val geoPoints = getGeoPointsAsync().list
        println(geoPoints)
    }
}

private suspend fun getGeoPointsAsync(): GeoPointsResponse {
    val client = HttpClient {
        install(JsonFeature) {
            serializer = GsonSerializer()
        }
    }
    return client.get { url("http://t21services.herokuapp.com/points") }
}

data class GeoPointsResponse(
    val list: List<GeoPoint>
)

data class GeoPoint(
    val geocoordinates: String,
    val id: String,
    val title: String
)