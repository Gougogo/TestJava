package com.goumi.generic;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Test {
    public static void main(String[] args) {

        Apple<String, Integer, Double> apple = new Apple<>();
        apple.fly(10);
        apple.fly(new Dog1());

    }
}

class Dog1{}

class Apple<T,R,M>{ 
    public<E> void fly(E e){
        System.out.println(e.getClass().getSimpleName());
    }


    public <U>void eat(U u){}

    public void run(M m){}
}

