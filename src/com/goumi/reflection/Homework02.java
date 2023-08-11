package com.goumi.reflection;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Homework02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IOException {

        Class<?> fileClass = Class.forName("java.io.File");
        Constructor<?>[] declaredConstructor = fileClass.getDeclaredConstructors();
        for (int i = 0; i < declaredConstructor.length; i++) {
            System.out.println(declaredConstructor[i]);
        }

        Constructor<?> declaredConstructor1 = fileClass.getDeclaredConstructor(String.class);
        String fileAllPath = "d:\\mynew.txt";
        Object o = declaredConstructor1.newInstance(fileAllPath);
        Method createNewFile = fileClass.getMethod("createNewFile");
        createNewFile.invoke(o);

        File file = new File("d:\\mynew1.txt");
        file.createNewFile();

    }
}
