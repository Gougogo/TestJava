package com.goumi.innerclass;

public class AnorymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04{
    private int n1 = 10;

    public void method(){
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎哭泣");
            }
        };

        /*IA tiger = new Tiger();
        tiger.cry();*/

        new Father("test") {

            @Override
            public void test() {
                System.out.println("asdasdasd");
            }
        }.test();
    }
}

class Father{
    public Father(String name){
    }

    public void test(){
        System.out.println("test");
    }
}

interface IA{
    public void cry();
}

class Tiger implements IA{

    @Override
    public void cry() {
        System.out.println("老虎哭泣");
    }
}


