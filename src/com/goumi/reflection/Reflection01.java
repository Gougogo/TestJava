package com.goumi.reflection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflection01 {
    public static void main(String[] args)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, IOException, NoSuchFieldException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();

        Class aClass = Class.forName(classfullpath);
        Object o = aClass.newInstance();
        Method method1 = aClass.getMethod(method);
        method1.invoke(o);

        //因为是针对类而已的，所以不需要传入具体某个对象
        //当然这个name字符串也可以通过配置文件获取
        //但是报错了，说没有这个Field，我第一猜测觉得是访问权限的问题
        //因为name字段是一个私有的字段
        aClass.getField("name");
    }
}
