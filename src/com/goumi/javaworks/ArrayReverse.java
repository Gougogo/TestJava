package com.goumi.javaworks;

public class ArrayReverse {



    /*
      1 2 3 4 5 6
      firstIndex = 0 lastIndex = 5 reverseData(0, 5)
      firstIndex = 1 lastIndex = 4 reverseData(1, 4)
      firstIndex = 2 lastIndex = 3

     */
    static void reverseData(int arr[], int firstIndex, int lastIndex)
    {
        if (firstIndex+1 < arr.length / 2)
            reverseData(arr, firstIndex+1, lastIndex-1);

        int tmp = arr[firstIndex];
        arr[firstIndex] = arr[lastIndex];
        arr[lastIndex] = tmp;

        for (int i = 0; i < arr.length; ++i)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*
        arr {11, 22, 33, 44, 55, 66} => {66, 55, 44, 33, 22, 11}
        思路分析：
        1.数据怎么存储
            反转前后都应该存在一个数组里面，因为只是交换数组中的数据
        2.化繁为简
            1.整个数据涉及多个数据的交换，很复杂，那么简单一点，是否可以交换2个数据来实现呢？
              对比前后2个数组中数据的位置，发现11和66交换，22和55交换，也就是说
              第i个位置和第length - 1 - i个位置的数据进行交换，就可以达到交换整个数组的功能
            2.并且循环的次数，应该是length/2
            3.2个数据的交换，需要用一个临时变量进行保存
            4.注意点当为奇数的时候，是否会有问题？没有比如length=5，i为2，
              这个时候交换的是第三个数和第三个数，相当于自己交换自己，只是效率比较低
        3.思考
            1.如果循环超过length/2，结果会是怎样？
              比如5个数据，第一个位置为i = 3，第二个位置为length - 1 - i = 1，
              这就会导致本来已经交换的第二个值和倒数第二个值，又交换回来了
         */
        int[] arr = {11,22,33,44,55,66};
        int tmp = 0;
        int length = arr.length;
        for (int i = 0; i < length/2; ++i){
            tmp = arr[i];
            arr[i] = arr[length-1-i];
            arr[length-1-i] = tmp;
        }

        for (int i = 0; i < length; ++i)
            System.out.print(arr[i]+ " ");

        /*
        逆序赋值
        思路分析：
        arr {11, 22, 33, 44, 55, 66} => {66, 55, 44, 33, 22, 11}
        66和55交换：11, 22, 33, 44, 66, 55
        66和44交换：11, 22, 33, 66, 44, 55
        66和33交换：11, 22, 66, 33, 44, 55
        66和22交换：11, 66, 22, 33, 44, 55
        66和11交换：66, 11, 22, 33, 44, 55
        这样就将66放到了第一位，
        然后55进行类似的操作，直到交换完所有数据。
        1.还是需要用到2个数的交换
        2.还是需要用到循环，而且是2次循环，外层循环是对每个数据的循环，内层循环是对单个数据的交换
        3.外层循环怎么循环？循环几次？循环length-1次
        4.内层循环怎么循环？交换几次？第一个数交换length-1次，第二个数循环length-2，第三个数循环length-3，
          也就是第几个数，就交换length-i-1次
        5.可以从前往后循环，也可以从后往前循环
         */
        int[] arr2 = {11, 22, 33, 44, 55, 66, 77, 88};
        int tmp2 = 0;
        for (int i = 0; i < arr2.length-1; ++i){
            for (int j = 0; j < arr2.length-i-1; ++j){
                tmp2 = arr2[j];
                //1 0 2 3 4 5     0
                //1 2 0 3 4 5     1
                //1 2 3 0 4 5     2
                //1 2 3 4 0 5     3
                //1 2 3 4 5 0     4
                arr2[j] = arr2[j+1];
                arr2[j+1] = tmp2;
            }
        }
        for (int i = 0; i < arr2.length; ++i)
            System.out.print(arr2[i]+ " ");

        int[] arr3 = {11, 22, 33, 44, 55, 66, 77};
        System.out.println();
        reverseData(arr3, 0, arr3.length-1);
    }
}
