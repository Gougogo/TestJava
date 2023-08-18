package com.goumi.designpatterns.decoratorpattern.bufferwriter_;

/**
 * @version 1.0
 * @auther GouMi
 */
public abstract class Reader_ {
    public void readFile(){
        System.out.println("读取一次文件");
    }
    public void readString(){
        System.out.println("读取一次字符串");
    }
}
