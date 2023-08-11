package com.goumi.generic;

import java.util.HashMap;

/**
 * @version 1.0
 * @auther GouMi
 */
public class GenericTest02 {
    public static void main(String[] args) {

        Tiger02<Double, String, Integer> john = new Tiger02<>("john");
        john.setT(Double.parseDouble("15.1"));

        Tiger02 john01 = new Tiger02("john~~~");
        john01.setT("asd");
        System.out.println(john01.getT());

        String name = "asd";
        Integer n1 = 100;
        Integer.reverse(n1);

        StringBuilder asd = new StringBuilder("asd");
        System.out.println(asd.reverse());

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();

    }
}

class Tiger02<T, R, M>{
    String name;
    R r;
    M m;
    T t;

    T[] ts;

    public Tiger02(String name){
        this.name = name;
    }

    public Tiger02(R r, M m, T t) {
        this.r = r;
        this.m = m;
        this.t = t;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        System.out.println(t.getClass());
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
