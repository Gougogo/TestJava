package com.goumi.polymorphic;

import static net.mindview.util.Print.print;

public class Circle extends Shape{
    public void draw(){
        print("Circle.draw()");
    }
    public void erase(){
        print("Circle.erase()");
    }
}
