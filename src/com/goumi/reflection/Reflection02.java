package com.goumi.reflection;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflection02 {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
            m1();
            m2();
    }
    //传统方法调用

    public static void m1(){
        Cat cat = new Cat();
        //currentTimeMillis这个方法能获取当前的一个时间
        long start = System.currentTimeMillis();
        for (int i = 0; i < 90000000; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("m1耗时="+(end-start));
    }
    //反射方法调用
    public static void m2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class aClass = Class.forName("com.goumi.reflection.Cat");
        Object cat = aClass.newInstance();
        Method hi = aClass.getMethod("hi");

        //currentTimeMillis这个方法能获取当前的一个时间
        long start = System.currentTimeMillis();
        for (int i = 0; i < 90000000; i++) {
            hi.invoke(cat);
        }
        long end = System.currentTimeMillis();
        System.out.println("m2耗时="+(end-start));
    }
}
