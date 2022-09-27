package br.com.kotlinforum.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping (value = arrayOf("/ola"))
class ControllerHello {

    @GetMapping
    fun hello(): String {

        return "Olá mundo !"

    }
}