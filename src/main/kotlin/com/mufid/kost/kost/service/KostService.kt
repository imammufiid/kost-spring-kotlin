package com.mufid.kost.kost.service

import com.mufid.kost.kost.entity.Kost

interface KostService {
    fun getAll(): List<Kost>
    fun getById(id: String?): Kost?
    fun search(name: String): List<Kost>
    fun add(kost: Kost): List<Kost>
    fun update(id: String?, kost: Kost): Kost?
    fun delete(id: String?): Kost?
}