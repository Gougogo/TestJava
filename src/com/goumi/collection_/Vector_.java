package com.goumi.collection_;

import java.util.Vector;

/**
 * @version 1.0
 * @auther GouMi
 */
@SuppressWarnings({"all"})
public class Vector_ {
    public static void main(String[] args) {
        Vector objects = new Vector(10, 2);

        for (int i = 0; i < 10; i++) {
            objects.add("asd");
        }


        objects.add("asd");
        objects.add("asd");
        objects.add("asd");
    }
}
