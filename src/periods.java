import java.time.*;
import java.lang.*;
public class periods {

    /**
     * Instants,Durations and Periods in java

     java.time.Duration - class to represent the time in nanoseconds
     java.time.Period - used to express the time in units such as year,including the distance between two times or days,
     mostly used to write business fucntions
     java.time.Instant - used to represent the instance of a time(timestamp) and better to use in logging APIs and system tasks

     we have different methods to operate like
     now(),ofX(),plusX(),minusX(),withX() and getX() where X-years,months,days,hours
     between() and isNegative() for handle distance between the point of time


     */
    public static void main(String[] args) {

        //current day
        LocalDate today = LocalDate.now();

        //christams date
        LocalDate xmas = LocalDate.of(today.getYear(), Month.DECEMBER,25);

        //calculate period left from current date to christmans

        Period howlong = Period.between(today,xmas);
        int years = (howlong.getYears());
        int months = howlong.getMonths();
        int days = howlong.getDays();

        System.out.println("Years "+years);
        System.out.println("Months "+months);
        System.out.println("Days "+days);

    }

}
