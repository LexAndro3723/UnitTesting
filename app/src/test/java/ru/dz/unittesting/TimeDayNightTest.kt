package ru.dz.unittesting

import org.junit.Assert.*
import org.junit.Test
import org.mockito.Mockito
import java.time.LocalTime

class TestDayNight() {

    val clock = Mockito.mock(Clock::class.java)

@Test
fun testDay() {
     Mockito.`when`(clock.getCurrentTime()).thenReturn(LocalTime.of(11, 0))//LocalTime.now()
    val DayNight = TimeFormatter(clock)
    val Day = DayNight.getTimeOfTheDay()
    assertEquals("день",Day)
    Mockito.verify(clock).getCurrentTime()
}
    @Test
    fun testNight() {
        Mockito.`when`(clock.getCurrentTime()).thenReturn(LocalTime.of(23, 0))//LocalTime.now()
        val DayNight = TimeFormatter(clock)
        val Night = DayNight.getTimeOfTheDay()
        assertEquals("ночь",Night)
        Mockito.verify(clock).getCurrentTime()
    }
}