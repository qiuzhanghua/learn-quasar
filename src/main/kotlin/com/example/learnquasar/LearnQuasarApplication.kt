package com.example.learnquasar

import co.paralleluniverse.fibers.Fiber
import co.paralleluniverse.fibers.Suspendable
import co.paralleluniverse.kotlin.fiber
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
class LearnQuasarApplication

fun main(args: Array<String>) {
    SpringApplication.run(LearnQuasarApplication::class.java, *args)

    println("----------------------------------")

    val fiber: Fiber<String> = fiber @Suspendable {
        "* fiber fiber fiber fiber fiber fiber fiber fiber fiber *"
    }

    println(fiber.get())

//    val ntf = Fiber<Int>(SuspendableRunnable {
//        99
//    }).start()
//    这种语法错误
//    val v: Int = ntf.get(1000, TimeUnit.MILLISECONDS)
//
//    println(v)

    fiber @Suspendable {
        println("*****************************************")
    }
}
