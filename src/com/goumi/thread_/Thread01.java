package com.goumi.thread_;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        new Cat().start();
        //new Cat().run();

        System.out.println("主线程");
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
        }
    }
}

class Cat extends Thread{
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(Thread.currentThread().getName());
                System.out.println("Cat线程");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
