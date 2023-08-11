package com.goumi.homeworks;

import java.util.Locale;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Homework10 {
    public static void main(String[] args) {
        printName("Han shun ping");
    }

    public static void printName(String str){
        if (str == null){
            System.out.println("字符串不能为空");
            return;
        }
        String[] s = str.split(" ");

        if(s.length != 3){
            System.out.println("输入格式不正确");
            return;
        }

        String format2 = String.format("%s%s", s[2].substring(0, 1).toUpperCase(), s[2].substring(1));
        String format0 = String.format("%s%s", s[0].substring(0, 1).toUpperCase(), s[0].substring(1));

        String format = String.format("%s,%s .%c", format2, format0, s[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
