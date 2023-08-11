package com.goumi.reflection;

public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Cat cat = new Cat();
        Class aClass1 = Class.forName("com.goumi.reflection.Cat");
        Class aClass2 = Class.forName("com.goumi.reflection.Cat");

        System.out.println(aClass1.getPackage().getName());

        System.out.println(aClass1.hashCode());
        System.out.println(aClass2.hashCode());
    }
}
