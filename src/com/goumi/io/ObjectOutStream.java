package com.goumi.io;

import java.io.*;

/**
 * @version 1.0
 * @auther GouMi
 */
public class ObjectOutStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filePath = "out/data.det";

        TestObject aa = new TestObject("xiao", 20);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeInt(100);
        oos.writeObject(aa);


        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
        System.out.println(ois.readInt());
        Object o = ois.readObject();
        System.out.println(ois);
        TestObject testObject = (TestObject) o;
        System.out.println(testObject.getName());
    }
}

class TestObject implements Serializable {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "TestObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
