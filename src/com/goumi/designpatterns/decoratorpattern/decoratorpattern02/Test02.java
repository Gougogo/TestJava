package com.goumi.designpatterns.decoratorpattern.decoratorpattern02;

/**
 * @version 1.0
 * @auther GouMi
 */

public class Test02{
    public static void main(String[] args) {
        Person2 xc = new Person2("蔡哥");
    }
}


class Person2 {
    private String name;
    private Finery2[] finery2;

    public void setFinery2(Finery2[] finery2) {
        this.finery2 = finery2;
    }

    public Person2(String name){
        this.name = name;
    }

    public void Show(){
        for (Finery2 finery21 : finery2) {
            finery21.Show();
        }

    }
}

abstract class Finery2{
    abstract public void Show();
}

class TShirts2 extends Finery2{
    @Override
    public void Show() {
        System.out.print("大T恤");
    }
}

class BigTrouser2 extends Finery2{
    @Override
    public void Show() {
        System.out.print("垮裤");
    }
}

class Shoes2 extends Finery2{
    @Override
    public void Show() {
        System.out.print("大头皮鞋");
    }
}
