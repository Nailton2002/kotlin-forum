package br.com.kotlinforum.modelo

import java.time.LocalDateTime

data class Resposta(
    val id: Long,
    val mensagem: String,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
    val autor: Usuario,
    val solucao: Boolean
)
