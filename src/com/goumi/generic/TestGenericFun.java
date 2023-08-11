package com.goumi.generic;

/**
 * @version 1.0
 * @auther GouMi
 */
public class TestGenericFun {
    public static void main(String[] args) {
        AAA aaa = new AAA();
        aaa.test("asd", 1000);
    }
}

class AAA{
    <A, B> void test(A a, B b){
        System.out.println(a.getClass());
        System.out.println(b.getClass());
    }
}
