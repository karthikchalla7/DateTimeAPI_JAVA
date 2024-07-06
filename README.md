## Java 8 Date-Time API Learning Project

### Overview

This project demonstrates my understanding and application of the Java 8 Date-Time API. It covers various aspects of working with dates, times, time zones, and locales in Java.


### 1. Creating Dates and Times

- Using `LocalDate`, `LocalTime`, and `LocalDateTime`:
  - `LocalDate.now()`, `LocalDate.of()`, `LocalDate.parse()`
  - `LocalTime.now()`, `LocalTime.of()`, `LocalTime.parse()`
  - `LocalDateTime.now()`, `LocalDateTime.of()`, `LocalDateTime.parse()`
- Working with time zones using `ZonedDateTime`:
  - `ZonedDateTime.now()`, `ZonedDateTime.of()`, `ZonedDateTime.parse()`

### 2. Parsing and Formatting

- Using `DateTimeFormatter` for custom date and time formats:
  - `DateTimeFormatter.ofPattern()`
- Parsing strings to date/time objects:
  - `LocalDate.parse()`, `LocalTime.parse()`
- Formatting date/time objects to strings:
  - `LocalDate.format()`, `LocalTime.format()`

### 3. Date and Time Arithmetic

- Adding to dates and times:
  - `plusDays()`, `plusMonths()`, `plusYears()`
  - `plusHours()`, `plusMinutes()`, `plusSeconds()`
- Subtracting from dates and times:
  - `minusDays()`, `minusMonths()`, `minusYears()`
  - `minusHours()`, `minusMinutes()`, `minusSeconds()`

### 4. Calculating Durations and Periods

- Using `Duration` for time-based amounts:
  - `Duration.between()`
- Using `Period` for date-based amounts:
  - `Period.between()`

### 5. Comparing Dates and Times

- Methods for comparison:
  - `isBefore()`, `isAfter()`, `isEqual()`

### 6. Handling Time Zones

- Working with different time zones:
  - `ZoneId.of()`
  - `ZonedDateTime.now()`
  - `ZonedDateTime.withZoneSameInstant()`

### 7. Locales

- Understanding and using the `Locale` class for internationalization

## Resources
- [Recommended](https://chamalwr.medium.com/datetime-api-in-java-2aef5df1c39b)
- [Java 8 Date-Time API Documentation](https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html)
- [Oracle's Date-Time Tutorial](https://docs.oracle.com/javase/tutorial/datetime/)
