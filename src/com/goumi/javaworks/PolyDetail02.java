package com.goumi.javaworks;

public class PolyDetail02 {
    public static void main(String[] args) {
        Base base = new Sub();
        System.out.println(base.count);
        double d = 13.4;
        long l = (long)d;

        int in = 5;
        //boolean b = (boolean) in;

        Object obj1 = new Integer(5);
        Object objStr = (String)obj1;
        Integer str1 = (Integer)obj1;

    }
}

class Base{
    int count = 10;
}

class Sub extends Base{
    int count = 20;
}
