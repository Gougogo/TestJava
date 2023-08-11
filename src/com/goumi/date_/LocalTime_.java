package com.goumi.date_;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Calendar;

/**
 * @version 1.0
 * @auther GouMi
 */
public class LocalTime_ {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        int i = now.get(ChronoField.HOUR_OF_DAY);
        System.out.println(i);
        System.out.println(now.getHour());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = formatter.format(now);
        System.out.println(format);

        LocalDateTime localDateTime = now.plusDays(590);
        System.out.println(localDateTime);

        String format1 = formatter.format(localDateTime);
        System.out.println(format1);


    }
}
