package com.mufid.kost.database

import com.mongodb.client.MongoClient
import org.litote.kmongo.KMongo
import org.springframework.stereotype.Component

@Component
class DatabaseComponent {
    companion object {
        const val DB_URL = "mongodb+srv://imam:12345@cluster0.na9rg.mongodb.net/?retryWrites=true&w=majority"
    }

    val database: MongoClient = KMongo.createClient(DB_URL)
}