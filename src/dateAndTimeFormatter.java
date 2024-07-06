import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

public class dateAndTimeFormatter {

    public static void main(String[] args) {

        /**
         * Formatting and parsing date time

         we might need to represent them in a strandard way according to the time zone
         java.util.Locale is the class supported in java environment to represent the languages and countries
         after setting the locale to format the time into the local format
         java comes with the java.time.format.DateTimeFormatter which proivdes the aiblity to present the date time vlaues in a custom way


         */
        Locale uslocale = new Locale("en","US");
        Locale lklocale = new Locale("si","LK");
        Locale jplocale = new Locale("ja");
        Locale delocale = new Locale("de","CH");
        Locale hilocale = new Locale("hi", "IN"); // Hindi in India

        LocalDate today = LocalDate.now();

        DateTimeFormatter usdatetime = DateTimeFormatter.ofPattern("EEEE MMM dd yyyy",uslocale);
        DateTimeFormatter lkdatetime = DateTimeFormatter
                .ofLocalizedDate(FormatStyle.LONG)
                .localizedBy(lklocale);
        DateTimeFormatter jpdatetime = DateTimeFormatter
                .ofPattern("EEEE yyyy dd MMM",jplocale);
        DateTimeFormatter dedatetime = DateTimeFormatter
                .ofLocalizedDate(FormatStyle.MEDIUM)
                .localizedBy(delocale);
        DateTimeFormatter hidatetime = DateTimeFormatter
                .ofPattern("EEEE yyyy dd MMM",hilocale);

        String localus = today.format(usdatetime);
        String localhi = today.format(hidatetime);
        String localjp = today.format(jpdatetime);
        String localde = today.format(dedatetime);

        System.out.println(localde);
        System.out.println(localhi);
        System.out.println(localjp);
        System.out.println(localus);

    }
}
