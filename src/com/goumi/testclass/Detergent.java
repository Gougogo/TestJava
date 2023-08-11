package com.goumi.testclass;

import static net.mindview.util.Print.*;

class Cleaner{
    private String s = "Cleaner";
    public void append(String a) {s += a;}
    public void dilute() {append(" dilute()");}
    public void apply() {append(" apply()");}
    public void scrub() {append(" scrub()");}
    public String toString() {return s;}

    public static void main(String[] args) {
        Cleaner x = new Cleaner();
        x.dilute();
        x.apply();
        x.scrub();
        print(x);
    }
}
public class Detergent extends Cleaner{
    public void scrub(){
        append(" Detergent.scrub()");
        super.scrub();
    }
    public void foam(){
        append(" foam()");
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        print(x);
        print("Testing base class:");
        Cleaner.main(args);
    }
}
