package br.com.kotlinforum.services

import br.com.kotlinforum.modelo.Curso
import br.com.kotlinforum.modelo.Topico
import br.com.kotlinforum.modelo.Usuario
import org.springframework.stereotype.Service
import java.util.Arrays

@Service
class TopicoServices(private var topicos: List<Topico>) {

    init {
        val topico = Topico(
            id = 1,
            titulo = "Dúvidas com Kotlin",
            mensagem = "Metodos em kotlin",
            curso = Curso(id = 1, nome = "Kotlin", categoria = "Desenvolvimento"),
            autor = Usuario(id = 1, nome = "José Nailton", email = "nailton@email.com")
        )
        val topico1 = Topico(
            id = 2,
            titulo = "Dúvidas com Kotlin e java",
            mensagem = "Metodos em kotlin igual ao java",
            curso = Curso(id = 2, nome = "Kotlin", categoria = "Desenvolvimento em kotlin"),
            autor = Usuario(id = 2, nome = "José Nailton", email = "nailton@email.com")
        )
        topicos = Arrays.asList(topico, topico1)
    }

    fun listar(): List<Topico> {
        return topicos
    }

    fun buscarPorId(id: Long): Topico {
        return topicos.stream().filter({t -> t.id == id}).findFirst().get()
    }
}