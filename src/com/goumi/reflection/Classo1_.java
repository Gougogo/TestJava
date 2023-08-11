package com.goumi.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Classo1_ {
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Cat cat = new Cat();
        Class<?> aClass = Class.forName("com.goumi.reflection.Cat");
        Class<?> aClass1 = Class.forName("com.goumi.reflection.Cat");

        System.out.println(aClass.getName());

        Cat cat1 = (Cat)aClass.newInstance();
        Field age = aClass.getField("age");
        System.out.println(age.get(cat1));

        age.set(cat1, "19");
        System.out.println(age.get(cat1));

        System.out.println(aClass.hashCode() == aClass1.hashCode());

        Class<? extends Cat> aClass2 = cat.getClass();
        Class<?> aClass3 = cat.getClass().getClassLoader().loadClass("com.goumi.reflection.Cat");
        System.out.println(aClass2.hashCode()==aClass3.hashCode());

        Constructor<?> constructor = aClass.getConstructor(String.class, String.class);
        Cat helloCity = (Cat)constructor.newInstance("helloCity", "19");
        System.out.println(helloCity);
        helloCity.hi();

        Field sex = aClass.getDeclaredField("sex");
        sex.set(null, "boy");

        System.out.println(sex.get(aClass));

        Method method = aClass.getMethod("cry", String.class);
        Object invoke = method.invoke(cat, "goumi");
        System.out.println(invoke);


    }
}
