package com.goumi.javaworks;

//import static sun.misc.Version.print;

class ATest{
    public int i = 10;

    public int sum(){
        return getI() + sum1();
    }

    public int sum1(){
        return i + 10;
    }

    public int getI(){
        return i;
    }
}

class BTest extends ATest{
    //public int i;
    /*public int sum(){
        return i + 20;
    }*/
    public int getI(){
        return i;
    }

    public int sum1(){
        //return i + 10;

        int age = 20;



        return 52;
    }
}

public class DynamicBinding {
    public static void main(String[] args) {
        ATest a = new BTest();
        System.out.println(a.sum());
        //System.out.println(a.sum1());

        "asd".equals("asd");

        a.equals(a);
        int aHashCode = a.hashCode();

        Integer sa = 10;
        sa.equals(45);

        int i = 10;
        float d = 10.0f;
        System.out.println(i == d);
    }
}
