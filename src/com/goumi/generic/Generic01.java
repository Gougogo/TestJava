package com.goumi.generic;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

/**
 * @version 1.0
 * @auther GouMi
 */
@SuppressWarnings({"all"})
public class Generic01 {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog(100, 10));
        dogs.add(new Dog(100, 10));
        //dogs.add(new Cat());


        for (Dog o : dogs) {
            Dog dog = (Dog) o;
            System.out.println(dog.getAge());
        }

        int num = 123456;


        System.out.println(Integer.reverse(num));
    }

    @Test
    void testA(){
        System.out.println("asd");
    }
}
class Dog<E>{
    E name;
    int age;

    public Dog(E name, int age) {
        this.name = name;
        this.age = age;

        System.out.println(name.getClass());
    }
    public E getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

class Cat{ }
