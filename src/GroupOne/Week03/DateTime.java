package GroupOne.Week03;

import java.time.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now().withSecond(0).withNano(0);

        LocalTime localTime1 = LocalTime.now();
        String formattedLocalTime = localTime.format(DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(formattedLocalTime);

        LocalDate localDate = LocalDate.now();
        System.out.println("Time is: " + localTime);
        System.out.println("Date is: " + localDate.getDayOfWeek()
                + ", " + localDate.getDayOfMonth()
                + "-0" + localDate.getMonthValue()
                + "-" + localDate.getYear());

    }

}
