package com.goumi.javaworks;

//import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Homework08 {
    /*
    求出1-1/2+1/3-1/4....1/100
    思路分析：
    1.首先里面肯定涉及循环
    2.规律是相邻2个数字分之一的差，再求各个结果的和
    3.循环的是什么呢？x = x + y，(1-1/2)+(1/3-1/4)....1/100
    其中的y就是括号括起来的内容，循环的就是y
    4.y怎么表示呢？循环多少次呢？
    循环100/2次，y = 1/i - 1/i+1，下一次循环i应该为多少呢？应该为i+2
     */

    public static void main(String[] args) {
        float finalSum = 0;
        for (int i = 1; i <= 100; i+=2){
            //Test
            System.out.print(1/(float)i+" "+(1/(float)(i+1)));
            finalSum+=(1/(float)i - (1/(float)(i+1)));
            System.out.println("");
        }
        System.out.println(finalSum);
    }
}
