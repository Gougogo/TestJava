package com.goumi.reflection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

@SuppressWarnings("all")
public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();
        System.out.println("classfullpath=" + classfullpath);
        System.out.println("method=" + method);

        Cat cat = new Cat();
        cat.hi();

        //这句话的意思是：Class是一个类，这个类用来返回Class类型的对象，也就是aClass
        //注意这个aClass是一个Class类对象，并不是Cat类对象
        Class aClass = Class.forName(classfullpath);
        //然后再通过aClass这个对象，加载另外一个类的实例，另外一个类就是com.goumi.reflection.Cat
        Object o = aClass.newInstance();
        System.out.println(o.getClass());//通过getClass可以得到其运行类型

        Method method1 = aClass.getMethod(method);
        System.out.println(method1.toString());

        method1.invoke(o);

    }
}
