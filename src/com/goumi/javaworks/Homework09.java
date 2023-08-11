package com.goumi.javaworks;

public class Homework09 {
    public static void main(String[] args) {
//        1 2 3 4
//        1 3 6 10
        int[] arr1 = {1,2,3};
        int[] arr2;
        arr2 = arr1;
        arr2[0] = 100;
        for (int i = 0; i < arr1.length; ++i)
            System.out.println(arr1[i]);
    }
}
