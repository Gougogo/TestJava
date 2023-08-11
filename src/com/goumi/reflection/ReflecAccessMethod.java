package com.goumi.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflecAccessMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class aClass = Class.forName("com.goumi.reflection.Boss");
        Object o = aClass.newInstance();
        Method say = aClass.getMethod("say", int.class, String.class, char.class);
        Object invoke = say.invoke(o, 15, "asd", 's');
        System.out.println(invoke);
    }
}
class Boss{
    public int age;
    private static String name;
    public Boss(){

    }
    public String say(int n, String s, char c){
        return n + " " + s + " " + c;
    }

    public void hi(String s){
        System.out.println("hi" + s);
    }
}
