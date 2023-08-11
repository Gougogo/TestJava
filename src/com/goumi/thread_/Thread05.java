package com.goumi.thread_;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Thread05 {
    public static void main(String[] args) {
        Thread goumi1 = new Thread(new GouMi1());
        goumi1.start();


        Thread goumi2 = new Thread(new GouMi2());
        goumi2.start();

    }
}

class GouMi1 implements Runnable{

    int size = 0;
    @Override
    public void run() {
        while (size < 10){
            System.out.println(Thread.currentThread().getName());
            System.out.println("hello,world");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            size++;
        }
    }
}

class GouMi2 implements Runnable{
    int size = 0;

    @Override
    public void run() {
        while (size < 5){
            System.out.println(Thread.currentThread().getName());
            System.out.println("hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            size++;
        }
    }
}

