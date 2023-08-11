package com.goumi.template_;

abstract public class Template {
    public abstract void job();

    public void calculateTime(){
        //得到开始时间
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("执行时间:" + (end - start));
    }
}
