package com.curso_spring.demo.services.Impl

import com.curso_spring.demo.documents.Empresa
import com.curso_spring.demo.repositories.EmpresaRepository
import com.curso_spring.demo.services.EmpresaService
import org.springframework.stereotype.Service

@Service
class EmpresaServiceImpl(val empresaRepository: EmpresaRepository) : EmpresaService {
    override fun buscarPorCnpj(cnpj: String): Empresa? = empresaRepository.findBycnpj(cnpj)

    override fun persistir(empresa: Empresa): Empresa = empresaRepository.save(empresa)

}