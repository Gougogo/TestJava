package com.goumi.collection_;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

/**
 * @version 1.0
 * @auther GouMi
 */
@SuppressWarnings({"all"})
public class TreeSet_ {
    public static void main(String[] args) {
        treeSetCompare treeSetCompare = new treeSetCompare();
        TreeSet treeSet1 = new TreeSet<>(treeSetCompare);

        treeSet1.add(new Stu("1"));
        treeSet1.add(new Stu("4bcd"));
        treeSet1.add(new Stu("3bc"));
        treeSet1.add(new Stu("2b"));
        treeSet1.add(new Stu("5bcde"));

        System.out.println(treeSet1);

        List objects = new ArrayList<>();
        objects.add("asd");
        objects.add("asd1");
        objects.add("asd2");
        objects.add("asd3");

        System.out.println(Collections.max(treeSet1));
        System.out.println(Collections.max(objects));
    }
}

class Stu implements Comparable{
    String name;

    public Stu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        return name.length() - ((String)(((Stu)o).getName())).length();
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                '}';
    }
}

class treeSetCompare implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Stu) {
            return (((Stu)o1).getName()).length() - (((Stu)o2).getName()).length();
        }else{
            throw new RuntimeException("类型不匹配");
        }
    }
}
