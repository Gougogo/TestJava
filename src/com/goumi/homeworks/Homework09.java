package com.goumi.homeworks;

import java.util.Scanner;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Homework09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String userName = scanner.next();


        System.out.println(userName.length());



        System.out.println("请输入密码");
        String passWord = scanner.next();


    }

    public static void userRegister(String userName, String pwd, String email){
        int userLength = userName.length();
        if(userLength < 2 || userLength > 4)
            throw new RuntimeException("用户名长度有问题");

        int pwdLength = pwd.length();

        if (pwdLength != 6 || new IntegerCheck().isDigital(pwd)){
            throw new RuntimeException("密码的长度为6，要求全是数字");
        }
    }
}

class IntegerCheck implements CheckStrIsDigital {
    @Override
    public boolean isDigital(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}

class CharChek implements CheckStrIsDigital {

    @Override
    public boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9')
                return false;
        }
        return true;
    }
}
