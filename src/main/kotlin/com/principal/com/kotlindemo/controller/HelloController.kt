package com.principal.com.kotlindemo.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("hello")
    fun sayHello(@RequestParam name: String): ResponseEntity<String> {
        return ResponseEntity.ok("hello $name")
    }

    @GetMapping("goodbye")
    fun sayGoodbye(@RequestParam name: String): ResponseEntity<String> {
        return ResponseEntity.ok("goodbye $name")
    }
}