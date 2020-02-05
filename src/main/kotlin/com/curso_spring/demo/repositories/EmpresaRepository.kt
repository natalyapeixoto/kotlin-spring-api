package com.curso_spring.demo.repositories

import com.curso_spring.demo.documents.Empresa
import org.springframework.data.mongodb.repository.MongoRepository

interface EmpresaRepository : MongoRepository<Empresa, String> {
    fun findBycnpj(cnpf: String) : Empresa
}