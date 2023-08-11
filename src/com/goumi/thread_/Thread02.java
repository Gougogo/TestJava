package com.goumi.thread_;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();
    }
}

class Dog implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("Dog线程");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
