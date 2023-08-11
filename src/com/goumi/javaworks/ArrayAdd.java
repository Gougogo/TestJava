package com.goumi.javaworks;

import java.util.Scanner;

public class ArrayAdd {
    public static void main(String[] args) {
        /*
        要求实现动态数组扩容
        思路分析：
        化繁为简：先静态添加，再动态添加
        1.因为数组是定长的，所以扩容不是直接在数组后面添加元素，而是新申请一块内存空间，然后将原数组拷贝到新空间中
        步骤：
            1.定义初始数组
            2.定义一个新数组，数组大小是原始数组大小+1
            3.循环遍历原始数组，并将原始数组值拷贝到新数组中
            4.将新数组的尾位置值设置为所添加的元素
            5.将原始数组的引用指向新数组，原始数组内存空间将被释放
         */
        int[] arrOriginal = {11,22,33,44};
        int[] arrNew = new int[arrOriginal.length+1];
        for (int i = 0; i < arrOriginal.length; ++i){
            if (arrOriginal.length > arrNew.length)
                break;
            arrNew[i] = arrOriginal[i];
        }
        arrNew[arrNew.length - 1] = 4;
        arrOriginal = arrNew;

        for (int i = 0; i < arrOriginal.length; ++i){
            System.out.println(arrOriginal[i]);
        }

        /*
        动态扩容：用户可以通过输入决定是否继续添加，添加成功，是否继续？
        思路分析：
            1.创建一个Scanner可以接受用户输入
            2.因为用户在添加成功后，可能还要继续添加，所以需要循环结构，
              因为是要先输入之后，再进行循环，所以可以使用do-while循环
              循环结束条件就是当用户输入否的时候
         */
        Scanner myScanner = new Scanner(System.in);
        int[] arrOriginal_2 = {11,22,33,44};
        do {
            int[] arrNew_2 = new int[arrOriginal_2.length+1];
            for (int i = 0; i < arrOriginal_2.length; ++i){
                if (arrOriginal_2.length > arrNew_2.length)
                    break;
                arrNew_2[i] = arrOriginal_2[i];
            }
            System.out.println("请输入你要添加的元素：");
            int addNum = myScanner.nextInt();
            arrNew_2[arrNew_2.length - 1] = addNum;
            arrOriginal_2 = arrNew_2;

            for (int i = 0; i < arrOriginal_2.length; ++i){
                System.out.println(arrOriginal_2[i]);
            }
            System.out.println("是否继续添加元素 y/n？");
            char key = myScanner.next().charAt(0);
            if (key == 'n')
                break;
        }while (true);
    }
}
