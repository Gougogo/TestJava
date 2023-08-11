package com.goumi.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @version 1.0
 * @auther GouMi
 */
public class ListExercise {
    public static void main(String[] args) {
        String str = "hello";
        List strings = new ArrayList<>();

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            strings.add(chars[i]);
        }

        System.out.println(strings);

        strings.add(str);
        strings.add(1, "韩顺平教育");
        System.out.println(strings);

        strings.get(4);
    }
}
