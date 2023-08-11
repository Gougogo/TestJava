package com.goumi.math_;


import java.util.Arrays;
import java.util.Comparator;

/**
 * @version 1.0
 * @auther GouMi
 */
public class MathMethod {
    public static void main(String[] args) {
        Integer arr[] = {1, -1, 8, -5, 100};


        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        String d = "ab" + "c";

        System.out.println(a==d);

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2- o1;
            }
        });
    }
}

interface MyInterface {
    void doSomething();
}

class OuterClass {
    private int value = 10;

    public void doSomething() {
        MyInterface obj = new MyInterface() {
            @Override
            public void doSomething() {
                System.out.println("value = " + value);
            }
        };
        obj.doSomething();
    }

    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        obj.doSomething();
    }
}
