package com.mufid.kost.kost.repository

import com.mufid.kost.kost.entity.Kost

interface KostRepository {
    fun getAll(): List<Kost>
    fun getById(id: Int?): Kost?
    fun search(name: String): List<Kost>
    fun add(kost: Kost): List<Kost>
    fun update(kost: Kost): Kost?
    fun delete(id: Int): Kost?
}