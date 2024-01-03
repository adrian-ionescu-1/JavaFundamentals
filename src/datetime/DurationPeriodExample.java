package datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DurationPeriodExample {

    public static void main(String[] args) {
        LocalDateTime pastDateTime = LocalDateTime.of(2013, Month.APRIL, 17, 21, 13, 30, 0);
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("Durata dintre trecut si prezent este: " + Duration.between(pastDateTime, currentDateTime));
        System.out.println("Perioada dintre trecut si prezent este: " + Period.between(pastDateTime.toLocalDate(), currentDateTime.toLocalDate()));

        System.out.println(Duration.ofHours(87708).toDays());
        System.out.println(Period.ofMonths(3).withDays(15).withYears(5));

        System.out.println("--------------------------------------------");

        String dateTimeFormat = currentDateTime.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss a"));
        System.out.println(dateTimeFormat);

        String pastDateTimeFormat = pastDateTime.format(DateTimeFormatter.ofPattern("hh:mm a, yyyy/MMM/dd"));
        System.out.println(pastDateTimeFormat);
    }
}
