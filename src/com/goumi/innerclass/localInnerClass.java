package com.goumi.innerclass;

public class localInnerClass {
    public static void main(String[] args) {

    }
}

class Outer02{
    int n1 = 100;
    private void m2(){
        System.out.println("Outer02 m2()");
    }
    public void m1(){
        final class Inner02{
            public void f1(){
                m2();
            }
        }
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }

    public void m3(){
    }
}