package com.goumi.generic;

import java.util.*;

/**
 * @version 1.0
 * @auther GouMi
 */
public class GenericTest {
    public static void main(String[] args) {
        HashSet<Stu> students = new HashSet<Stu>();
        students.add(new Stu("jack", 18));
        students.add(new Stu("tom", 19));
        students.add(new Stu("marry", 28));

        HashMap<String  , Stu> hm = new HashMap<>();
        hm.put("milan", new Stu("milan", 12));
        hm.put("milan", new Stu("smith", 28));
        hm.put("milan", new Stu("goumi", 29));

        Set<Map.Entry<String, Stu>> entries = hm.entrySet();
        Iterator<Map.Entry<String, Stu>> iterator = entries.iterator();
    }
}

class Stu{
    String name;
    int age;

    public Stu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
