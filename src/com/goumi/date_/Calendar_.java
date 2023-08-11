package com.goumi.date_;

import java.util.Calendar;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Calendar_ {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();

        System.out.println(instance.get(Calendar.YEAR));
        System.out.println(instance);

    }
}
