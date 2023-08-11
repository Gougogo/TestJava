package com.goumi.collection_.homework;

import java.util.HashSet;
import java.util.Objects;

/**
 * @version 1.0
 * @auther GouMi
 */
@SuppressWarnings({"all"})
public class Homework02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Person p1 = new Person("AA", "1001");
        Person p2 = new Person("BB", "1002");
        hashSet.add(p1);
        hashSet.add(p2);
        System.out.println(p1.hashCode());
        p1.name = "CC";
        System.out.println(p1.hashCode());
        hashSet.remove(p1);
        System.out.println(hashSet);
        hashSet.add(new Person("CC", "1001"));
        System.out.println(hashSet);

        hashSet.add(new Person("AA", "1001"));
        System.out.println(hashSet);

        Integer test = 1000;

    }
}

class Person{
    String name;
    String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
