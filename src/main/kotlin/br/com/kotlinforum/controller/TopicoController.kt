package br.com.kotlinforum.controller

import br.com.kotlinforum.modelo.Curso
import br.com.kotlinforum.modelo.Topico
import br.com.kotlinforum.modelo.Usuario
import br.com.kotlinforum.services.TopicoServices
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Arrays

@RestController
@RequestMapping (value = arrayOf("/topicos"))
class TopicoController (private val service: TopicoServices){

    @GetMapping
    fun listar(): List<Topico> {
        return service.listar()
    }
}