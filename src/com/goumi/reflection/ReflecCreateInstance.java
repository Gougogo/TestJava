package com.goumi.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflecCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //无参构造
        Class aClass = Class.forName("com.goumi.reflection.User");
        Object o = aClass.newInstance();
        System.out.println(o);

        //有参构造
        Constructor constructor = aClass.getConstructor(String.class);
        Object hsp = constructor.newInstance("hsp");
        System.out.println("hsp" + hsp);

        Constructor declaredConstructor = aClass.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        Object hsd = declaredConstructor.newInstance("hsd", 212);

        System.out.println("hsd" + hsd);

    }
}

class User{
    private int age = 10;
    private String name = "韩顺平教育";

    public User(){

    }

    public User(String name){
        this.name = name;
    }

    private User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "User [age=" + age + ", name" + name + "]";
    }
}
