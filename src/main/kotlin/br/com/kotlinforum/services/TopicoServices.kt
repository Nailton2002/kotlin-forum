package br.com.kotlinforum.services

import br.com.kotlinforum.dto.NovoTopicoForm
import br.com.kotlinforum.modelo.Topico
import br.com.kotlinforum.view.TopicoView
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class TopicoServices(private var topicos: List<Topico> = ArrayList(),
                     private val cursoService: CursoService,
                     private val usuarioService: UsuarioService) {

    fun listar(): List<TopicoView> {
        return topicos.stream().map { t -> TopicoView (
            id = t.id,
            titulo = t.titulo,
            mensagem = t.mensagem,
            dataCriacao = t.dataCriacao,
            status = t.status
                )}.collect(Collectors.toList())
    }

    fun buscarPorId(id: Long): TopicoView {
        val topico = topicos.stream().filter{t -> t.id == id}.findFirst().get()
        return TopicoView(
            id = topico.id,
            titulo = topico.titulo,
            mensagem = topico.mensagem,
            dataCriacao = topico.dataCriacao,
            status = topico.status
        )
    }

    fun cadastrar(dto: NovoTopicoForm) {

        topicos = topicos.plus(Topico(
            id = topicos.size.toLong() + 1,
            titulo = dto.titulo,
            mensagem = dto.mensagem,
            curso = cursoService.buscarPorId(dto.idCurso),
            autor = usuarioService.buscarPorId(dto.idAutor)
        ))
    }
}