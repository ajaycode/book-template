package com.book

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BookApplication

// tag::mainMethod[]
fun main(args: Array<String>) {
    runApplication<BookApplication>(*args)
}
