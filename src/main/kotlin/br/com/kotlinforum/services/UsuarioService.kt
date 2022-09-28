package br.com.kotlinforum.services

import br.com.kotlinforum.modelo.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class UsuarioService (var usuarios: List<Usuario>){

    init {
        val usuario = Usuario(id = 1, nome = "Nailton", email = "nailton@email.com")
        usuarios = Arrays.asList(usuario)
    }

    fun buscarPorId(id: Long): Usuario {
        return usuarios.stream().filter({ a -> a.id == id }).findFirst().get()
    }
}
