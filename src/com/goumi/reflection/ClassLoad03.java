package com.goumi.reflection;

public class ClassLoad03 {
    public static void main(String[] args) {

    }
}

class B{
    static {
        System.out.println("B 静态代码块执行");
        num = 30;
    }

    static int num = 100;

    public B(){
        System.out.println("B() 构造器被执行");
    }
}
