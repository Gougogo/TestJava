package com.goumi.javaworks;

/*
    求n的阶乘，比如n为4
    4*3*2*1
*/
public class Factorial_Recursion {
    //从里向外递归实现
    static long factorial_recursion(int n){
        if(n<=0){
            return 1;
        }else{
            return n * factorial_recursion(n-1);
        }
        /*
        结果是4*3*2*1
        进到最里面执行2*1 = 2
        向外退一层：2*3 = 6
        再退一层：6*4 = 24
        最终结果是24
         */
    }
    //从外向里，迭代实现
    static long factorial_iteration(int n){
        int result = 1;
        while(n>1){
            result *= n;
            n--;
        }
        /*
        结果是result1 = 结果是result0*4 = 1*4
             result2 = 结果是result1*3 = 4*3
             result3 = 结果是result2*2 = 12*2
         */
        return result;
    }

    /*
    将奇数位置的值变为1
    思路分析：
    迭代方式：这个问题最容易的做法是使用数组的下标特性，定位到奇数位置，再使用迭代的方式找到将奇数位置的值变更
    递归方式：这个问题是否可以可以通过从里到外的方式实现？里可以定义为index最大的位置，外可以定义为index为0的位置
    怎么找奇数位置，又怎么将找到的技术位置的值变更。可以通过从里向外找，怎么进到里面去呢？数组的末尾位置是知道的，这就是里
    怎么找奇数位置，如果数组长度是奇数，那么从最后一个位置开始每次-2，得到的依然是奇数位置，如果是偶数位置，那么先
    先找到前一个计数位置，再每次-2，就能找到所有计数位置。
    怎么将奇数位置值变更。由于每次回退都能得到当前的奇数位置，应用数组下标的特性，直接将其赋值即可。
     */
    static void changeZeroToOne(int[] arr, int index){
        if (arr.length%2 != 0) {
            if (index > 0)
                changeZeroToOne(arr, index - 2);
            arr[index] = 1;
        }
        else{
            if (index%2 != 0)
                index-=1;
            if (index > 0)
                changeZeroToOne(arr, index - 2);
            arr[index] = 1;
        }
        //7 5 3 1 -1
    }

    /*
        将奇数位置的值变为1，偶数位置变为2
    */
    static void changeZeroToOneAndTwo(int[] arr, int index){
        if (arr.length%2 != 0) {
            //初始index为6
            //1 2 3 4 5 6 7
            //0 1 2 3 4 5 6
            //6 4 2 0
            // 5 3 1
            if (index > 0)
                changeZeroToOneAndTwo(arr, index - 2);
            arr[index] = 1;
            if (index != 0)
                arr[index - 1] = 2;
        }
        else{
            //初始index为7
            //1 2 3 4 5 6 7 8
            //0 1 2 3 4 5 6 7
            //index值为6 4 2 0
            //index+1值为7 5 3 1

            if (index%2 != 0)
                index-=1;
            if (index > 0)
                changeZeroToOneAndTwo(arr, index - 2);
            arr[index] = 1;
            arr[index + 1] = 2;
        }
    }
    static long fibonacci_recursion( int n )
    {
        if( n <= 2 )
            return 1;
        return fibonacci_recursion(n-1) + fibonacci_recursion(n-2);
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        //changeZeroToOne(arr, arr.length-1);
        changeZeroToOneAndTwo(arr, arr.length-1);
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        /*

        有这样一个数列：1、1、2、3、5、8、13、21、34，要求第n个位置的值
        long fibonacci_recursion( int n )
        {
            if( n <= 2 )
                return 1;
            return fibonacci_recursion(n-1) + fibonacci_recursion(n-2);
        }
        n = 5
        f(4)+f(3)
        f(3)+f(2) + f(2)+f(1)
        f(2)+1+1 +1+1
        1+1+1+1+1
         */
        System.out.println(fibonacci_recursion(8));
    }
}
