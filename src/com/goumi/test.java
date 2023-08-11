package com.goumi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person{
    Person(){

    }
    public String name;
    public String age = "45";

    public void setName(String name) {
        this.name = name;
    }
}

class Son1 extends Person{
    private String age = "12";
}

class A{
    A(){
        System.out.println("a");
    }

    A(String name){
        System.out.println("a name");
    }
}

class B extends A{
    B(){
        this("abc");
        System.out.println("b");
    }

    B(String name){
        System.out.println("b name");
    }
}

public class test {
    /*
     a b c d e
     0 1 2 3 4
     i
     strSize = 5

     e d c b a
   i 0 1 2 3 4
   j = strSize - i - 1
   j 4 3 2 1 0


     */
    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        String testStr = sc.nextLine();

        String[] testSplit = testStr.split(" ");

        for (int i = 0; i < testSplit.length; i++) {

            System.out.print(testSplit[testSplit.length - i -1]);
            System.out.print(" ");
        }*/

/*        double test = 1/2;
        System.out.println(test);*/

        Person person = new Person();
        person.name = "has";
        Person person1 = new Person();
        person1.name = "has";

        System.out.println(person.name.equals(person1.name));
        System.out.println(person.name == person1.name);
        System.out.println(person.name == "has");

        String asd = new String("asd");
        String asd1 = new String("asd");
        System.out.println(asd1 == asd);

        String a = "abc";
        String b = "hello";
        String c = a + b;


        String s1 = "asd";
        String s2 = "qwe";
        String s3 = "asdqwe";

        System.out.println(s3 == (s1+s2).intern());

        s3 += "www";

        Son1 son1 = new Son1();

        A b1 = new B();
        System.out.println(b1 instanceof A);
        System.out.println(b1 instanceof B);


    }


}


