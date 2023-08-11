package com.goumi.javaworks;
class Base12{
    int count = 10;
    public void display(int b){
        System.out.println("aaaaa");
    }
}
class Sub12 extends Base12{
    int count = 20;
    public void display(int a){
        System.out.println("xxxxxxx");
    }
}
public class testOverWirte {
    public static void main(String[] args) {
        Sub12 aa = new Sub12();
        aa.display(12);
    }
}
