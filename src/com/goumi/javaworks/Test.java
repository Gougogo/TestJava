package com.goumi.javaworks;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        double temperature_1 = (100.25-1)*5/9;
//        double temperature_2 = 5/9*(100.25-1);
//        System.out.println(temperature_1+" " + '\n' + temperature_2);
//        int x = 5;
//        int y = 5;
//        if(x++==6 && ++y==6){
//            x = 11;
//        }
//        System.out.println("x="+x+",y="+y);
//
//        int x1 = 5, y1 = 5;
//        if (x1++==5 || ++y1==5){
//            x1 = 11;
//        }
//        System.out.println("x="+x1+",y="+y1);

//        int a = 10;
//        ++a;
//        System.out.println(a);
//        System.out.println(a++);
//        boolean x = true;
//        if(x = false)
//            System.out.println("xxxx");
//        boolean y = false;
//        short z = 46;
//        if((z++ == 46) && (y = true)) z++;
//        if((x=false) || (++z == 49)) z++;
//        System.out.println("z=" + z);

//        int i = 66;
//        System.out.println(-10.4%3);
//        int n2 = 2000;
//        byte b1 = (byte)n2;
//        System.out.println(b1);
        //00000010
        //00000011
        //00000001
        //System.out.println(i);

        String str = "asd";
        switch (str){
            default:
                System.out.println("default");
                //break;
            case "asd":
                System.out.println("ok");
                break;
        }
        ArrayList list = new ArrayList();
        list.add(1);
        int i = (int) list.get(0);
    }
}
