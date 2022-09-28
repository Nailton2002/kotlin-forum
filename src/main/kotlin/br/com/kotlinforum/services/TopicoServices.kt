package br.com.kotlinforum.services

import br.com.kotlinforum.modelo.Curso
import br.com.kotlinforum.modelo.Topico
import br.com.kotlinforum.modelo.Usuario
import org.springframework.stereotype.Service
import java.util.Arrays

@Service
class TopicoServices {

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