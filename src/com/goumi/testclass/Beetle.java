package com.goumi.testclass;

import static net.mindview.util.Print.print;

class Insert {
    private int i = 9;
    protected int j;
    Insert(){
        print("i=" + i+", j=" +j);
        j = 39;
    }
    private  int x1 = printInit("static Insect.x1 initialized");

    static int printInit(String s){
        print(s);
        return 47;
    }
}

public class Beetle extends Insert{
    private int k = printInit("Beetle.k initialized");
    public Beetle(){
        print("k = " + k);
        print("j = " + j);
    }

    private  int x2 = printInit("static Bettle.x2 initialized");

    public static void main(String[] args) {
        print("Beetle constructor");
        Beetle b = new Beetle();
        print(b.x2);
    }
}
