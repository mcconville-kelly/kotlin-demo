package com.principal.com.kotlindemo.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class HelloController {

    @GetMapping("hello")
    fun sayHello(@RequestParam name: String): ResponseEntity<String> {
        return ResponseEntity.of(Optional.of(name))
    }
}