package com.goumi.reflection;

public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException {
        String classAllPath = "com.goumi.reflection.Car";
        Class aClass = Class.forName(classAllPath);
        System.out.println(aClass);

        Car car = new Car();
        System.out.println(car);

        System.out.println(aClass.getPackage().getName());

        System.out.println(String.class);
    }
}
