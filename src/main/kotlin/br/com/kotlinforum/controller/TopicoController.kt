package br.com.kotlinforum.controller

import br.com.kotlinforum.dto.NovoTopicoForm
import br.com.kotlinforum.services.TopicoServices
import br.com.kotlinforum.view.TopicoView
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/topicos")
class TopicoController (private val service: TopicoServices){

    @GetMapping
    fun listar(): List<TopicoView> {
        return service.listar()
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): TopicoView {
        return service.buscarPorId(id)
    }


    @PostMapping
    fun cadastrar(@RequestBody dto: NovoTopicoForm){
        service.cadastrar(dto)
    }
}