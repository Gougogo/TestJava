package com.goumi.designpatterns.decoratorpattern.decoratorpattern02;

/**
 * @version 1.0
 * @auther GouMi
 */

public class Test{
    public static void main(String[] args) {
        Person xc = new Person("蔡哥");
        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();
        Shoes shoes = new Shoes();

        tShirts.Decorate(xc);
        bigTrouser.Decorate(tShirts);
        shoes.Decorate(bigTrouser);


        shoes.Show();
    }
}


class Person {
    private String name;
    public Person(){

    }

    public Person(String name){
        this.name = name;
    }

    public void Show(){
        System.out.print("装扮的" + name);
    }
}

class Finery extends Person{

    protected Person component;

    public void Decorate(Person component){
        this.component = component;
    }

    @Override
    public void Show() {
        if (component != null){
            component.Show();
        }
    }
}

class TShirts extends Finery{
    @Override
    public void Show() {
        System.out.print("大T恤");
        super.Show();
    }
}

class BigTrouser extends Finery{
    @Override
    public void Show() {
        System.out.print("垮裤");
        super.Show();
    }
}

class Shoes extends Finery{
    @Override
    public void Show() {
        System.out.print("大头皮鞋");
        super.Show();
    }
}
