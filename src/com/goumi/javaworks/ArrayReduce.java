package com.goumi.javaworks;

import java.sql.Array;
import java.util.Scanner;

public class ArrayReduce {
    public static void main(String[] args) {
        /*
        动态缩减数组，提示用户是否继续缩减，当剩下最后一个元素，提示不能再缩减
        思路分析：
        1.动态还是需要用到循环
        2.缩减还是需要新创建一个数组，长度为原数组-1，然后遍历原数组，将数据拷贝到新数组中
        3.当剩下最后一个元素的时候，不能缩减，说明循环结束条件不仅有用户不输入，还有元素个数为0的情况
         */
        Scanner myScanner = new Scanner(System.in);
        int[] arrOriginal = {11,22,33,44};
        System.out.print("原始数组为：");
        for (int i = 0; i < arrOriginal.length; ++i)
            System.out.print(arrOriginal[i]+" ");
        System.out.println("");

        do {
            //1.首先判断数组长度是否到达了1一个
            if (arrOriginal.length == 1) {
                System.out.println("数组长度为1，不能继续缩减");
                break;
            }

            //2.对数组进行缩减，并打印
            int[] arrNew = new int[arrOriginal.length - 1];
            for (int i = 0; i < arrNew.length; ++i)
                arrNew[i] = arrOriginal[i];
            arrOriginal = arrNew;
            System.out.println("数组已经缩减到"+arrNew.length+"个元素");
            System.out.print("当前数组为：");
            for (int i = 0; i < arrOriginal.length; ++i)
                System.out.print(arrOriginal[i]+" ");
            System.out.println("");

            //3.是否继续进行缩减
            System.out.println("是否继续缩减，y/n?");
            char key = myScanner.next().charAt(0);
            if(key == 'n')
                break;
        }while (true);

        int[][] arrTwoDimensional = new int[1][5];
        char strTest = 's';
    }
}
