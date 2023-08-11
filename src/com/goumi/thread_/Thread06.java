package com.goumi.thread_;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Thread06  {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.start();

        t.setPriority(Thread.MIN_PRIORITY);

        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("hi");
        }

        t.interrupt();
    }
}

class T extends Thread{
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "吃包子" + i);
            }

            System.out.println(Thread.currentThread().getName() + "休眠中");
            try {
                Thread.sleep(2000000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "被interrupt了");
            }
        }
    }
}
