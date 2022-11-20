package ru.netology

fun main() {
    val ourNumber = 1380
    fun hoursText(seconds: Int): String {
        val hours = seconds / 3600
        val remnant1 = hours % 10
        val remnant2 = hours / 10 % 10
        return when {
            remnant1 == 1 && remnant2 != 1 -> "час"
            remnant1 == 2 || remnant2 == 3 || remnant1 == 4 && remnant2 != 1 -> "часа"
            else -> "часов"
        }
    }

    fun minutesText(seconds: Int): String {
        val minutes = seconds / 60
        val remnant1 = minutes % 10
        val remnant2 = minutes / 10 % 10
        return when {
            remnant1 == 1 && remnant2 != 1 -> "минуту"
            remnant1 == 2 || remnant1 == 3 || remnant1 == 4 && remnant2 != 1 -> "минуты"
            else -> "минут"
        }
    }
    fun correctText(seconds: Int): String {
        val minutes = seconds / 60
        val hours = seconds / 3600
        return when {
            seconds < 61 -> "только что"
            seconds > 60 && seconds <= 60 * 60 -> " $minutes " + minutesText(seconds) + " назад"
            seconds > 60 && seconds <= 24 * 60 * 60 -> " $hours " + hoursText(seconds) + " назад"
            seconds > 24 * 60 * 60 && seconds <= 24 * 60 * 60 * 2 -> " вчера"
            seconds > 24 * 60 * 60 * 2 && seconds <= 24 * 60 * 60 * 3 -> " позавчера"
            else -> " давно"
        }
    }
    val finalFrase = "был(а)" + correctText(ourNumber)
    println(finalFrase)

}