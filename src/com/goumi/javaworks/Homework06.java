package com.goumi.javaworks;

public class Homework06 {
    public static void main(String[] args) {
        /**
         * 输出1-100之间的不能被5整除的数，每5个一行
         * 思路分析
         * 1.第一眼看到每5个一行，说明需要有一个计数器控制是否打印换行符
         * 2.外层是一个循环对1-100进行遍历
         * 3.被5整除，使用模运算，看结果是否为0
         */
        int num = 100;
        int count = 0;
        while (num >=1){
            if (num%5 != 0){
                System.out.print(num+"\t");

                count++;
            }
            if (count%5 == 0){ //count%5或许更好，最后count的值就是一共输出的个数
                System.out.println("");
                //count = 0;
            }
            num--;
        }
        System.out.println(count);

        for (int i = 0; i <= 'z'-'a'; ++i)
            System.out.print((char)('a' + i) + " ");

        for (int i = 0; i <= 'Z'-'A'; ++i)
            System.out.print((char)('Z' - i) + " ");
        //我这种办法没有老师的简介，说明没有彻底理解字符就是整数，那么就可以放到for循环里作为迭代表达式

        for (char c1 = 'a'; c1 <= 'z'; c1++){
            System.out.print(c1 + " ");
        }

        for (char c1 = 'Z'; c1 >= 'A'; c1--){
            System.out.print(c1 + " ");
        }


    }
}

