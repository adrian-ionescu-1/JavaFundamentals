package datetime;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeExample {

    public static void main(String[] args) {

        LocalDateTime current = LocalDateTime.now();
        System.out.println(current);
        String format = current.getDayOfMonth() + "/" + current.getMonth() + "/" + current.getYear()
                +" " + current.getHour() + ":" + current.getMinute() + ":" + current.getSecond();
        System.out.println(format);

        LocalDateTime anotherDateTime = LocalDateTime.of(2023, Month.APRIL, 21, 16, 35, 24, 0);
        System.out.println(anotherDateTime.plusHours(2));
    }

}
