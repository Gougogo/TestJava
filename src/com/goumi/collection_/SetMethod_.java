package com.goumi.collection_;

import java.util.HashSet;

/**
 * @version 1.0
 * @auther GouMi
 */
public class SetMethod_ {
    public static void main(String[] args) {
        HashSet<Object> objects = new HashSet<>();

        System.out.println(objects.add("john"));
        System.out.println(objects.add("lucy"));
        System.out.println(objects.add("john"));
        System.out.println(objects.add("jack"));
        System.out.println(objects.add("rose"));
        objects.remove("john");

        System.out.println(objects);

        objects = new HashSet<>();
        objects.add("lucy");
        objects.add("lucy");

        objects.add(new Book("护理", "lucy", 100.0));
        objects.add(new Book("护理", "lucy", 100.0));

        objects.add(new String("hsp"));
        objects.add(new String("hsp"));



        System.out.println(objects);
    }
}
