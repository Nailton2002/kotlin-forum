package br.com.kotlinforum.view

import br.com.kotlinforum.modelo.StatusTopíco
import java.time.LocalDateTime

data class TopicoView(
    //SÓ O QUE VAI SER MOSTRADO NA TELA PARA O USUARIO
    val id: Long?,
    val titulo: String,
    val mensagem: String,
    val status: StatusTopíco,
    val dataCriacao: LocalDateTime
)
