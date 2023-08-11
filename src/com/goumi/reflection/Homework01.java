package com.goumi.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Homework01 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class<PrivateTest> privateTestClass = PrivateTest.class;
        Class<?> aClass = Class.forName("com.goumi.reflection.PrivateTest");
        if (privateTestClass.hashCode() == aClass.hashCode())
            System.out.println("ok");
        else
            System.out.println("no");

        PrivateTest o = privateTestClass.newInstance();
        Field name = privateTestClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o, "huli");
        System.out.println(o);

        Method getName = aClass.getMethod("getName");
        System.out.println(getName.invoke(o));


    }
}

class PrivateTest{
    private String name = "hellokitty";

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "PrivateTest{" +
                "name='" + name + '\'' +
                '}';
    }
}
