package com.goumi.testclass;

public class RegexTest {
    public static void main(String[] args) {
        String str = "uid,start,endflow";
        if (str.matches(".*?(,).*?(,).*?(,).*?"))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
