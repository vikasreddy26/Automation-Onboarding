package java8;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.TimeZone;

public class DateTime {
    public static void main(String[] args) {
        String timeFormat = "hh:mm:ss.SSS a zzzz";
        TimeZone timeZone = TimeZone.getTimeZone("US/Eastern");
        DateFormat dateFormat = new SimpleDateFormat(timeFormat);
        Calendar cal = Calendar.getInstance(timeZone);
        dateFormat.setTimeZone(cal.getTimeZone());
        String currentTime = dateFormat.format(cal.getTime());
        System.out.println(currentTime);

        LocalDate dob = LocalDate.of(1996,01,26);
        System.out.println("You are " + calculateAge(dob) + " years old.");

    }
    public static int calculateAge(LocalDate dob) {
        LocalDate curDate = LocalDate.now();
        if ((dob != null) && (curDate != null)) {
            return Period.between(dob, curDate).getYears();
        } else {
            return 0;
        }
    }
}
