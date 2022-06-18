package com.mufid.kost.kost.service

import com.mufid.kost.kost.entity.Kost
import com.mufid.kost.kost.repository.KostRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class KostServiceImpl : KostService {

    @Autowired
    private lateinit var kostRepository: KostRepository

    override fun getAll(): List<Kost> {
        return kostRepository.getAll()
    }

    override fun getById(id: String?): Kost? {
        return kostRepository.getById(id)
    }

    override fun search(name: String): List<Kost> {
        return kostRepository.search(name)
    }

    override fun add(kost: Kost): List<Kost> {
        return kostRepository.add(kost)
    }

    override fun update(id: String?, kost: Kost): Kost? {
        return kostRepository.update(id, kost)
    }

    override fun delete(id: String?): Kost? {
        return kostRepository.delete(id)
    }
}