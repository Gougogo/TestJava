package com.goumi.generic;

/**
 * @version 1.0
 * @auther GouMi
 */
public class ObjectTest {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();

    }
}

class Tiger<E>{
    E e;

    public Tiger() {
        System.out.println(e.getClass());
    }

    public Tiger(E e) {
        this.e = e;
        System.out.println(e.getClass());
    }
}
