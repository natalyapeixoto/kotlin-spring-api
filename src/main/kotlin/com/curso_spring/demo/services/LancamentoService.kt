package com.curso_spring.demo.services


import com.curso_spring.demo.documents.Lancamento
import org.springframework.data.domain.PageRequest

interface LancamentoService {

    fun buscarPorFuncionarioId(funcionarioId: String, pageRequest: PageRequest) : Lancamento

    fun buscarPorId(id: String): Lancamento?

    fun persistir(lancamento: Lancamento): Lancamento

    fun remover(id: String)
}