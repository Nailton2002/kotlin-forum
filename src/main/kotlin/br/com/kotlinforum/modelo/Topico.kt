package br.com.kotlinforum.modelo

import java.time.LocalDateTime

data class Topico (

    val id: Long? = null,
    val titulo: String,
    val mensagem: String,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
    val curso: Curso,
    val autor: Usuario,
    val status: StatusTopíco = StatusTopíco.NAO_RESPONDIDO,
    val respostas: List<Resposta> = ArrayList()
)