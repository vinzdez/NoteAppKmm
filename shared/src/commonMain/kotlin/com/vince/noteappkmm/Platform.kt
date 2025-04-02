package com.vince.noteappkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform