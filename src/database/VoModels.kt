package com.worldline.kotlin.database

import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.Table

object GeoPointVo : Table("geopoint") {
    val id = varchar("id", 10)
    val title = varchar("title", 100)
    val latitude = double("latitude")
    val longitude = double("longitude")
}

object DatabaseProvider {
    val db by lazy { Database.connect("jdbc:h2:mem:geopoint", "org.h2.Driver") }
}