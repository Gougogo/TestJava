package com.goumi.polymorphic;

import static net.mindview.util.Print.print;

public class Triangle extends Shape{
    public void draw(){
        print("Triangle.draw()");
    }

    public void erase(){
        print("Triangle.erase()");
    }
}
