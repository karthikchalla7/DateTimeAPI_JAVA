import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

//operations in date time API
public class operations {

    public static void main(String[] args) {
        /**

         since localdate,localtime,localdatetime are immuttable objects
         so we cant apply operations but it is neccesray to add,subtract,ranges and calculations for date and time
         java has provided operations for the objects
         for add we can use plusYears() plusMonths() plus.Hours()
         similarly for minus()
         To compare there are methods like isBefore(), isAfter() and isEqual() to check against another date


         */

        LocalDateTime curr = LocalDateTime.now();
        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();

        //similary we can use minus() for all the below
        LocalDateTime futureDateTime = curr
                .plusYears(1) //add one year to the current date and time
                .plusMonths(2)
                .plusDays(2) // add two days
                .plusHours(3)
                .plusMinutes(30)
                .plusSeconds(60)
                .plusNanos(10); //add three more hours

        System.out.println("FutureDatetime "+futureDateTime);

        //using isBefore() and isAfter() methods
        boolean isBefore = futureDateTime.isBefore(curr); //false
        boolean isAfter = futureDateTime.isAfter(curr);

        System.out.println("Isbefore "+isBefore);
        System.out.println("Isafter "+isAfter);
    }
}
