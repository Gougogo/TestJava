package com.goumi.designpatterns.decoratorpattern.decoratorpattern02;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Test03 {
    public static void main(String[] args) {
        Person03 xc = new Person03("苟秘");
        AAA aaa = new AAA(xc);
        BBB bbb = new BBB(aaa);
        bbb.Show();
    }
}

class Person03 {
    private String name;
    public Person03(){

    }

    public Person03(String name){
        this.name = name;
    }

    public void Show(){
        System.out.print("装扮的" + name);
    }
}

class AAA extends Person03{
    private Person03 person;

    public AAA(Person03 person) {
        this.person = person;
    }

    public void Show(){
        System.out.print("AAA");
        person.Show();
    }
}

class BBB extends Person03{
    private Person03 person;

    public BBB(Person03 person) {
        this.person = person;
    }

    public void Show(){
        System.out.print("BBB");
        person.Show();
    }
}
