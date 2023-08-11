package com.goumi.collection_;

import java.util.Hashtable;
import java.util.Map;

/**
 * @version 1.0
 * @auther GouMi
 */
@SuppressWarnings({"all"})
public class HashTable_ {
    public static void main(String[] args) {
        Map table = new Hashtable<>();
        table.put(null, "a");
        table.put("2", "b");
        table.put("3", "c");
        table.put("4", "d");
        table.put("5", "e");


        System.out.println(table);

    }
}
