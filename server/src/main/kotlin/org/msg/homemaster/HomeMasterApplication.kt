package org.msg.homemaster

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class HomeMasterApplication

fun main(args: Array<String>) {
    runApplication<HomeMasterApplication>(*args)
}