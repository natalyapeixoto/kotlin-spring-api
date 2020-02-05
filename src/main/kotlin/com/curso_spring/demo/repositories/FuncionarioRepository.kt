package com.curso_spring.demo.repositories

import com.curso_spring.demo.documents.Funcionario
import org.springframework.data.mongodb.repository.MongoRepository

interface FuncionarioRepository : MongoRepository<Funcionario, String> {

    fun findByEmail(email: String) : Funcionario

    fun findByCpf(cpf : String) : Funcionario

}