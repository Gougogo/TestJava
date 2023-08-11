package com.goumi.reflection;

import java.lang.reflect.Field;

public class ReflectionUtils {
    public static void main(String[] args) throws ClassNotFoundException {
        Class aClass = Class.forName("com.goumi.reflection.Person");
        System.out.println(aClass.getSimpleName());

        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            //System.out.println(field.getName());
        }

        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }

    }
}

class A{
    public String body;

}

class Person extends A{
    public String name;
    protected int age;
    String job;
    private double sal;

    public void m1(){

    }

    protected void m2(){

    }

    void m3(){

    }

    private void m4(){

    }
}
