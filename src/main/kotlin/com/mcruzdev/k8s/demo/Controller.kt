package com.mcruzdev.k8s.demo

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RequestMapping("/apps")
@RestController
class Controller {

    @GetMapping
    fun get(name: String): ResponseEntity<App> {
        val prefix = Optional.ofNullable(System.getenv("PREFIX")).orElse("DEFAULT")
        return ResponseEntity.ok(App("$prefix:$name"))
    }
}

data class App(val name: String)