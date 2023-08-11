package com.goumi.reflection;

import java.lang.reflect.Field;

public class ReflectionAccessProperty {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class aClass = Class.forName("com.goumi.reflection.Student");
        Object o = aClass.newInstance();
        Field age = aClass.getField("age");
        age.set(o, 88);

        //System.out.println(age.getInt(o));

        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o, "asd");

        Field sex = aClass.getDeclaredField("sex");
        sex.set(o, "1");

        System.out.println(o);
    }
}

class Student {
    public int age;
    private String name;
    public static String sex;

    public Student(){

    }

    public String toString(){
        return "Student [age=" + age + ", name=" + name + ", sex=" + sex + "]";
    }
}
