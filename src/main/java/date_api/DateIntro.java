package date_api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateIntro {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        LocalDateTime localDate = LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy  hh:mm:ss a");

        String value = localDate.format(dateTimeFormatter);

        System.out.println(value);
    }
}
