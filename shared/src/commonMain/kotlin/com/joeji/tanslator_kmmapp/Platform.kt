package com.joeji.tanslator_kmmapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform