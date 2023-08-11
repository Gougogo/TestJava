package com.goumi.interface_;

public class InterfaceExercise02 {
}

interface A{
    int x = 10000;
}

class B{
    int x = 1;
}

class C extends B implements A{
    public void pX(){
        System.out.println(A.x + super.x);
    }

    public static void main(String[] args) {
        new C().pX();
    }
}