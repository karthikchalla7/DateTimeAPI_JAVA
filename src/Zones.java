import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Dealin with different time Zones

 we have ZoneDateTime,ZoneId
 */
public class Zones {

    public static void main(String[] args) {

        //setting the date time
        LocalDateTime datetime = LocalDateTime.of(2024,07,04,15,30);

        //setting the zone to zurich
        ZoneId zurich = ZoneId.of("Europe/Zurich");
        //we can also use gmt and utc like
//        ZoneId rome = ZoneId.of("GMT+2");
//        ZoneId seattle = ZoneId.of("UTC-7");
        //get the time zone to set to the pc running the app/java
        ZoneId systemzone = ZoneId.systemDefault();
        System.out.println("system zone "+systemzone);

        //setting the zone to denver,usa
        ZoneId denver = ZoneId.of("GMT-6");

        //mapping the date and time with the zone
        ZonedDateTime zurichtime = ZonedDateTime.of(datetime,zurich);

        //what was the time in denver when the time is this much in zurich?
        ZonedDateTime denvertime = zurichtime.withZoneSameInstant(denver);

        System.out.println("zurich time "+zurichtime);
        System.out.println("Denver time "+denvertime);

        //lets use withzonesameinstant fucntion more and find the current date and time based on our region
        //this function converts time from one zone to another zone
        ZoneId mytimezone = ZoneId.systemDefault();
        ZoneId seoul = ZoneId.of("GMT+9");
        ZoneId seattle = ZoneId.of("UTC-7");

        LocalDateTime currdatetime = LocalDateTime.now();
        ZonedDateTime currdatetimezone = ZonedDateTime.of(currdatetime,mytimezone);


        ZonedDateTime currzurich = currdatetimezone.withZoneSameInstant(zurich);
        ZonedDateTime currseoul = currdatetimezone.withZoneSameInstant(seoul);
        ZonedDateTime currseattle = currdatetimezone.withZoneSameInstant(seattle);

        System.out.println("current date and time "+ currdatetimezone);
        System.out.println("current date and time in zurich "+currzurich);
        System.out.println("current date and time in seoul "+currseoul);
        System.out.println("current date and time in seattle "+currseattle);

        //it is also possible if you want to extract only the date or time using
        //toLocalDate() and toLocalTime()
        System.out.println(currseattle.toLocalTime());




    }

}
