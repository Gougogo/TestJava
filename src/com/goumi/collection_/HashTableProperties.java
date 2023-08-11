package com.goumi.collection_;

import java.util.Properties;

/**
 * @version 1.0
 * @auther GouMi
 */
@SuppressWarnings({"all"})
public class HashTableProperties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("john", 100);
        properties.put("lucy", 100);
        properties.put("lic", 100);
        properties.put("lic", 88);

        properties.put("asd", new Dog("goumi"));

        System.out.println(properties);

        System.out.println(properties.get("lucy"));

        System.out.println(properties.getProperty("asd"));


    }
}
