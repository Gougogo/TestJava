package com.goumi.codeblock;

class Person{
    public static int total;

    static {
        total = 100;
        System.out.println("in static block!");
    }
}

public class CodeBlockExercise01 {
    public static void main(String[] args) {
        System.out.println("total=" + Person.total);
        System.out.println("total=" + Person.total);
    }
}
