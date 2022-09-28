package br.com.kotlinforum.services

import br.com.kotlinforum.dto.NovoTopicoDto
import br.com.kotlinforum.modelo.Topico
import org.springframework.stereotype.Service

@Service
class TopicoServices(private var topicos: List<Topico> = ArrayList(),
                     private val cursoService: CursoService,
                     private val usuarioService: UsuarioService) {

    fun listar(): List<Topico> {
        return topicos
    }

    fun buscarPorId(id: Long): Topico {
        return topicos.stream().filter({t -> t.id == id}).findFirst().get()
    }

    fun cadastrar(dto: NovoTopicoDto) {

        topicos = topicos.plus(Topico(
            id = topicos.size.toLong() + 1,
            titulo = dto.titulo,
            mensagem = dto.mensagem,
            curso = cursoService.buscarPorId(dto.idCurso),
            autor = usuarioService.buscarPorId(dto.idAutor)
        ))
    }
}