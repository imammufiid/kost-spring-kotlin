package com.mufid.kost.kost.controller

import com.mufid.kost.kost.entity.Kost
import com.mufid.kost.kost.service.KostService
import com.mufid.kost.response.BaseResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/kost")
class KostController {
    @Autowired
    private lateinit var kostService: KostService

    @GetMapping
    fun getKosts(): BaseResponse<List<Kost>> {
        return BaseResponse(true, "data kost", kostService.getAll())
    }

    @GetMapping("/{id}")
    fun getKostById(
        @PathVariable(value = "id") id: String
    ): BaseResponse<Kost> {
        return BaseResponse(true, "data kost by", kostService.getById(id))
    }

    @PostMapping
    fun addKost(
        @RequestBody kost: Kost
    ): BaseResponse<List<Kost>> {
        return BaseResponse(true, "add data kost", kostService.add(kost))
    }

    @GetMapping("/search")
    fun searchKost(
        @RequestParam(value = "name") name: String
    ): BaseResponse<List<Kost>> {
        return BaseResponse(true, "search data kost", kostService.search(name))
    }

    @PutMapping("/{id}")
    fun updateKost(
        @PathVariable id: String,
        @RequestBody kost: Kost
    ): BaseResponse<Kost> {
        return BaseResponse(true, "update data kost", kostService.update(id, kost))
    }

    @DeleteMapping("/{id}")
    fun deleteKost(
        @PathVariable(value = "id") id: String
    ): BaseResponse<Kost> {
        return BaseResponse(true, "delete data kost", kostService.delete(id))
    }
}