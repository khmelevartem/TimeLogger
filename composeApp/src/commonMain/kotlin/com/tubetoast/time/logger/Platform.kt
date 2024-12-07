package com.tubetoast.time.logger

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform