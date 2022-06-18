package com.mufid.kost.kost.entity

import org.bson.codecs.pojo.annotations.BsonId
import org.litote.kmongo.Id
import org.litote.kmongo.newId

data class Kost(
    @BsonId
    var _id: Id<Kost> = newId(),
    var name: String? = "",
    var address: String? = "",
    var type: Int? = 0
)
