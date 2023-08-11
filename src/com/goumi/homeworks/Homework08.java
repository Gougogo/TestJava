package com.goumi.homeworks;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Homework08 {
    public static void main(String[] args) {
        try {
            String resultStr = reverseStr("abcdef", 1000, 85);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }

    public static String reverseStr(String str, int start, int end){
        /*if(!(str!=null && start >= 0 && start < end && end < str.length())){
            throw new RuntimeException("参数不正确");
        }*/
        if (str == null){
            throw new NullPointerException("传入参数为空");
        }else if(start < 0) {
            throw new RuntimeException("起始位置不能为负数");
        }else if (start >= end){
            throw new RuntimeException("start必须小于end");
        }else if(end >= str.length()){
            throw new RuntimeException("终止位置不能超过str的最后一位");
        }

        char[] chars = str.toCharArray();
        char tmp = ' ';
        for (int i = start, j = end; i < j; i++,j--) {
            tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
        }

        System.out.println(chars);
        return chars.toString();
    }
}
