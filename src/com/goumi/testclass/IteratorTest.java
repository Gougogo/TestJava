package com.goumi.testclass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        Iterator<Integer> iterator = arrayList.iterator();

        while (iterator.hasNext()){
            System.out.println("enter" + iterator.next());
        }

        while (iterator.hasNext()){
            System.out.println("asd" + iterator.next());
        }
    }
}
