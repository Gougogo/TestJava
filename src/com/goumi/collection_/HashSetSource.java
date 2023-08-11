package com.goumi.collection_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @version 1.0
 * @auther GouMi
 */
public class HashSetSource {
    public static void main(String[] args) {
        HashSet<Object> objects = new HashSet<>();
        objects.add(new Dog("1"));
        objects.add(new Dog("11"));
        objects.add(new Dog("111"));
        objects.add(new Dog("1111"));
        objects.add(new Dog("11111"));
        objects.add(new Dog("2"));
        objects.add(new Dog("22"));
        objects.add(new Dog("222"));
        objects.add(new Dog("2222"));
        objects.add(new Dog("22222"));
        objects.add(new Dog("222222"));

        System.out.println(objects);
    }
}

class AAA{
    String name;

    public AAA(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AAA{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Dog{
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(1);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}