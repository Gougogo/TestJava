package com.goumi.homeworks;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Homework02 {
    public static void main(String[] args) {
        Car c = new Car();
        Car c1 = new Car(100.5);
        System.out.println(c);
        System.out.println(c1);
    }
}

class Car{
    double price = 10;
    static String color;
    public String toString(){
        return price + "\t" + color;
    }

    public Car(){
        this.price = 9;
        color = "red";
    }

    public Car(double price){
        this.price = price;
    }
}
