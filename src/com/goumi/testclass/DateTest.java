package com.goumi.testclass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = simpleDateFormat.parse("2021-04-14 15:33:40");
        String s = parse.toString();
        System.out.println(parse);
        System.out.println(s);

        System.out.println(parse.getTime());
    }
}
