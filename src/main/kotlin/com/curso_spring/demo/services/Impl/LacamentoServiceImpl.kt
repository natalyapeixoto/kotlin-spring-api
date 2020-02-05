package com.curso_spring.demo.services.Impl

import com.curso_spring.demo.documents.Lancamento
import com.curso_spring.demo.repositories.LancamentoRepository
import com.curso_spring.demo.services.LancamentoService
import org.springframework.data.domain.PageRequest

class LacamentoServiceImpl(val lancamentoRepository: LancamentoRepository) : LancamentoService {
    override fun buscarPorFuncionarioId(funcionarioId: String, pageRequest: PageRequest): Lancamento {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buscarPorId(id: String): Lancamento? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun persistir(lancamento: Lancamento): Lancamento {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun remover(id: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}