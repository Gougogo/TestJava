package com.goumi.designpatterns.strategyparttern;

/**
 * @version 1.0
 * @auther GouMi
 */
public class ShoppingCashier {
    private static int totalPrice = 0;
    public static void calcuteAndShow(int num, int price){
        totalPrice += num * price;
        System.out.println(totalPrice);
    }
    public static void main(String[] args) {
        calcuteAndShow(1, 12);
        calcuteAndShow(1, 12);
    }
}
