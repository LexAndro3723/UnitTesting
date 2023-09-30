package ru.dz.unittesting

import java.time.LocalTime

interface Clock {
    fun getCurrentTime(): LocalTime
}

class TimeFormatter(private val clock: Clock) {
    fun getTimeOfTheDay(): String {
        val d22 = LocalTime.of(22, 0, 0)
        val d6 = LocalTime.of(6, 0, 0)
        val d = clock.getCurrentTime()
        //val d = LocalTime.now()
        if (d.isAfter(d6) && d.isBefore(d22)) {
            return "день"
        } else
            return "ночь"
    }
}
