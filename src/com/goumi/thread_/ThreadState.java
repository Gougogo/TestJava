package com.goumi.thread_;

/**
 * @version 1.0
 * @auther GouMi
 */
public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        System.out.println(t2.getName() + "开始状态为：" + t2.getState());
        t2.start();

        while (Thread.State.TERMINATED != t2.getState()){
            System.out.println(t2.getName() + "中间状态为：" + t2.getState());
            Thread.sleep(500);
        }

        System.out.println(t2.getName()+"结束状态为："+t2.getState());
    }
}

class T2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hi" + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
