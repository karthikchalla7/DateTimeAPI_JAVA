import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class durationAndIntstants {

    /**
     *Duration and Instant classes and methods

     Using instant class we can retrive the current timestamp includes curretn date and time and the nanoseconds
     getNano() methods only extracts the nanoseconds from the last second at the timestamp recorded

     Duration we can set a certain period of time using ofHours() and ofDays() and apply arithmetic operations
     and also converting them back to the appropriate values such as seconds,minutes and so on

     */
    public static void main(String[] args) {
        //getting the current timestamp follows GMT so+5:30
        Instant timestamp = Instant.now();
        System.out.println("Timestamp: "+timestamp);

        //zone based timestamp
        ZonedDateTime zonetimestamp = timestamp.atZone(ZoneId.of("Asia/Calcutta"));
        System.out.println("Zone time stamped "+zonetimestamp);


        //get the nan seconds from the last second
        int nano = timestamp.getNano();
        System.out.println("Nano from the last second "+nano);

        //set the duration to three hours we use the Duration class
        Duration threehours = Duration.ofHours(3);

        //subtract 20min from 3 hours and get the remaining as seconds
        long seconds = threehours.minusMinutes(20).getSeconds();

        //conver the remaining seconds to minutes
        long minutes = Duration.ofSeconds(seconds).toMinutes();

        System.out.println("3hours20min and "+seconds+"seconds");
        System.out.println("3hours20min and "+minutes+" minutes");

    }
}
