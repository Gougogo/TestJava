package com.goumi.datastructure;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // 集合的创建
        TreeSet<Integer> ts = new TreeSet<>();
        // 添加元素
        ts.add(1);
        ts.add(100);
        ts.add(10);
        ts.add(0);
        ts.add(15);
        ts.add(15);
        //迭代器遍历
        Iterator<Integer> it = ts.iterator();
        while(it.hasNext()){
            Integer next = it.next();
            System.out.println(next);
        }
        //增强for循环遍历
        for (Integer i:
                ts) {
            System.out.println(i);
        }

    }
}
