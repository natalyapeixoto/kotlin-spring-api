package com.curso_spring.demo.repositories

import com.curso_spring.demo.documents.Lancamento
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Page

interface LancamentoRepository : MongoRepository<Lancamento, String> {

    fun findByFuncionarioId(funcionarioId: String, pageable: Pageable) : Page<Lancamento>

}