package org.henry1479.util

import java.time.LocalDate
import java.time.format.TextStyle
import java.util.*

class LocalDateService {
    companion object {
        fun getRuShortWeekDay(localDate: LocalDate):String {
            val dayOfWeek = localDate.dayOfWeek
            val ru = Locale("ru", "Ru")
            return dayOfWeek.getDisplayName(TextStyle.SHORT, ru)
        }
    }
}