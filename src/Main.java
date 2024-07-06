
import java.time.*;

/**
 * Date and Time API in java basics

 The new data and time was introduced in java 8
 issues before java 8

 1.poor design and inconsistancies
 They are designed poorly and 'date' was mutualbe which made it unsafe for use in multithreaded environments
 The 'Calender' was complex and not easy to use

 2.lack of thread safety

 3.inconsistent offset handling
 the date class did not handle time zones effectively.
 leading to confusion and errors when dealing with offsets and time zones

 4.Limited functionality
 the old API lacked many useful features such as duraction,perios and operations for comparing dates and time

 5.Formatting and parsing
 data formatting and parsing required the use of java.text.SimpleDataFormat which was not thread safe

 Improvements in java 8:
 new data and time API under the java.time.*

 1.immutability and thread safety
 the new data-time classes(LocalDate,LocalTime,LocalDateTime,ZonedDateTime) are immutable and thread safe

 2.clear and consistent API
 new API is fluent and easy to use and understand

 3.Separation of Date and Time
 The new API seperates date(LocalDate),time(LocalTime), and date-time(LocalDateTime)
 this reduces confusion and potential errors

 4.Better time zone handling
 the 'ZonedDateTime' class provides handling different time zones
 the new API includes methods for handling durations,periods and some caluculations

 5.parsing and formatting
 the 'DateTimeFormatter' class provides a thread safe way to format and parse date time objects

 */
public class Main {
    public static void main(String[] args) {



    }
}