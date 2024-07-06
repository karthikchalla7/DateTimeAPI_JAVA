import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

//Extracting and combining date time and time values
public class extract_combine {

    public static void main(String[] args) {

        LocalDate someday = LocalDate.parse("2020-12-01");
        System.out.println(someday);

        LocalTime sometime = LocalTime.parse("23:54");
        System.out.println(sometime);

        //combine time into the date- we use atTime method day.atTime(time)
        LocalDateTime somedatetime = someday.atTime(sometime);
        System.out.println("Combine someday and time "+somedatetime);

        //combine date into the time
        LocalDateTime sometimedate = sometime.atDate(someday);
        System.out.println("Combine sometime and day "+sometimedate);

        //extracting only the date from datetime
        LocalDate date = sometimedate.toLocalDate();
        System.out.println("extracting date"+date);

        //extracting only the time from datetime
        LocalTime time = somedatetime.toLocalTime();
        System.out.println("extracting time "+time);

        //extract only selected portion from date and time
        int year = somedatetime.getYear();
        Month month = somedatetime.getMonth();
        int hour = somedatetime.getHour();
        int mintue = somedatetime.getMinute();
        int second = somedatetime.getSecond();
        int nano = somedatetime.getNano();

        System.out.println("Year "+year);
        System.out.println("Month "+month);
        System.out.println("Hour "+hour);

    }
}
