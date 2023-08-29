package com.goumi.designpatterns.strategyparttern;


import java.util.Scanner;

/**
 * @version 1.0
 * @auther GouMi
 */
public class ShoppingCashier02 {
    private static double totalPrice = 0;

    public static void calcuteAndShow(int num, double price){
        int discount = getDiscount();
        switch (discount){
            case 9:
                totalPrice += num * price * 0.9;
                break;
            case 8:
                totalPrice += num * price * 0.8;
                break;
            case 7:
                totalPrice += num * price * 0.7;
                break;
            default:
                totalPrice += num * price;
        }
        System.out.println(totalPrice);
    }

    public static int getDiscount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入要打得折扣");
        String s = scanner.nextLine();
        return Integer.parseInt(s);
    }


    public static void main(String[] args) {
        calcuteAndShow(1, 12);
    }
}
