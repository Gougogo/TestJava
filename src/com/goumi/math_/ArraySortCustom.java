package com.goumi.math_;

import java.util.Comparator;

/**
 * @version 1.0
 * @auther GouMi
 */
public class ArraySortCustom {
    public static void main(String[] args) {

    }

    public static void bubble01(int[] arr){
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    public static void bubble02(int[] arr, Comparator c){
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length-1-i; j++){
                if(c.compare(arr[j], arr[j+1])>0){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}
