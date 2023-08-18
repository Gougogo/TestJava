package com.goumi.testclass;

public class StringTest {
    public static void main(String[] args) {
        //String str1 = new String("asd");
        //String str2 = new String("asd");

        String str1 = "asd";
        String str2 = "asd";

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        if (str1.equals(str2)){
            System.out.println("equals true");
        }else{
            System.out.println("equals false");
        }

        if (str1 == str2){
            System.out.println("== true");
        }else{
            System.out.println("== false");
        }

        StaticTest staticTest = new StaticTest();
        staticTest.test();
        StaticTest.test();

    }
}

class StaticTest{
    public static int num = 522;
    public static void test(){
        System.out.println("asd");
    }
}
