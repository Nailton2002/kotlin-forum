package br.com.kotlinforum.dto

data class NovoTopicoDto(

    val titulo: String,
    val mensagem: String,
    val idCurso: Long,
    val idAutor: Long
)