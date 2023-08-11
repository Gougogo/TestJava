package com.goumi.thread_;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Thread03 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        ThreadProxy threadProxy = new ThreadProxy(tiger);
        threadProxy.run();
    }
}

class Animal{

}

class Tiger extends Animal implements Runnable{

    @Override
    public void run() {
        System.out.println("Tiger run");
    }
}

class ThreadProxy implements Runnable{
    private Runnable target = null;

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    @Override
    public void run() {
        if (target != null)
            target.run();
    }
}
