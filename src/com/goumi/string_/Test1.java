package com.goumi.string_;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Test1 {
    String str = new String("asd");
    final char[] ch = {'j', 'a', 'v', 'a'};

    public void change(String str, char ch[]){
        str = "java";
        ch[0] = 'h';
    }
    public static void main(String[] args) {
        Test1 ex = new Test1();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str + " and ");
        System.out.println(ex.ch);


        StringBuffer stringBuffer = new StringBuffer();


    }
}
