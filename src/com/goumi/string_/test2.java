package com.goumi.string_;

/**
 * @version 1.0
 * @auther GouMi
 */
public class test2 {
    public static void main(String[] args) {
        String str1=new StringBuilder("7845").append("ganji").toString();
        System.out.println(str1.intern() == str1);

        String str2=new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);

        String str3=new StringBuilder("58").append("ganji").toString();
        System.out.println(str3.intern() == str3);

        String b = new String("asd");
        System.out.println(b == b.intern());

        StringBuffer stringBuffer = new StringBuffer();
    }
}
