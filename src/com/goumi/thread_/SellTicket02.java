package com.goumi.thread_;

/**
 * @version 1.0
 * @auther GouMi
 */
public class SellTicket02 {
    public static void main(String[] args) {
        SellTicket2 sellTicket01 = new SellTicket2();
        Thread thread01 = new Thread(sellTicket01);
        thread01.start();
        Thread thread02 = new Thread(sellTicket01);
        thread02.start();
        Thread thread03 = new Thread(sellTicket01);
        thread03.start();
    }
}

class SellTicket2 implements Runnable{

    public static int ticketNum = 10;

    boolean loop = true;

    @Override
    public synchronized void run() {
        while (loop){
            sell();
        }
    }

    public void sell(){
        if (ticketNum<=0){
            System.out.println("售票结束");
            loop = false;
            return;
        }

        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("窗口 " + Thread.currentThread().getName()+ " 售出一张票" + " 剩余票数="
        + (--ticketNum));
    }
}
