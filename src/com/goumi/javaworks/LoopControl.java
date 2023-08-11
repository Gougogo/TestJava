package com.goumi.javaworks;

public class LoopControl {
    //第一题：
    //0.首先要在外面定义一个变量存储这个人拥有钱的初始值money = 100000
    //1.循环退出条件可以是money < 1000，也可以是money>0，但里面需要增加交不起路费跳出的情况。
    //2.需要在外面定义一个变量，用来保存经过的路口次数
    //3.while循环里面，有一个分支判断结构来收取路费，并将money减少对应的钱数
    //4.分支判断结束后，表明此次收费完毕，路口次数+1
    public static void main(String[] args) {
        Base1 bb = new Base1();
        bb.count = 415;

        int money = 100000;
        int EnterTimes = 0;
        while(money > 0){
            if (money > 50000){
                money -= money*0.05;
            }else if (/*money <= 50000 &&*/ money >= 1000){ //money<=50000是多余的判断
                money -= 1000;
            }
            else{
                break;
            }
            EnterTimes++;
        }
        System.out.println(EnterTimes);
    }
}
