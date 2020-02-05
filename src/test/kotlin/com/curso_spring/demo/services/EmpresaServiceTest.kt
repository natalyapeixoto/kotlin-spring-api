package com.curso_spring.demo.services

import com.curso_spring.demo.documents.Empresa
import com.curso_spring.demo.repositories.EmpresaRepository
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.BDDMockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.data.mongo.AutoConfigureDataMongo
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean

@SpringBootTest
@AutoConfigureDataMongo
class EmpresaServiceTest {

    @Autowired
    val empresaService: EmpresaService? = null
    
    @MockBean
    private val empresaRepository: EmpresaRepository? = null
    
    private val CNPJ = "90909090909090"
    private fun empresa(): Empresa = Empresa("Razao Social", CNPJ, "1")
    
    @BeforeEach
    @Throws(Exception::class)
    fun setUp() {
        BDDMockito.given(empresaRepository?.findBycnpj(CNPJ)).willReturn(empresa())
        BDDMockito.given(empresaRepository?.save(empresa())).willReturn(empresa())
    }
    
    @Test
    fun testBuscarEmpresaPorCnpj() {
        val empresa: Empresa? = empresaService?.buscarPorCnpj((CNPJ))
        Assertions.assertNotNull(empresa)
    }

    @Test
    fun testPersistirEmpresa() {
        val empresa: Empresa? =  empresaService?.persistir(empresa())
        Assertions.assertNotNull(empresa)
    }

}

