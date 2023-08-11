package com.goumi.wrapper;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Integer01 {
    public static void main(String[] args) {
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);
        int i = integer.intValue();
        Integer n2 = 100;

        Integer integer2 = new Integer(1);
        Integer integer3 = new Integer(1);
        System.out.println(integer2 == integer3);

        Integer m = 127;
        Integer n = 127;
        System.out.println(m == n);
    }
}
