package com.goumi.thread_;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Thread07 {
    public static void main(String[] args) throws InterruptedException {
        T1 t1 = new T1();
        t1.start();


        for (int i = 0; i < 20; i++) {
            System.out.println("hi");
            Thread.sleep(1000);
            if (i >= 5)
                t1.join();
        }
    }
}

class T1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
