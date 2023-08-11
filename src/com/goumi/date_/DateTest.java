package com.goumi.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @version 1.0
 * @auther GouMi
 */
public class DateTest {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat yyyy = new SimpleDateFormat("yyyy");
        System.out.println(yyyy.format(date));

        Date date1 = new Date(9999999999999L);
        System.out.println(date1);

        String s = "1996年01月02日";
        Date parse = yyyy.parse(s);
        System.out.println(yyyy.format(parse));

    }
}

