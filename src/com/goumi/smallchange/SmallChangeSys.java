package com.goumi.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        boolean loop = true;
        String key = "";
        Scanner scanner = new Scanner(System.in);

        //2.查看操作明细
        String details = "明细为:";
        //3.收益入账
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        //4.消费
        String note = "";

        do {
            System.out.println("=========零钱通菜单============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退       出");

            System.out.print("请选择(1-4): ");
            key = scanner.next();

            switch (key){
                case "1":
                    //System.out.println("1 零钱通明细");
                    System.out.println(details);
                    break;
                case "2":
                    System.out.print("收益入账金额:");
                    money = scanner.nextDouble();
                    if (money <= 0){
                        System.out.println("收益入账金额需要大于0");
                        break;
                    }

                    balance+=money;
                    date = new Date();
                    details+="\n收益入账:+" + money + "\t入账时间:" + sdf.format(date) + "\t入账余额:" + balance;
                    //System.out.println("2 收益入账");
                    break;
                case "3":
                    //System.out.println("3 消费");
                    System.out.print("消费金额:");
                    money = scanner.nextDouble();
                    if (money <= 0 || money > balance){
                        System.out.println("消费金额需要在0-" + balance);
                        break;
                    }

                    balance-=money;

                    System.out.print("消费说明:");
                    note = scanner.next();
                    date = new Date();
                    details+="\n" + note + ":\t-" + money + "\t入账时间:" + sdf.format(date) + "\t入账余额:" + balance;
                    break;
                case "4":
                    String choice = "";
                    while (true) { //要求用户必须输入y/n ,否则就一直循环
                        System.out.println("你确定要退出吗? y/n");
                        choice = scanner.next();
                        if ("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }

                    //当用户退出while ,进行判断
                    if (choice.equals("y")) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("选择有误");
            }
        }while (loop);

        System.out.println("---------退出了零钱通---------");
    }
}
