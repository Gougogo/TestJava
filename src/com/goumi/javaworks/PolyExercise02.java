package com.goumi.javaworks;
class Base1{
    int count = 10;
    public void display(){
        System.out.println(this.count);
    }
}
class Sub1 extends Base1{
    int count = 20;
    public void display(){
        System.out.println(this.count);
    }
}
public class PolyExercise02 {
    public static void main(String[] args) {
        Sub1 ss;
        Sub1 s = new Sub1();
        System.out.println(s.count);
        s.display();

        Base1 b = s;
        System.out.println(b == s);
        System.out.println(b.count);
        b.display();
    }
}
