package br.com.kotlinforum.services

import br.com.kotlinforum.modelo.Curso
import br.com.kotlinforum.modelo.Topico
import br.com.kotlinforum.modelo.Usuario
import org.springframework.stereotype.Service
import java.util.Arrays

@Service
class TopicoServices(private var topicos: List<Topico> = ArrayList()) {

    fun listar(): List<Topico> {
        return topicos
    }

    fun buscarPorId(id: Long): Topico {
        return topicos.stream().filter({t -> t.id == id}).findFirst().get()
    }

    fun cadastrar(topico: Topico) {
        topicos.plus(topico)
    }
}