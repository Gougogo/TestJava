package com.goumi.javaworks;

public class Homework04 {

    public static void main(String[] args) {
        /*
        需求：已知一个升序的数组，要求插入一个元素后，该数组顺序依然是升序
        思路分析：
            1.最容易想到的方式，扩容+排序，先将数据加到数组的末端，再对新数组进行排序，但这样时间复杂度比较高
            2.既然扩容的过程中，有将原始数据拷贝到新数组的操作
              那么是不是可以在拷贝的过程中将元素查到正确的位置，也就是正确定位该元素
            3.采用第二种方式，怎么插入x呢？其实就是定位该元素的位置
                1.首先肯定要从前往后遍历原数组，因为原数组是升序的，所以当遇到当前数据大于x，说明这个位置就是x的位置
                  然后再把剩下的数据依次插到x的后面即可
                2.怎么将剩下的数据插到x的后面呢
                  这里不能在原循环里做，因为原循环里的数据相当于变为10 12 30，这是i = 2，继续循环的话，后面都变为30了，应该break
                  这个时候应该记录下i这个位置，这个位置是原数组中剩下的数据的index，也需要借这个index找到应该将剩余数据
                  从哪个位置开始插到新数组
                3.再用一个循环从index位置开始将原数组，拷贝到index+1的位置上去
                4.插最前，最后，中间，是否有变化？
         */
        int[] arr = {10, 12, 45, 90};
        int[] arrNew = new int[arr.length+1];
        int x = 100;
        int index = -1;

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] > x){
                arrNew[i] = x;
                index = i;
                break;
            }
            else{
                arrNew[i] = arr[i];
            }
        }
        System.out.println(index);
        if (index != -1) {
            for (int i = index; i < arr.length; ++i) {
                arrNew[i + 1] = arr[i];
            }
        }else{
            arrNew[arrNew.length-1] = x;
        }

        arr = arrNew;
        for (int i = 0; i < arr.length; ++i){
            System.out.print(arr[i]+" ");
        }
    }
}
