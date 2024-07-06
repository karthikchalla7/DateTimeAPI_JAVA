import java.time.*;

public class Intialize {

    public static void main(String[] args) {
        //creating dates and times
        //date
        LocalDate today = LocalDate.now();
        System.out.println("Today "+today);

        //time
        LocalTime time = LocalTime.now();
        System.out.println("Time is "+time);

        //date and time both
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println("Current Date and Time "+datetime);

        //zoneddatetime
        ZonedDateTime zone = ZonedDateTime.now();
        System.out.println("My zone time "+zone);

        //entering the date - format - (yyyy-mm-dd)
        LocalDate someday = LocalDate.of(2020, Month.JANUARY,16);
        System.out.println("someday "+someday);

        LocalDate someday1 = LocalDate.parse("2020-01-20");
        System.out.println("Someday1 "+someday1);

        LocalTime sometime = LocalTime.of(10,20);
        System.out.println("Sometime "+sometime);

        LocalTime sometime1 = LocalTime.parse("10:20:10");
        System.out.println("Sometime1 "+ sometime1);

        LocalDateTime specific = LocalDateTime.of(2020,7,8,10,30);
        LocalDateTime parsed = LocalDateTime.parse("2020-01-16T10:30");
        System.out.println("Specific "+specific);
        System.out.println("Parsed "+parsed);

        ZonedDateTime specificzone = ZonedDateTime.of(2023,12,1,10,30,0 ,0 ,ZoneId.of("Asia/Calcutta"));
        System.out.println("specificzone "+specificzone);
        ZonedDateTime parsedzone = ZonedDateTime.parse("2023-12-01T10:30-12:00[Asia/Calcutta]");
        System.out.println("Parsedzone "+parsedzone);

    }

}
