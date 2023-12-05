package com.demo.test


private var enable: Boolean = true
private val string: String? by lazy {
    if (enable) {
        getT()  // No warning, but class cast exception
    } else {
        null
    }
}

fun <T> getT(): T {
    return "Hello World!" as T
}

fun main() {
    println(string)
}