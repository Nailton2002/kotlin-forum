package br.com.kotlinforum.controller

import br.com.kotlinforum.modelo.Curso
import br.com.kotlinforum.modelo.Topico
import br.com.kotlinforum.modelo.Usuario
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Arrays

@RestController
@RequestMapping (value = arrayOf("/topicos"))
class TopicoController {

    @GetMapping
    fun listar(): List<Topico> {

        val topico = Topico(
           id = 1,
           titulo = "Dúvidas com Kotlin",
           mensagem = "Metodos em kotlin",
           curso = Curso(id = 1, nome = "Kotlin", categoria = "Desenvolvimento"),
            autor = Usuario(id = 1, nome = "José Nailton", email = "nailton@email.com")
        )
        return Arrays.asList(topico)
    }
}