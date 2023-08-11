package com.goumi.interfacetest;

/**
 * @version 1.0
 * @auther GouMi
 */
public class DefaultTest {
    public static void main(String[] args) {
        AAA.testStatic();
        new Test().testDefault();
    }
}

class Test implements AAA{
    void test(){
        testDefault();
    }
}

interface AAA{
    default void testDefault(){
        System.out.println("Default");
    }

    static void testStatic(){
        System.out.println("Static");
    }
}
