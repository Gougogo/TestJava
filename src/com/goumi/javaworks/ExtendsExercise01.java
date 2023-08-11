package com.goumi.javaworks;

class A{
    A(){
        System.out.println("a");
    }
}

class B extends A{
    B(){
        System.out.println("b");
    }
    B(String name){
        System.out.println("b name");
    }
}

class C extends B{
    public C(){
        this("hello");
        System.out.println("c1");
    }

    public C(String name){
        super("hahaha");
        System.out.println("c2");
    }
}

public class ExtendsExercise01 {
    public static void main(String[] args) {
        B c = new C();

    }
}
