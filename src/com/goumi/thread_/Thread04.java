package com.goumi.thread_;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Thread04 {
    public static void main(String[] args) throws InterruptedException {
        Tiger01 tiger01 = new Tiger01();
        Thread thread = new Thread(tiger01);
        thread.start();

        for (int i = 0; i < 30000; i++) {
            System.out.println(i);
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
        }
    }
}

class Animal01{

}

class Tiger01 extends Animal01 implements Runnable{

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
